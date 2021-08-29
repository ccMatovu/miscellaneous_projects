let drops = [] ;
function setup() {
  createCanvas(400, 400);
  for(let i=200;i>0;i--){
    drops[i] = new Drop(width);
  }
}

function draw() {
  background(220);
  for( let drop in drops){
    drops[drop].fall();
    drops[drop].show();
  }
}
