package chapter_01;

/* Pi can be computed using the following formula:
 * 
 * Pi = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...).
 * 
 * Write a program that displays the result of
 * 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) and
 * 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13).
 * 
 * Use 1.0 instead of 1 in your program. */

public class Exercise_07 {
	public static void main(String[] args) {
		double d_1 = 1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11;
		System.out.println(4*d_1);
		double d_2 = d_1 + 1.0/13;
		System.out.println(4*d_2);
	}
}
