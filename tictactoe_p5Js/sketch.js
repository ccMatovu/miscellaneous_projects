let board = [
  ['x','x','o'],
  ['x','x','x'],
  ['x','x','x']
];

let player1 = 'x';
let player2 = 'o';

function setup(){
  createCanvas(600,600);
}
function draw(){
  background(220);
  let w = width/3;
  let h = height/3;
  
  line(w,0,w,height);
  line(w*2,0,w*2,height);
  line(0,h,width,h);
  line(0,h*2,width,h*2);
  
  for(let i = 0; i<3;i++){

    for(let j=0;j<3;j++){

      let x = w*i + w/2;
      let y = h*j + h/2;
      let spot = board[i][j];
       if (spot == player1) {
        noFill();
        ellipse(x, y, w / 2);
      } else if (spot == player2) {
        let xr = w / 4;
        line(x - xr, y - xr, x + xr, y + xr);
        line(x + xr, y - xr, x - xr, y + xr);
      }
    }
  }
}