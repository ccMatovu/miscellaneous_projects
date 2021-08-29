let d;
function setup() {
  createCanvas(400, 400);
  d = new Drop(width);
}

function draw() {
  background(220);
  d.fall();
  d.show();
}
