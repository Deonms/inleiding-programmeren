int tellera = 0;
float leeftijda = 15;
leeftijda = leeftijda * 365 ;
while(tellera <= leeftijda){
println("ik ga net zo lang door tellen tot en met je leeftijd in dagen.");
println("teller is nu " + tellera);
tellera++;
}
int tellerb = 0;
float leeftijdb = leeftijda;
leeftijdb = leeftijdb * 24;
while(tellerb <= leeftijdb){
println("ik ga net zo lang door tellen tot en met je leeftijd in uren.");
println("teller is nu " + tellerb);
tellerb++;
tellerb++;
tellerb++;
tellerb++;
}
int tellerc = 0;
float leeftijdc = leeftijdb;
leeftijdc = leeftijdc * 60;
while(tellerc <= leeftijdc){
println("ik ga net zo lang door tellen tot en met je leeftijd in minuten.");
println("teller is nu " + tellerc);
tellerc++;
tellerc++;
tellerc++;
tellerc++;
tellerc++;
tellerc++;
tellerc++;
tellerc++;
}
int tellerd = 0;
float leeftijdd = leeftijdc;
leeftijdd = leeftijdd * 60;
while(tellerd <= leeftijdd){
println("ik ga net zo lang door tellen tot en met je leeftijd in seconden.");
println("teller is nu " + tellerd);
tellerd++;
tellerd++;
tellerd++;
tellerd++;
tellerd++;
tellerd++;
tellerd++;
tellerd++;
tellerd++;
tellerd++;
tellerd++;
tellerd++;
tellerd++;
tellerd++;
tellerd++;
tellerd++;
tellerd++;
tellerd++;
}
println(leeftijda + "," + leeftijdb + "," + leeftijdc + "," + leeftijdd);
//je kan deze niet tegelijk laten gaan tellen het doet eerst wat hier boven staat en gaat dan pas veder naar de volgende stuk
float leeftijd = 15;
for (float i = 0; i<=leeftijd; i++) {
  leeftijd = leeftijd * 365 * 24;
  println("ik tel 2 keer zo snel je leeftijd in uren.");
  println("teller is nu " + i);
  i++;
}