void setup(){
PImage face = loadImage("Rmbts.jpeg");
image(face,100,200);
size(500,500);
face.resize(500,500);
}
void draw(){
  fill(255,255,255);
  ellipse(235,260,25,25);
  ellipse(270,255,25,25);
  fill(mouseX,mouseY,mouseX/(mouseY+1));
  ellipse(235,260,15,15);
  ellipse(270,255,15,15);
  mouseX = 100;
  mouseY = 100;
}