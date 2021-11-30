package main

//import "github.com/veandco/go-sdl2/sdl"
import (
	"fmt"
	"github.com/veandco/go-sdl2/sdl"
		//"github.com/vean/sdl"
)

const winWidith int = 800
const	winHeight int = 600

type color struct{
	r,g,b byte
}


func setPixel(x, y int, c color, pixels []byte) {
	index := (y*winWidith + x) * 4
	if index < len(pixels)-4 && index >= 0 {
		pixels[index] = c.r
		pixels[index+1] = c.g
		pixels[index+2] = c.b
	}

}


func main(){

	
	if err := sdl.Init(sdl.INIT_EVERYTHING); err != nil {
		panic(err)
	}
	defer sdl.Quit()
	
	window,err := sdl.CreateWindow("Testing SDL2",sdl.WINDOWPOS_UNDEFINED,sdl.WINDOWPOS_UNDEFINED,
800,600,sdl.WINDOW_SHOWN)

if err != nil{
	fmt.Println(err)
	return 
}
defer window.Destroy()

renderer,err := sdl.CreateRenderer(window,-1,sdl.RENDERER_ACCELERATED)

if err != nil{
	fmt.Println(err)
	return
}

defer renderer.Destroy()

tex,err := renderer.CreateTexture(sdl.PIXELFORMAT_ABGR8888,sdl.TEXTUREACCESS_STREAMING,
	int32(winWidith),int32(winHeight))
	if err != nil{
		fmt.Println(err)
		return
	}
	
	defer tex.Destroy()

	pixels := make([]byte,winWidith*winHeight)

	/* test code uncomment
	for y := 0; y < winHeight; y++ {
		for x:=0; x<winWidith;x++{
			setPixel(x,y,color{byte(x%254),88,0},pixels)
		}	
	}
	*/

	tex.Update(nil,pixels,winWidith*4)
	renderer.Copy(tex,nil,nil)
	renderer.Present()

sdl.Delay(2000)
}