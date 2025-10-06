//draw rectangle code
class Rectangle {
  float x;
  float y;
  float breedte;
  float hoogte;

  Rectangle(float x, float y, float breedte, float hoogte) {
    this.x = x;
    this.y = y;
    this.breedte = breedte;
    this.hoogte = hoogte;
  }

  void teken() {
    rect(x, y, breedte, hoogte);
  }
}

void setup() {
  size(400, 400);
  Rectangle mijnRechthoek = new Rectangle(200, 200, 100, 175);
  mijnRechthoek.teken();
}
//nieuwe code en opdracht
void setup(){
  Person mijnPerson1 = new Person();
  Person mijnPerson2 = new Person();
  Person mijnPerson3 = new Person();
  mijnPerson1.naam = "Deon";
  mijnPerson2.age = 15;
  mijnPerson3.gender = "Jongen";
 println("Hallo mijn naam is: " + mijnPerson1.naam + " en ik ben " + mijnPerson2.age + " jaar oud en ik ben een " + mijnPerson3.gender);
}
class Person {
  String naam;
  int age;
  String gender;
}
//nieuwe stuk code en opdracht
void setup(){
  BankAccount mijnBankAccount1 = new BankAccount();
  BankAccount mijnBankAccount2 = new BankAccount();
  BankAccount mijnBankAccount3 = new BankAccount();
  mijnBankAccount1.eigenaar = "Deon";
  mijnBankAccount2.rekeningnummer = "NL 42 ING 3485 8245 93";
  mijnBankAccount3.saldo = 342.53;
  println("bank account van: " + mijnBankAccount1.eigenaar);
  println("rekeningnummer: " + mijnBankAccount2.rekeningnummer);
  println("Saldo van account: " + mijnBankAccount3.saldo + " Euro");
  //geld erbij en eraf
  float oudBedrag;
  float geldErbijofEraf = -2.0; //verander 0.0 naar het naar hoeveel erbij komt of er af gaat (of eraf te halen gebruik -)
  oudBedrag = mijnBankAccount3.saldo + geldErbijofEraf; 
  //om geld toe tevoegen
  if (oudBedrag > mijnBankAccount3.saldo){
    println();
    println("er is: " + geldErbijofEraf + " euro op de rekening gestord");
    println("nieuwe bedrag op het account is: €"+ oudBedrag);
  }
  //als geld er af is gehaald
  else if (oudBedrag < mijnBankAccount3.saldo) {
    println();
    println("er is: " + geldErbijofEraf + " euro op de rekening gestord"); //-geld gestord is er af halen want nu is het +- en dat is nogsteeds een - som anders is het -geld er af en dan is het -- en dat is een plus som
    println("nieuwe bedrag op het account is: €"+ oudBedrag);
}
}
class BankAccount {
  String eigenaar;
  String rekeningnummer;
  float saldo;
}