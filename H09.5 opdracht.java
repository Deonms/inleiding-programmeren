int a = 2;
int b = 8;
int totaal = (a + b) / 2;
void setup() {
  mijnMethode();
}
void draw() {
}

void mijnMethode() {
  println(totaal);
}

void setup() {
  mijnMethode(5, 6);
}

void draw () {
}

void mijnMethode(int getal, int getaltwee) {
  int totaal = getal + getaltwee;
  println("som "+ getal + "+" + getaltwee + "=" + totaal);
}
