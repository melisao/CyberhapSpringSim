package springsim;

import processing.core.PApplet;

public class Main extends PApplet {

	Spring s1 = new Spring(100, 100, 40, 200);
	SpringCollection sc = new SpringCollection();
	
	public void setup() {
		size(1000,800);
		background(255);
	}

	public void draw() {
		stroke(255);
		if (mousePressed) {
			line(mouseX,mouseY,pmouseX,pmouseY);
		}
		sc.draw();
	}
	
}
