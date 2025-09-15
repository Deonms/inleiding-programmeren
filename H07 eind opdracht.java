int leeftijd = 15;

switch(leeftijd) {
case 1:
  println("net begonnen aan het leven.");
  break;
  case 2:
  case 3:
  println("Baby");
  break;
  case 4:
  case 5:
  println("kleuter");
  break;
  case 6:
  case 7:
  case 8:
  case 9:
  case 10:
  case 11:
  case 12:
  println("Kind of schoolkind");
  break; 
  case 13:
  case 14:
  case 15:
  case 16:
  case 17:
  println("Tiener");
  break;
  case 18:
  case 19:
  case 20:
  case 21:
  case 22:
  case 23:
  case 24:
  println("jongvolwassen");
  break;
  case 25:
  case 26:
  case 27:
  case 28:
  case 29:
  case 30:
  case 31:
  case 32:
  case 33:
  case 34:
  println("Jonge Volwassenen");
  break;
  case 35:
  case 36:
  case 37:
  case 38:
  case 39:
  case 40:
  case 41:
  case 42:
  case 43:
  case 44:
  println("Middelbare leeftijd");
  break;
  case 45:
  case 46:
  case 47:
  case 48:
  case 49:
  case 50:
  println("boven  middelbare leeftijd");
  break;
  default:
  println("Deze leeftijd ken ik nog niet");
  break;
}
float somAntwoord = 0;
somAntwoord = (10 - 20)/10+3 * 43.34;
println("");
println(somAntwoord);

int dagenVanDeWeek = 1;

switch(dagenVanDeWeek) {
    case 1:
        println("Maandag");
        break;
    case 2:
        println("Dinsdag");
        break;
    case 3:
        println("Woesndag");
        break;
    case 4:
        println("Donderdag");
        break;
    case 5:
        println("Vrijdag");
        break;
    case 6:
        println("Zaterdag");
        break;
    case 7:
        println("Zondag");
        break;
}

int cijferResultaat = 1;
if (cijferResultaat == 1 ||cijferResultaat == 2 || cijferResultaat == 3) {
    println(cijferResultaat + " Resultaat is Slecht");
}
else if (cijferResultaat == 4) {
    println(cijferResultaat + " Resultaat is Onvoldoende");
}
else if (cijferResultaat == 5) {
    println(cijferResultaat + " Resultaat is Matig");
}
else if (cijferResultaat == 6 || cijferResultaat == 7) {
    println(cijferResultaat + " Resultaat is Voldoende");
}
else if (cijferResultaat == 8 || cijferResultaat == 9 || cijferResultaat == 10) {
    println(cijferResultaat + " Resultaat is Goed");
}
else if (cijferResultaat >= 11) {
    println("Cijfer = " + cijferResultaat + " is Niet Geldig Controleer of je het goed hebt ingevuld");
}
