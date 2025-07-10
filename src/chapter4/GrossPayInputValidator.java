package chapter4;

import java.util.Scanner;

/*
While loop:
this program calculates the number of hours user has worked within the week.
Each store employee makes $15 per hour.
Each employee is expected to enter the number of hours they've worked
Do not allow overtime.
 */
public class GrossPayInputValidator {
     public static void main(String[] args) {
         //Declare known variables;
        int rate = 15;
        int maxHours = 40;

        //Get unknown variables
         System.out.println("How many hours have you worked this week?");
         Scanner scanner = new Scanner(System.in);
         double workerHours = scanner.nextDouble();
         double salary = rate * workerHours;
         //validate user inputs to make sure it doesn't out max the required maximum
         while (workerHours > maxHours ){
             System.out.println("Please enter a valid input");
             //the input stream is then cleared for a new value, which prompts the program to run again
             workerHours = scanner.nextDouble();
         }
         System.out.println("Congrats! This week you've earned " + "$" + salary);
    }
}
