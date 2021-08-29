class Drop{
  constructor(canvasWidth){
    this.x = random(0,canvasWidth);
    this.y = -1;
    this.ySpeed = 0.5;
  }
   fall(){
    this.y = this.y + this.ySpeed;
  }
  
  show(){
    strokeWeight(2);
    stroke(138,43,226);
    line(this.x,this.y,this.x,this.y+10);
  }
}