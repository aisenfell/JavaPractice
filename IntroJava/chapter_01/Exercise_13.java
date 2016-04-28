package chapter_01;

/* You can use Cramer's rule to solve the following 2X2 system of linear
 * equation:
 * 
 * ax + by = e		x = (ed - bf) / (ad - bc)
 * cx + dy = f		y = (af - ec) / (ad - bc)
 * 
 * Write a program that solves the following equation and displays the
 * value for x and y:
 * 
 * 3.4x + 50.2y = 44.5
 * 2.1x + .55y = 5.9 */

public class Exercise_13 {
	public static void main(String[] args) {
		final double A = 3.4, B = 50.2, E = 44.5, C = 2.1, D = 0.55, F = 5.9;
		double x = ((E * D) - (B * F)) / ((A * D) - (B * C));
		double y = ((A * F) - (E * C)) / ((A * D) - (B * C));
		System.out.println("x = " + x + "\n" + "y = " + y);
	}
}
