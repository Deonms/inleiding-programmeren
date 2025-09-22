float nummer1 = 5; //voer hier een getal in
float nummer2 = 3; // voer hier ook een getal
float eindnummer;

eindnummer = (nummer1 + nummer2) / 2 ;

println(eindnummer);

void setup(){
  size(300, 300);
}
 void draw() {
  line(10, 50, 190, 50);
  line(10, 230, 190, 230);
  line(10, 50, 10, 230);
  line(190, 230, 190, 50);
}
