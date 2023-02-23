package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		
		String shapeType = in.next();
		System.out.println(shapeType);
		
		for (int i = 0; i<=2; i++)
		{
			int integers = in.nextInt();
			System.out.println(integers);
		}
		
		boolean booolean = in.nextBoolean();
		System.out.println(booolean);
		
		for (int i = 0; i<=3; i++)
		{
		double x = in.nextDouble();
		System.out.println(x);
		}
		
		if (!booolean)
		{
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(0.5, 0.5, 0.2, 0.2);
		}
		
		
	}
}
