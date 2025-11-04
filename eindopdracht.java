1.
float 1.4 want het is een komma getal en int kan geen komma getal onthouden want dat geeft een error
2.
!= beteken NIET gelijk aan in een if statenebt en ! is voor als het NIET in in een if statement is
3.
er word dan 18 uit geprint want 10 is hoger dan 5 dus word -4 gedaan dat is 6 en 6 is niet hoger dan 6 dus er komt geen +5 erbij dan gaat het naar *3 en dat maakt het 18
4.
 guur want, temp is niet kleiner dan 10 maar het regent wel omdat het || moet of regen true zijn of temp moet lager zijn dan 10 en in dit geval is regen true dus dan wordt het guur als regen false of && was  dan was het niet guur
5.
B
6.
resultaat is 12 want a is 6 en dat is groter dan 5 en b is 5 en dat is gelijk aan of kleiner dan 5 dus beide zijn true waardoor resultaat 12 word
7.
er wordr oplossing 2 geprint vanwege dat teller niet kleiner is dan 16 of groter is dan 33 omdat de teller 33 is
8.
oplossing 2 want teller staat op 22 eerste gedeelte is true want 22 is groter dan 16 maar het moet ook kleiner zijn dan 20 en dat is het niet dus wordt het false waardoor oplossing 2 eruit komt
9.
als A 11 of 12 of 5 of 6 is wordt hoi uitgeprint vanwege dat 11 en 12 groter zijn dan 10 worden ze min 6 gedaan en dan maak het 5 en 6 en die zijn niet groter dan 1o dus die worden niet -6 gedaan maar ze moeten of gelijk zijn aan 5 of aan 6 wat ze in beide gevallen zijn waardoor Hoi wordt uitgeprint dus in dit geval kan het 4 cijfers hebben die int a kan hebben voor hoi uit te printen
10.
er wordt HIT geprint want: intersect is false maar X is 20 en Y is 15 en dan wordt er gekeken is X groter dan Y ja of nee en dat is het waardoor het HIT word inplaats van MIS
11.
C
12.
je zou zien 6112 omdat 6 en 2 tussen "" staan worden ze niet toegevoegt aan getal maar de 5 wel en getal is al 6 dus dan is het 6 + 5 en dat is 11 en ook omdat er geen spaties bij beide 6 en 2 staan worden ze aan elkaar geprint waardoor je 6112 krijgt in plaats van 6 11 2
13.
B
14.
E want het begint bij 0 en het kan niet hoger zijn dan 4 vanwege <= wat beteken dat het gaat todat het kleiner dan of gelijk aan 4 is en niet hoger
15.
dan heb je deze code nodig:
int leeftijd = 6;
if(leeftijd >= 0 && leeftijd <=3){
  println("Gratis");
}
else if (leeftijd >= 4 && leeftijd <=12){
  println("Prijs is 20 euro");
}
else if (leeftijd >= 13 && leeftijd <=64){
  println("Prijs is 35 euro");
}
else{
  println("prijs is 25 euro");
}
16.
dan heb je deze code nodig:
int somVanDubbles(int a, int b) {
  return a + b;
}
void setup() {
  int a = 3;
  int b = 5;
  b = b * 2;
  a = a * 2;
  int resultaat = somVanDubbles(a,b);
  println(resultaat);
}
17.
kwam zo ver maar wist niet hoe ik het veder moest doen jammer genoeg:
int[] cijfers = {6, 8, 5, 9, 7};
for (int i = 0; i <= 4; i++) {
  println(cijfers(i));
}

anders deze want deze werkt wel:
int[] cijfers = {6, 8, 5, 9, 7};
for (int i = 0; i <= 4; i++) {
  println(cijfers);
}

18.
daarvoor heb je deze code nodig om het te kunnen laten werken:
float gemiddelde(int a, int b) {
  return (a + b);
}
void setup(){
  println(gemiddelde(10,10)/2);
  println(gemiddelde(8,4)/2);
  println(gemiddelde(10,5)/2);
  println(gemiddelde(5,4)/2);
}