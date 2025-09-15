int teller = 0;
float leeftijd = 15;
leeftijd = leeftijd * 365 * 24;
while(teller <= leeftijd){
println("ik ga net zo lang door tellen tot en met je leeftijd in uren.");
println("teller is nu " + teller);
teller++;

//je kan deze niet tegelijk laten gaan tellen
float leeftijd = 15;
for (float i = 0; i<=leeftijd; i++) {
  leeftijd = leeftijd * 365 * 24;
  println("ik tel 2 keer zo snel je leeftijd in uren.");
  println("teller is nu " + i);
  i++;
}