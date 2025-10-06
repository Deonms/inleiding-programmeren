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
