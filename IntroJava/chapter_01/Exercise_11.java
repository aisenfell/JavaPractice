package chapter_01;

/* The U.S. Census Bureau projects population based on the following
 * assumptions:
 * 
 * One birth every 7 seconds
 * One death every 13 seconds
 * One new immigrant every 45 seconds
 * 
 * Write a program to display the population for each of the next five
 * years. Assume the current population is 312,032,486 and one year has
 * 365 days. */

public class Exercise_11 {
	public static void main(String[] args) {
		int birth = 7, death = 13, immigrant = 45;
		double seconds_in_year = 365 * (2880 / 1.0);
		double curr_population = 312032486, temp_population = 0;
		for (int i = 1; i < 6; i++) {
			temp_population = curr_population + (seconds_in_year / birth) +
					(seconds_in_year / immigrant) - (seconds_in_year / death);
			System.out.println("Population in " + i + " year(s): " +
					temp_population);
			curr_population = temp_population;
		}
	}
}
