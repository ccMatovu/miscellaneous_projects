package main

import (
	"bufio"
	"fmt"
	"os"
)

func main(){
	scanner :=bufio.NewScanner(os.Stdin)
	low := 1
	high := 100;
	fmt.Println("g number btn", low ,"and a", high)
	fmt.Println("a for too low")
	fmt.Println("b for too high")
	fmt.Println("c for exact")

	g := (low + high)/2

	

	play := true
	count := 0
		fmt.Println("the guess is ",g)
	for play {
		count++
		scanner.Scan()
		response := scanner.Text()
		if(response == "a"){
			low = g
			g = (g + high)/2
			fmt.Println("new guess is = ",g)
		}else if(response == "b"){
			high = g
			g = (g + low)/2
			
			fmt.Println("new guess is = ",g)

		}else{
			fmt.Println("great and it took you ",count,"guesses")
			play = false
		}
		//fmt.Println("new",g)

	}

	
}