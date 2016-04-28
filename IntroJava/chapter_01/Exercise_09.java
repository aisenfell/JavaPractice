package chapter_01;

/* Write a program that displays the area and perimeter of a rectangle
 * with the width of 4.5 and height of 7.9 using the following formula:
 * 
 * area = width * height. */

public class Exercise_09 {
	public static void main(String[] args) {
		double width = 4.5, height = 7.9;
		double perimeter = 2 * width + 2 * height;
		double area = width * height; // TODO: Find out why it's adding 0 and 4.
		System.out.println("Area: " + area + "\n" +
		"Perimeter: " + perimeter);
	}
}
