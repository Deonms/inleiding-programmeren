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

//be de volgende boeit het niet als je ze tegelijk doet
for(int i = 100; i >= 90; i--){
println(i);
}

println(" ");

for(int i = 50; i >= 20; i-=5){
println(i);
}

println(" ");

for(int i = 20; i >= 10; i--){
println(i);

}
//hoe dit  werkt hieronder is simple: je geeft nummer een cijfer dat is 0 en nummerTwee krijgt cijfer 1 dan print je nummer uit en dan
//wordt de som uitgevoerd om en ondervolgende opgeslagen nummer krijgt de cijfer van nummerTwee en nummerTwee krijgt daarna de cijfer die
//geregristeerd staat onder volgende en dan doet hij dit cyclus opnieuw totdat hij het dus wat er nu staat 30 keer heeft gedaan
int nummer = 0, nummerTwee = 1;
//verander het cijfer dat hiet staat in de code: i <= 19. zodat je meer cijfers krijgt
for (int i = 1;  i <= 30; i++){
  print(nummer + ",");
int volgende = nummer + nummerTwee;
nummer = nummerTwee;
nummerTwee = volgende;
}
//als de aantal cijfers te hoog is wordt het een min getal
