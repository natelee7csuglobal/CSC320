// Module 3 CSC320
// Nate Anderson
// 1/1/2025
// Option 1
// Professor: Herbert Pensado

// Pseudocode
// Develop a program that calculate the weekly average tax withholding for a customer
// Retrieve input from user / income
// Take user input and calculate the tax percentage using (If Else If) code block
// Print the tax withholding amount

import java.util.Scanner;

public class WeeklyTaxCalculator {
    public static void main(String[] args) {
        // Create a new scanner for user input
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter their weekly income
            System.out.print("Enter your weekly income: $");
            double weeklyIncome = scanner.nextDouble();

            // Declare variable for the Tax Rate (taxRate)
            double taxRate;

            // Determine the tax rate based on income guidelines
            if (weeklyIncome < 500) {
                taxRate = 0.10; // 10%
            } else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
                taxRate = 0.15; // 15%
            } else if (weeklyIncome >= 1500 && weeklyIncome < 2500) {
                taxRate = 0.20; // 20%
            } else {
                taxRate = 0.30; // 30%
            }

            // Calculate the weekly tax withholding by declaring what the formula would be for (taxWithholding)
            double taxWithholding = weeklyIncome * taxRate;

            // Display the tax withholding amount for the user
            System.out.printf("Your weekly tax withholding is: $%.2f%n", taxWithholding);
        }
    }
}
