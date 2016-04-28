package chapter_01;

/* Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
 * Write a program that displays the average speed in kilometers per hour.
 * (Note that 1 mile is 16 kilometers.) */

public class Exercise_12 {
	public static void main(String[] args) {
		int miles = 24, hours = 1, minutes = 40, seconds = 35;
		double kilometers = miles * 1.6;
		double time = hours + (minutes / 60.0) + (seconds / 120.0);
		double speed = kilometers / time;
		System.out.println(speed);
	}
}
