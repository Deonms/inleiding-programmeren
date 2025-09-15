  yWaarde+=5;
  if (xWaarde >= 1000) {
    xWaarde = 0;
  }
  if (yWaarde >= 1000) {
    yWaarde = 0;
  }
  fill(255, 255, 255);
  ellipse(xWaarde, yWaarde, 250, 250);
  fill(0, 0, 0);
  ellipse(xWaarde, yWaarde, 200, 200);
  fill(0, 0, 255);
  ellipse(xWaarde, yWaarde, 150, 150);
  fill(255, 0, 0);
  ellipse(xWaarde, yWaarde, 100, 100);
  fill(0, 255, 0);
  ellipse(xWaarde, yWaarde, 50, 50);
}
