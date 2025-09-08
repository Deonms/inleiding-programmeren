int steen1 = 4;
int steen2 = 6;
int steen3 = 5;
String resultaat = "";
int invoernummer = 3; //verander de nummer om je score te krijgen
int totaal = steen1 + steen2 + steen3 / invoernummer;

if (steen1 == 1 || steen2 == 1 || steen3 == 1) {
    resultaat = "mis";
} else if (steen1 == 6 && steen2 == 6 && steen3 == 6) {
    resultaat = "Super sterke hit";
} else if (totaal == 15) {
    resultaat = "Sterke hit";
} else if (totaal == 10) {
    resultaat = "hit";
} else {
    resultaat = "misser";
}
println(resultaat);