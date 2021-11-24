package main

import "fmt"

func sayHello(){
	fmt.Println("hello")
}

type Positin struct{
	x float32
	y float32
}

func printPosition(point *Positin){
	x := point.x
	y :=point.y
	fmt.Println("the point is(",x,y,")")
}

func main(){
	sayHello()

	//p := Positin{4,2}
	var p Positin = Positin{4,2}
	fmt.Println(p)
	printPosition(&p)
}