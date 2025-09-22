float nummer1 = 5; //voer hier een getal in
float nummer2 = 3; // voer hier ook een getal
float eindnummer;

eindnummer = (nummer1 + nummer2) / 2 ;

println(eindnummer);
//andere stuk code van een andere opdracht
void setup(){
  size(300, 300);
}
 void draw() {
  line(10, 50, 190, 50);
  line(10, 230, 190, 230);
  line(10, 50, 10, 230);
  line(190, 230, 190, 50);
}
// andere opdracht
int eerste = 1;
int tweede = 2;
int derde = 3;
int vierde = 0;
while (vierde < 1000000000) {
  println(vierde);
  vierde = vierde + (vierde + derde + eerste) / tweede;
}