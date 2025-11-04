String scorefinal = "no score yet";
float[] even = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58};
float[] uneven = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59};
//tijd
int tijdUur = 0;
int tijdMinuten = 0;
int tijdSeconden = 0;
float tijdSecondenHidden = 0;
//bounce rect rood
float x1 = 250;
float y1 = 200;
float x1Speed = 1;
float y1Speed = 1;
//bounce rect geel
float x2 = 250;
float y2 = 200;
float x2Speed = 1;
float y2Speed = 1;
//bounce rect cyan
float x3 = 250;
float y3 = 200;
float x3Speed = 1;
float y3Speed = 1;
//bounce rect magenta
float x4 = 450;
float y4 = 400;
float x4Speed = 1;
float y4Speed = 1;
//bounce rect wit
float x5 = 300;
float y5 = 250;
float x5Speed = 1;
float y5Speed = 1;
//bounce rect zwart
float x6 = 350;
float y6 = 400;
float x6Speed = 1;
float y6Speed = 1;
//bounce rect orange
float x7 = 450;
float y7 = 400;
float x7Speed = 1;
float y7Speed = 1;
float grooteOranje = 25;
//bounce rect Kastanjebruin
float x8 = 400;
float y8 = 350;
float x8Speed = 1;
float y8Speed = 1;

ResetManager reset;

void setup() {
  size(800, 800);
  reset = new ResetManager();
  
}
class ResetManager {
void resetAll() {
tijdUur = 0;
tijdMinuten = 0;
tijdSeconden = 0;
tijdSecondenHidden = 0;
x1Speed = 1;
y1Speed = 1;
x2Speed = 1;
y2Speed = 1;
x3Speed = 1;
y3Speed = 1;
x4Speed = 1;
y4Speed = 1;
x5Speed = 1;
y5Speed = 1;
x6Speed = 1;
y6Speed = 1;
x7Speed = 1;
y7Speed = 1;
x8Speed = 1;
y8Speed = 1;
x1 = 250;
y1 = 200;
x2 = 250;
y2 = 200;
x3 = 250;
y3 = 200;
x4 = 450;
y4 = 400;
x5 = 300;
y5 = 250;
x6 = 350;
y6 = 400;
x7 = 450;
y7 = 400;
x8 = 400;
y8 = 350;
grooteOranje = 20;
}

class Obstacle {
  int size;
  float positionX;
  float positionY;
  float speedY;
  float speedX;
  Obstacle(int size, float positionX, float positionY , float speedX, float speedY) {
        this.size = size;
        this.positionX = positionX;
        this.positionY = positionY;
        this.speedX = speedX;
        this.speedY = speedY;
  }
  void collision(){
    if (mouseY >= positionY && mouseY <= positionY && mouseX >= positionX && mouseX <= positionX)
    {
     println("Score: " +  tijdUur+ ":" + tijdMinuten + ":" + tijdSeconden + ":" + tijdSecondenHidden + ". je bent afgegaan door Groen");
    scorefinal = "Score: " + tijdUur+ ":" + tijdMinuten + ":" + tijdSeconden + ":" + tijdSecondenHidden + ". je bent afgegaan door Groen";
    reset.resetAll();
    }
  } void move(){
    fill(0,255,0);
    ellipse(positionX, positionY, size, size);
    positionX += speedX;
  y1 += speedY;
  if (positionX < 0 || positionX > width) {
    speedX *= -1;
  }
  if (positionY < 0  || positionY > height) {
    speedY *= -1;
  }
  if (positionX <= 10) {
    positionX = width;
  }
  }
} //ik heb het geprobeert maar classes vindt ik nog moeilijk en zonder hulp kan ik het niet verder doen want ik vindt classes gewoon moeilijk
}

void draw() {
  background(100, 100, 255);
  fill(0, 255, 0);
  ellipse(mouseX, mouseY, 25, 25); //speler
  //if hit code
    if (mouseY >= y1 && mouseY <= y1+60 && mouseX >= x1 && mouseX <= x1+30) {
    println("Score: " +  tijdUur+ ":" + tijdMinuten + ":" + tijdSeconden + ":" + tijdSecondenHidden + ". je bent afgegaan door Rood");
    scorefinal = "Score: " + tijdUur+ ":" + tijdMinuten + ":" + tijdSeconden + ":" + tijdSecondenHidden + ". je bent afgegaan door Rood";
    reset.resetAll();
  }
  if (mouseY >= y3 && mouseY <= y3+30 && mouseX >= x3 && mouseX <= x3+100) {
    println("Score: " + tijdUur+ ":" + tijdMinuten + ":" + tijdSeconden + ":" + tijdSecondenHidden + ". je bent afgegaan door Cyan" );
    scorefinal = "Score: " + tijdUur+ ":" + tijdMinuten + ":" + tijdSeconden + ":" + tijdSecondenHidden + ". je bent afgegaan door Cyan";
    reset.resetAll(); 
  }
  if (mouseY >= y2 && mouseY <= y2+30 && mouseX >= x2 && mouseX <= x2+30) {
    println("Score: " + tijdUur+ ":" + tijdMinuten + ":" + tijdSeconden + ":" + tijdSecondenHidden + ". je bent afgegaan door Geel");
    scorefinal = "Score: " + tijdUur+ ":" + tijdMinuten + ":" + tijdSeconden + ":" + tijdSecondenHidden + ". je bent afgegaan door Geel";
    reset.resetAll();
  }
  if (mouseY >= y4 && mouseY <= y4+60 && mouseX >= x4 && mouseX <= x4+60) {
    println("Score: " + tijdUur+ ":" + tijdMinuten + ":" + tijdSeconden + ":" + tijdSecondenHidden + ". je bent afgegaan door Magenta");
    scorefinal = "Score: " + tijdUur+ ":" + tijdMinuten + ":" + tijdSeconden + ":" + tijdSecondenHidden + ". je bent afgegaan door Magenta";
    reset.resetAll();
  }
  if (mouseY >= y5 && mouseY <= y5+100 && mouseX >= x5 && mouseX <= x5+10) {
    println("Score: " + tijdUur+ ":" + tijdMinuten + ":" + tijdSeconden + ":" + tijdSecondenHidden + ". je bent afgegaan door wit");
    scorefinal = "Score: " + tijdUur+ ":" + tijdMinuten + ":" + tijdSeconden + ":" + tijdSecondenHidden + ". je bent afgegaan door Wit";
    reset.resetAll();
  }
  if (mouseY >= y6 && mouseY <= y6+20 && mouseX >= x6 && mouseX <= x6+200) {
    println("Score: " + tijdUur+ ":" + tijdMinuten + ":" + tijdSeconden + ":" + tijdSecondenHidden + ". je bent afgegaan door zwart");
    scorefinal = "Score: " + tijdUur+ ":" + tijdMinuten + ":" + tijdSeconden + ":" + tijdSecondenHidden + ". je bent afgegaan door Zwart";
    reset.resetAll();
  }
  if (mouseY >= y7 && mouseY <= y7+grooteOranje && mouseX >= x7 && mouseX <= x7+grooteOranje) {
    println("Score: " + tijdUur+ ":" + tijdMinuten + ":" + tijdSeconden + ":" + tijdSecondenHidden + ". je bent afgegaan door oranje");
    scorefinal = "Score: " + tijdUur+ ":" + tijdMinuten + ":" + tijdSeconden + ":" + tijdSecondenHidden + ". je bent afgegaan door Oranje";
    reset.resetAll();
  }
  if (mouseY >= y8 && mouseY <= y8+15 && mouseX >= x8 && mouseX <= x8+15) {
    println("Score: " + tijdUur+ ":" + tijdMinuten + ":" + tijdSeconden + ":" + tijdSecondenHidden + ". je bent afgegaan door Kastanjebruin");
    scorefinal = "Score: " + tijdUur+ ":" + tijdMinuten + ":" + tijdSeconden + ":" + tijdSecondenHidden + ". je bent afgegaan door Kastanjebruin";
    reset.resetAll();
  }
  //rect rood:
  fill(255, 0, 0);
  rect(x1, y1, 30, 60);
  x1 += x1Speed;
  y1 += y1Speed;
  if (x1 < 0 || x1 > width-30) {
    x1Speed *= -1;
  }
  if (y1 < 0  || y1 > height-60) {
    y1Speed *= -1;
  }
  if (x1 <= 10) {
    x1 = width-30;
  }
  //einde rect rood
  //rect geel:
  fill(255, 255, 0);
  rect(x2, y2, 30, 30);
  x2 -= x2Speed;
  y2 -= y2Speed;
  if (x2 < 0 || x2 > width-30) {
    x2Speed *= -1;
  }
  if (y2 < 0  || y2 > height-400) {
    y2Speed *= -1;
  }
  //einde rect geel
  //rect cyan:
  fill(0, 255, 255);
  rect(x3, y3, 100, 30);
  x3 -= x3Speed;
  y3 -= y3Speed;
  if (x3 < 0 || x3 > width-100) {
    x3Speed *= -1;
    x3 = 0;
  }
  if (y3 < 0  || y3 > height-30) {
    y3Speed *= -1;
  }
  //einde rect cyan
  //rect magenta:
  fill(255, 0, 255);
  rect(x4, y4, 45, 45);
  x4 -= x4Speed;
  y4 -= y4Speed;
  if (x4 < 0 || x4 > width-60) {
    x4Speed *= -1;
  }
  if (y4 < 400  || y4 > height-45) {
    y4Speed *= -1;
  }
  //einde rect magenta
  //rect wit:
  fill(255, 255, 255);
  rect(x5, y5, 10, 100);
  x5 -= x5Speed;
  y5 -= y5Speed;
  if (x5 < 0 || x5 > width-10) {
    x5Speed *= -1;
  }
  if (y5 < 0  || y5 > height-100) {
    y5Speed *= -1;
  }
  if (y5 == 0) {
    y5 = height -100;
  }
  //einde rect wit
  //rect zwart:
  fill(0, 0, 0);
  rect(x6, y6, 200, 20);
  x6 -= x6Speed;
  y6 -= y6Speed;
  if (x6 < 0 || x6 > width-200) {
    x6Speed *= -1;
  }
  if (y6 < 0  || y6 > height-20) {
    y6Speed *= -1;
    y6 = 0;
  }
  //einde rect zwart
  //rect oranje:
  fill(245, 194, 66);
  rect(x7, y7, grooteOranje, grooteOranje);
  x7 -= x7Speed;
  y7 -= y7Speed;
  if (x7 < 400 || x7 > width-grooteOranje) {
    x7Speed *= -1;
  }
  if (y7 < 0  || y7 > height-grooteOranje) {
    y7Speed *= -1;
  }
  //einde rect oranje
  //rect Kastanjebruin:
  fill(99, 58, 52);
  rect(x8, y8, 15, 15);
  x8 -= x8Speed;
  y8 -= y8Speed;
  if (x8 < 0 || x8 > 400) {
    x8Speed *= -1;
  }
  if (y8 < 0  || y8 > height-15) {
    y8Speed *= -1;
  }
  //einde rect Kastanjebruin
 //fake player start
 fill(0, 255, 0);
ellipse(1,1,1,1);
// Beweging van fake player

//fake player end
  fill(0, 0, 0);
  textSize(100);
  tijdSecondenHidden = tijdSecondenHidden + 0.8;
  if (tijdSeconden <= 9) {
    text(tijdUur + ":" + tijdMinuten + ":0" + tijdSeconden, 350, 75);
  } else {
    text(tijdUur+ ":" + tijdMinuten + ":" + tijdSeconden, 350, 75);
  }
  if (tijdSecondenHidden >= 60) {
    tijdSeconden = tijdSeconden + 1;
    tijdSecondenHidden = 0;
  }
  if (tijdSeconden >= 60) {
    tijdMinuten = tijdMinuten + 1;
    tijdSeconden = 0;
  }
  if (tijdMinuten >= 60) {
    tijdUur = tijdUur + 1;
    tijdMinuten = 0;
  }
  if (tijdMinuten == 0 &&  tijdSeconden == 30 && tijdSecondenHidden >= 00 && tijdSecondenHidden <= 0.8 || tijdMinuten == 1 && tijdSeconden == 00 && tijdSecondenHidden >= 00 && tijdSecondenHidden <= 0.8 || tijdMinuten == 1 && tijdSeconden == 30 && tijdSecondenHidden >= 00 && tijdSecondenHidden <= 0.8 || tijdMinuten == 2 && tijdSeconden == 00 && tijdSecondenHidden >= 00 && tijdSecondenHidden <= 0.8 || tijdMinuten == 2 && tijdSeconden == 30 && tijdSecondenHidden >= 00 && tijdSecondenHidden <= 0.8 || tijdMinuten == 3 && tijdSeconden == 00 && tijdSecondenHidden >= 00 && tijdSecondenHidden <= 0.8) {
    x1Speed = x1Speed -0.5;
    x3Speed = x1Speed = x4Speed = y1Speed = y3Speed = y4Speed = y5Speed = y7Speed ;
    x6Speed = x6Speed -1;
    x7Speed = x7Speed -1.5;
    y8Speed = y8Speed -2.5;
    x8Speed = x8Speed -2.5;
    x4 = 450;
    y4 = 400;
  }
if (inArray(uneven, tijdMinuten) && tijdSeconden == 0 && tijdSecondenHidden >= 0 && tijdSecondenHidden <= 0.8) {
x2Speed = 10;
y2Speed = 10;
}
if (inArray(even, tijdMinuten) && tijdSeconden == 0 && tijdSecondenHidden >= 0 && tijdSecondenHidden <= 0.8) {
x2Speed = 1;
y2Speed = 1;
}
  if (tijdSeconden == 30 && tijdSecondenHidden >= 00 && tijdSecondenHidden <= 0.8) {
    x4 = 450;
    y4 = 400;
  }
  if (tijdMinuten >= 0 && tijdSeconden == 30 && tijdSecondenHidden >= 00 && tijdSecondenHidden <= 0.8) {
    y5 = 0;
  }
  if (tijdMinuten >= 1 && tijdSeconden == 0 && tijdSecondenHidden >= 00 && tijdSecondenHidden <= 0.8) {
    y5 = height-100;
  }
  if (tijdSeconden == 10 && tijdSecondenHidden >= 00 && tijdSecondenHidden <= 0.8 || tijdSeconden == 20 && tijdSecondenHidden >= 00 && tijdSecondenHidden <= 0.8 || tijdSeconden == 30 && tijdSecondenHidden >= 00 && tijdSecondenHidden <= 0.8 || tijdSeconden == 40 && tijdSecondenHidden >= 00 && tijdSecondenHidden <= 0.8 || tijdSeconden == 50 && tijdSecondenHidden >= 00 && tijdSecondenHidden <= 0.8 || tijdSeconden == 59 && tijdSecondenHidden >= 00 && tijdSecondenHidden <= 0.8) {
    grooteOranje = grooteOranje + 2.5;
  }
  if (grooteOranje >= 100) {
    grooteOranje = 100;
  }
  textSize(25);
  text(scorefinal, 10, height-10);
}
class FakePlayer {
  
}
  boolean inArray(float[] arr, float value) {
for (int i = 0; i < arr.length; i++) {
if (arr[i] == value) {
return true;
}
}
return false;
}


//mijn eigen Verbetervoorstel:
//ik kon misschien nog beter de spawning doen dat inplaats van 1 kant op standard dat ze random beginnen met random code dat of + of - doet voor beide de x en y as

//mijn eigen Reflectie:
//het zelfde wat ik zei bij Verbetervoorstel en ook dat ik eerder een class moest gebruiken omdat het dan makkelijker ging met het toevoegen van de class dus als ik dit opnieuw zou moeten maken had ik dat
//als 1 van de eerste dingen gedaan inplaats van 1 van de laatste want nu als ik iets wil toevoegen hoef ik het alleen in de class aan te passen en pasten inplaats van bij elke hit checker
//ook daar in tegen zou de array wat simpeler doen want ik had eerst een lange stuk want de de heletijd && en ||, etc wat niet nodig was