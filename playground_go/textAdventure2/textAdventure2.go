package main

import (
	"bufio"
	"fmt"
	"os"
	"strings"
)

type storyNode struct {
	text string
	choices []*choices
}

type choices struct{
	cmd string
	description string
	nextNode *storyNode
	nextChoice *choices
}



func (node *storyNode) addChoice(cmd string, description string,nextNode *storyNode){
	choice := &choices{cmd, description, nextNode,nil}
	node.choices =append(node.choices, choice)
}

func (node *storyNode) render(){
	fmt.Println(node.text)
	if node.choices != nil{
		for _,choices := range node.choices{
			fmt.Println(choices.cmd,choices.description)
			
		}
	}
	
}

func (node *storyNode) excuteCmd(cmd string) *storyNode{
	for _,choices := range node.choices{
		if strings.ToLower(choices.cmd)== strings.ToLower(cmd){
			return choices.nextNode
		}

	}
	fmt.Println("Sorry, I didn't understand that.")
	return node
}

var scanner *bufio.Scanner

func (node *storyNode) play(){
	node.render()
	if node.choices != nil{
		scanner.Scan()
		node.excuteCmd(scanner.Text()).play()
	}
}

func main(){
	scanner = bufio.NewScanner(os.Stdin)
	
	start := storyNode{text:`You are in large chamber, deep underground.
	You see three passages leading out. A north passage leads into darkness.
	To the south, a passage appears to head upward. The eastern passages appears
	flat and well travelled.`}

	darkRoom := storyNode{text:"it is pitch black. you cannot see a thing."}

	darkRoomLit := storyNode{text:`the dark passage is now lit by your lantern.
	You can continue north or head back South`}
	
	grue := storyNode{text:`While stumbling around in the darkness, 
	you are eaten by a grue.`}

	trap := storyNode{text:`You head down the well traveled path when suddenly
	a trap door opens and you fall into a pit.`}

	treasure := storyNode{text: `You arrive at a small chamber, filled with treasure`}

	start.addChoice("N","Go North",&darkRoom)
	start.addChoice("S","Go south",&darkRoom)
	start.addChoice("E","Go East",&trap)

	darkRoom.addChoice("S","Try to go back south",&grue)
	darkRoom.addChoice("O","Turn on lantern",&darkRoomLit)

	darkRoomLit.addChoice("N","Go north",&treasure)
	darkRoomLit.addChoice("S","Go south",&start)
	 start.play()

	 fmt.Println()
	 fmt.Println("The End.")

} 