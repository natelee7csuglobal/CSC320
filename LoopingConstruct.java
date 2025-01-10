package module4;

//Module 4 CSC320
//Nate Anderson
//1/10/2025
//Option 1
//Professor: Herbert Pensado

//Pseudocode
//Develop a program that utilizes a while loop to read a set of five floating-point values
//Initialize our variables | total | count | max | min |
//Prompt user for 5 values
//Initiate the while loop, use a try statement
//Compute the average = total / 5
//Compute the interest = total * .2
//Print all values for the user

import java.util.Scanner;

public class LoopingConstruct {
 public static void main(String[] args) {
     // Initialize our variables here
     double total = 0.0;
     int count = 0;
     double max = Double.MIN_VALUE;
     double min = Double.MAX_VALUE;
     // Create a new scanner for user input on the 5 variables
     try (Scanner scanner = new Scanner(System.in)) {
		System.out.println("Please enter 5 floating-point numbers:");
		// Set up the while loop here
		 while (count < 5) {
		     System.out.print("Enter value " + (count + 1) + ": ");
		     try {
		         // Read user input and parse as double
		         double value = Double.parseDouble(scanner.nextLine());

		         // Update calculations
		         total += value;
		         if (value > max) max = value;
		         if (value < min) min = value;

		         count++;
		     } catch (NumberFormatException e) {
		         System.out.println("Invalid input. Please enter a valid floating-point number.");
		     }
		 }
	}

     // Compute final results
     double average = total / 5;
     double interest = total * 0.2;

     // Display results for the user
     System.out.println("\nResults:");
     System.out.println("Total: " + total);
     System.out.println("Average: " + average);
     System.out.println("Maximum: " + max);
     System.out.println("Minimum: " + min);
     System.out.println("Interest on Total (20%): " + interest);
 }
}