let board = [
  ['x','x','o'],
  ['x','x','x'],
  ['x','x','x']
];

let player1 = 'X';
let player2 = 'O';

function setup(){
  createCanvas(600,600);
}
function draw(){
  background(220);
  let w = width/3;
  let h = height/3;
  
  for(let i = 0; i<3;i++){
             //console.log('now');

    for(let j=0;j<3;j++){

      let x = w*i + w/2;
      let y = h*j + h/2;
      let spot = board[i][j];
       if (spot == 'x') {
        noFill();
        ellipse(x, y, w / 2);
      } else if (spot == 'o') {
        let xr = w / 4;
        line(x - xr, y - xr, x + xr, y + xr);
        line(x + xr, y - xr, x - xr, y + xr);
      }
    }
  }
}