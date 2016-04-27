package chapter_01;

/* Assume a runner runs 14 kilometers in 45 minutes and 30 seconds.
 * Write a program that displays the average speed in miles per hour.
 * (Note that 1 mile is 1.6 kilometers.) */

public class Exercise_10 {
	public static void main(String[] args) {
		int kilometers = 14, seconds = 30, minutes = 45;
		double miles = kilometers / 1.6;
		double hour = (seconds / 120.0) + (minutes / 60.0);
		double speed = miles / hour;
		System.out.println(speed);
	}
}
