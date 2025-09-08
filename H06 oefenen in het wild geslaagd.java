int goedSlechtCijfer;
int goedSlechtPresentie;
int geslaagdOfGezakt; 
String naam = "Jongen"; //Verander naar naam leerling

float eindCijfer;
eindCijfer = 7; //Verander behaalde vijfer leerling
if (eindCijfer < 5.5) {
  println(eindCijfer);
  println("Niet Voldoende");
  goedSlechtCijfer = 1;
}
else if (eindCijfer >= 5.5); {
  println(eindCijfer);
  println("Voldoende");
  goedSlechtCijfer = 2;
}


float Presentie;
Presentie = 17; //Verander Presentie lessen leerling
Presentie = Presentie * 5 ;
if (Presentie < 80) {
  println(Presentie + "%");
  println("Presentie is te weinig");
  goedSlechtPresentie = 1;
}
else if (Presentie >= 80); {
  println(Presentie + "%");
  println("Presentie is goed");
  goedSlechtPresentie = 2;
}

geslaagdOfGezakt = goedSlechtPresentie % goedSlechtCijfer;
if (geslaagdOfGezakt == 0) {
  println("[Naam] is Geslaagd");
}
else if (geslaagdOfGezakt >= 1) {
  println("[Naam] is Gezakt");
}
//Nieuw persoon
println(" ");
eindCijfer = 5.5;
if (eindCijfer < 5.5) {
  println(eindCijfer);
  println("Niet Voldoende");
  goedSlechtCijfer = 1;
}
else if (eindCijfer >= 5.5); {
  println(eindCijfer);
  println("Voldoende");
  goedSlechtCijfer = 2;
}


Presentie = 16;
Presentie = Presentie * 5 ;
if (Presentie < 80) {
  println(Presentie + "%");
  println("Presentie is te weinig");
  goedSlechtPresentie = 1;
}
else if (Presentie >= 80); {
  println(Presentie + "%");
  println("Presentie is goed");
  goedSlechtPresentie = 2;
}


geslaagdOfGezakt = goedSlechtPresentie % goedSlechtCijfer;
if (geslaagdOfGezakt == 0) {
  println(naam + " is Geslaagd");
}
else if (geslaagdOfGezakt >= 1) {
  println(naam + " is Gezakt");
}