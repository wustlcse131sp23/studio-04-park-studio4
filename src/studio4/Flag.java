package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.clear();
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(.25, 0.5, 0.15, 0.3);
		StdDraw.setPenColor(Color.ORANGE);
		StdDraw.filledRectangle(0.55, 0.5, 0.15, 0.3);
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(0.85, 0.5, 0.15, 0.3);
		
		
	}
}