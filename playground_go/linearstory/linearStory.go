package main

import "fmt"

type storyPage struct{
	text string
	nextPage *storyPage
}

// func playStory(page *storyPage){
// 	if(page == nil){
// 		return
// 	}
// 	fmt.Println(page.text)
// 	playStory(page.nextPage)
// }

func (page *storyPage) playStory(){
	for page != nil {
		fmt.Println(page.text)
		page = page.nextPage
	}
}

func (page *storyPage) addToEnd(text string){

	pageToAdd := storyPage{text,nil}
	for page.nextPage != nil {
		page = page.nextPage
	}
	page.nextPage =&pageToAdd 
}

func main(){
	page1 := storyPage{"It was a dark and stormy night",nil}
	// page2 := storyPage{
	// 	text: "You are alone, and you need to find the sacred helmet",
	// 	nextPage:  nil,
	// }
	// page3 := storyPage{"the end",&page1}
	// page1.nextPage = &page2
	// page2.nextPage = &page3
	// page3.nextPage = nil

	page1.addToEnd("You are alone, and you need to find the sacred helmet")
	page1.addToEnd("the end")

	//playStory(&page1)
	page1.playStory()

	fmt.Println("Story finished.")
}