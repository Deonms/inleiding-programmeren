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
String[] namen = {"Bob", "Mike", "Pieter", "Sandra", "Deon", "Yassir", "Isa", "Jan", "Calsey", "Reynold", "Ronald", "Isabella" , "bella", "Fenna", "Eline", "Elin", "Tim", "Luuk"};
boolean gevonden;
int input = 8; //wijzig dit nummer om het te zoeken
//het cijfer tussen 1 tot 18 zijn of 1 of 18
void setup() {
  gevonden = false;
  
  if (input >= 1 && input <= namen.length) {
    gevonden = true;
    println(gevonden + ", " + namen[input - 1]);
  } else {
    println("false, naam is niet gevonden checck input nummer");
  }
}
