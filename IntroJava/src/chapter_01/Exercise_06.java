package chapter_01;

/* Write a program that displays the result of
 * 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 */ 

public class Exercise_06 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
