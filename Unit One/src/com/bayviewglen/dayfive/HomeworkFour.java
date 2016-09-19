package com.bayviewglen.dayfive;

import java.util.Scanner;

public class HomeworkFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter an initial velocity of the car (in m/s): ");
		double velocityInitial = keyboard.nextDouble();
		
		System.out.print("Please enter an acceleration of the car (in m/s^2): ");
		double acceleration = keyboard.nextDouble();
		
		System.out.print("Please enter the time elapsed (in s): ");
		double time = keyboard.nextDouble();
		
		double velocityFinal = velocityInitial + acceleration * time;
		
		System.out.println("The final velocity of the car is " + velocityFinal + " m/s.");
		
		keyboard.close();

	}

}
