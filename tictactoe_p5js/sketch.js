//board = new Board();
function setup() {
  createCanvas(500, 500);
  background(220);
  
}

function draw() {
  //background(220);
   board = new Board();
 
}

class Board{
  constructor(){
  fill(207,172,38);
  noStroke();
  rect(width/3,height/3,200,200);
  stroke(0,0,0);
  strokeWeight(5);
  line((width/3)+65,height/3,(width/3)+65,(height/3)+200);           line((width/3)+135,height/3,(width/3)+135,(height/3)+200);
  
  line(width/3,(height/3)+65,(width/3)+200,(height/3)+65);
  line((width/3),(height/3)+135,(width/3)+200,(height/3)+136);

  }
    
}

class cell{
  
}