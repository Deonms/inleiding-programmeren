int aantal = 27;
int[] variabeleNaam = new int[aantal];
println(variabeleNaam);
//new code
int[] mijnStapelGetllen = {10, 5, 20, 7, 4 ,143, 2};
println(mijnStapelGetllen);
//new codes
int aantal = 11;
int[] variabeleNaam = new int[aantal];

int[] mijnStapelGetllen = {10, 9, 8, 7, 6 ,5, 4, 3, 2, 1, 0};
println(variabeleNaam);
println(mijnStapelGetllen);
// new code
int aantal = 11; //wijzig cijfer voor hoger nummer
int[] variabeleNaam = new int[aantal];

for (int i = 0; i < aantal; i++) {
  variabeleNaam[i] = 12 * i;
  println("12 x " + i + " = " + variabeleNaam[i]);
}
//new code
String[] namen = {"bob", "mike", "pieter", "Sandra", "Deon", "Yassir", "isa", "jan", "calsey", "reynold"};
boolean gevonden;
int input = 8; //wijzig dit nummer om het te zoeken

void setup() {
  gevonden = false;
  
  if (input >= 1 && input <= namen.length) {
    gevonden = true;
    println(gevonden + ", " + namen[input - 1]);
  } else {
    println("false, naam is niet gevonden checck input nummer");
  }
}
