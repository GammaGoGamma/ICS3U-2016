package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.print("Please enter a five (5) digit number: ");

        Scanner keyboard = new Scanner(System.in);
		
		int number = keyboard.nextInt();
		
		// Look at the pattern
		int digit1 = number % 10;
		int digit2 = number % 100 / 10;
		int digit3 = number % 1000 / 100;
		int digit4 = number % 10000 / 1000;
		int digit5 = number / 10000;
		
		int sum = digit1 + digit2 + digit3 + digit4 + digit5;
		
		System.out.println("The sum of the numbers " + digit5 + ", " + digit4 + ", "+ digit3 + ", " + digit2 + " and " + digit1 + " is " + sum);
		
		keyboard.close();

	}

}
