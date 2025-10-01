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
  Rectangle mijnRechthoek = new Rectangle(200, 200, 100, 20);
  mijnRechthoek.teken();
}
