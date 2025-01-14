package module5;

// Module 5 CSC320
// Nate Anderson
// 1/19/2025
// Option 1
// Professor: Herbert Pensado

// Pseudocode
// Develop a java program that will store in the form of daily average temperatures for one week
// Create days of the week | Monday | Tuesday | Wednesday | Thursday | Friday | Saturday | Sunday |
// Create scanner for user input
// Prompt user for all 7 days worth of temperatures
// Allow user to type in the day of the week they want to or display all of the weekdays
// Allow user to type quit in order to exit the program
// Once an input is selected, display the appropriate values

import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperatures {
    public static void main(String[] args) {
        // Here we are initializing the ArrayLists
        ArrayList<String> daysOfWeek = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        // Create days of the week here
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Collect temperatures for each day from the user
        System.out.println("Enter the average temperatures for the week in Fahrenheit:");
        for (String day : daysOfWeek) {
            System.out.print(day + " temperature: ");
            double tempCelsius = scanner.nextDouble();
            temperatures.add(tempCelsius);
        }

        // Main loop for the menu
        while (true) {
            System.out.println("\nEnter a day of the week to view the temperature, or type 'week' to view all temperatures and the weekly average (type 'exit' to quit):");
            String input = scanner.next();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program. Goodbye!");
                break;
            } else if (input.equalsIgnoreCase("week")) {
                // Display all days and their temperatures both Fahrenheit and Celsius
                double total = 0;
                System.out.println("\nTemperatures for the week:");
                for (int i = 0; i < daysOfWeek.size(); i++) {
                    double tempFahrenheit = (temperatures.get(i) * 9 / 5) + 32;
                    System.out.printf("%s: %.2f°F (%.2f°C)%n", daysOfWeek.get(i), temperatures.get(i), tempFahrenheit);
                    total += temperatures.get(i);
                }
                double weeklyAverageCelsius = total / daysOfWeek.size();
                double weeklyAverageFahrenheit = (weeklyAverageCelsius * 9 / 5) + 32;
                System.out.printf("\nWeekly Average Temperature: %.2f°F (%.2f°C)\n", weeklyAverageCelsius, weeklyAverageFahrenheit);
            } else if (daysOfWeek.contains(input)) {
                // Display temperature for a specific day
                int index = daysOfWeek.indexOf(input);
                double tempFahrenheit = (temperatures.get(index) * 9 / 5) + 32;
                System.out.printf("%s temperature: %.2f°F (%.2f°C)%n", input, temperatures.get(index), tempFahrenheit);
            } else {
                System.out.println("Invalid input. Please enter a valid day or 'week'.");
            }
        }

        scanner.close();
    }
}
