package main

//import "github.com/veandco/go-sdl2/sdl"
import (
	"fmt"
	"github.com/veandco/go-sdl2/sdl"
		//"github.com/vean/sdl"
)


func main(){

	winWidith := 800
	winHeight := 600
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







	
sdl.Delay(2000)
}