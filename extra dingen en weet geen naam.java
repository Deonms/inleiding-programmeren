for(int i = 1; i <= 12; i++) {
  println(i);
}
println("");
for(int d = 20; d >= 0; d--) {
  println(d);
}
println("");
for(int g = 5; g <= 32; g=g+3) {
  println(g);
}
println("");
for(int s = 1 ; s == 1 ; s++){
  println("*");
  for(int t = 1 ; t == 1; t++){
    println("**");
    for(int e = 1 ; e == 1; e++){
      println("***");
      for(int rr = 1 ; rr == 1 ; rr++){
        println("****");
        for(int en = 1 ; en == 1 ; en++){
          println("*****");
        }
      }
    }
  }
}
println("");
for(int s = 1 ; s == 1 ; s++){
  println("    *    ");
  for(int t = 1 ; t == 1; t++){
    println("   **   ");
    for(int e = 1 ; e == 1; e++){
      println("  ***  ");
      for(int rr = 1 ; rr == 1 ; rr++){
        println(" **** ");
        for(int en = 1 ; en == 1 ; en++){
          println("*****");
        }
      }
    }
  }
}
println("");
for(int s = 1 ; s == 1 ; s++){
  println("    *  ");
  for(int t = 1 ; t == 1; t++){
    println("   ***   ");
    for(int e = 1 ; e == 1; e++){
      println("  *****  ");
      for(int rr = 1 ; rr == 1 ; rr++){
        println(" ******* ");
        for(int en = 1 ; en == 1 ; en++){
          println("*********");
        }
      }
    }
  }
}
//meer code:
void setup() {
  printNaamLeeftijd(15, "Deon");
}

void printNaamLeeftijd(int leeftijd, String naam) {
  println("Hallo mijn naam is " + naam + " en ik ben " + leeftijd + " jaar oud");
}
