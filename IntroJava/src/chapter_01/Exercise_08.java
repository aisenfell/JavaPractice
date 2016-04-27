package chapter_01;

/* Write a program that displays the area and perimeter of a circle
 * that has a radius of 5.5 using the following formula:
 * 
 * perimeter = 2 * radius * Pi
 * area = radius * radius * Pi */

public class Exercise_08 {
	public static void main(String[] args) {
		double radius = 5.5;
		double perimeter = 2 * radius * Math.PI;
		double area = Math.pow(radius, 2) * Math.PI;
		System.out.println("Area: " + area + "\n" +
		"Perimeter: " + perimeter);
	}
}
