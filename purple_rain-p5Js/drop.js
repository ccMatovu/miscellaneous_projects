class Drop{
  constructor(canvasWidth){
    this.x = random(0,canvasWidth);
    this.y = random(-200,-500);
    this.ySpeed = random(1.5,4);
    this.rainLen = random(5,20);
  }
   fall(){
    this.y = this.y + this.ySpeed;
     if( this.y > height){
       this.y = random(-10,-60);
     }
  }
  
  show(){
    strokeWeight(2);
    stroke(138,43,226);
    line(this.x,this.y,this.x,this.y + this.rainLen);
  }
}