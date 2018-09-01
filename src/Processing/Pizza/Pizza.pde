void setup(){
  size(500,500);
  fill(#E8A975);
  ellipse(250,250,200,200);
  fill(#FF030B);
  ellipse(250,250,180,180);
  fill(#F6FF03);
  ellipse(250, 250, 160, 160);
}
void draw(){
  PImage pepperoni = loadImage("pepperoni.ppm.gif");
  pepperoni.resize(30,30);
  image(pepperoni,200,220);
  image(pepperoni, 250, 180);
  image(pepperoni, 230, 280);
  image(pepperoni, 280, 230);
  PImage baconbit = loadImage("baconbit.ppm.gif");
  baconbit.resize(10, 10);
 image(baconbit, 220, 200);
 image(baconbit, 250, 250);
 image(baconbit, 290, 200);
}