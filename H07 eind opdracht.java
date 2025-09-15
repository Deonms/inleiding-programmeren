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
