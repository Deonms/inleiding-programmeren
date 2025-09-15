int temperatuur = 18;
if ( temperatuur < 0) {
  println("het is kouder dan 0 graden celcius = " + true);
}
if ( temperatuur > 0) {
  println("het is niet kouder dan 0 graden celcius = " + true);
}

String sneeuw = "Wit";
if (sneeuw != "Geel") {
  println("het sneeuw is Wit = " + true);
}
if (sneeuw == "Geel") {
  println("het sneeuw is Geel = " + true);
}

int jantje = 6;
if (jantje <= 4) {
  println("Jante mag van tafel = " + true);
}
if (jantje >= 4) {
  println("Jantje mag nog niet van tafel = " + true);
}

String datum = "15-9";
String mijnVerjaardag = "16-10";
if (mijnVerjaardag == datum) {
  println("het is mijn verjaardag = " + true);
}
if (mijnVerjaardag != datum) {
  println("het is nog niet mijn verjaardag = " + true);
}
double mijnLengte = 1.94;
if (mijnLengte <= 1.60) {
  println("ben kleiner dan 1.60 meter (160 cm) = " + true);
}
if (mijnLengte > 1.60) {
  println("Ben langer dan 1.60 , (160 cm) = " + true);
}
int mijnMondGehouden = 60;
if(mijnMondGehouden > 10){
println("ben langer dan 10 seconden stil geweest = " + true);
}
if(mijnMondGehouden < 10){
println("Ben niet langer dan 10 seconden stil geweest = " + true);
}