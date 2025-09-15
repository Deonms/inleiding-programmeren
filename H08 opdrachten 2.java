size(60, 280);
background(255, 255, 255);
for (int i = 0; i <= 10; i++) {
  rect(20, i * 20 + 20, 20, 20);
}
for (int i = 0; i <= 10; i++) {
  print(i * 20 + 20);
  print(" | ");
  print(i*20);
  print(" | ");
  println(i);
}

//doe ze niet tegelijk omdat je dan deze hier onder alleen ziet
size(60, 280);
background(255, 255, 255);
for (int i = 0; i <= 10; i++) {
  rect(1, i * 1 + 1, 1, 200);
}

//doe ze niet tegelijk omdat je dan deze hier onder alleen ziet
size(140,140);
background(255,255,255);
int xWaarde = 10;
int yWaarde = 10;
for(int i = 0; i <= 10; i++){
for(int j = 0; j <= 10; j++){
rect(xWaarde, yWaarde, 10,10);
yWaarde = yWaarde + 10;
}
yWaarde = 10;
xWaarde = xWaarde + 10;
}

//doe ze niet tegelijk omdat je dan deze hier onder alleen ziet
size(70,70);
background(255,255,255);
int xWaarde = 10;
int yWaarde = 10;
for(int i = 0; i < 5; i++){
for(int j = 0; j < 2; j++){
rect(xWaarde, yWaarde, 10,10);
yWaarde = yWaarde + 10;
}
yWaarde = 10;
xWaarde = xWaarde + 10;
}

//doe ze niet tegelijk omdat je dan deze hier onder alleen ziet
size(200,200);
background(255,255,255);
int sizeC = 100;
for(int i = 0; i < 10; i++){
ellipse(100, 100, sizeC,sizeC);
sizeC = sizeC - 10;
}

//doe ze niet tegelijk omdat je dan deze hier onder alleen ziet
size(200,200);
background(255,255,255);
int sizeC = 10;
for(int i = 0; i <= 100; i++){
ellipse(100 - sizeC/2, 100 - sizeC/2, sizeC,sizeC);
sizeC = sizeC - 10;
}

//doe ze niet tegelijk omdat je dan deze hier onder alleen ziet
size(200,200);
background(255,255,255);
int sizeC = 50;
for(int i = 0; i < 5; i++){
ellipse(100, 100, sizeC,sizeC);
println(sizeC);
sizeC = sizeC - 10;
}

//doe ze niet tegelijk omdat je dan deze hier onder alleen ziet
size(200,200);
background(255,255,255);
int sizeC = 110;
for(int i = 0; i < 5; i++){
ellipse(110 - sizeC/2, 110 - sizeC/20, sizeC,sizeC);
sizeC = sizeC - 10;
}