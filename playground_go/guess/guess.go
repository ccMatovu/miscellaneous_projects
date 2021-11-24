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
	fmt.Println("computer will guess a  number btn", low ,"and a", high)
	fmt.Println("type  a if the number guessed is too low")
	fmt.Println("type b if the number guessed  is too high")
	fmt.Println("type c if it is the correct number")

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
			fmt.Println("great and it took the computer ",count,"guesses to get it")
			play = false
		}

	}

	
}