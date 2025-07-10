package chapter3;

import java.util.Scanner;

//this program checks if workers qualify for a loan
/*
to qualify for a loan, a worker is expected to have met the following criteria
1. to have a work experience of 3 years minimum
2. to earn an annual minimum of $30,000
 */
public class LoanQualifier {
   public static void main(String[] args){
       //initialize program variables
       int workXP = 3;
       double minimumIncome = 30000;
       //get user inputs "years of work experience"
       System.out.println("How many years of work experience do you have?");
       Scanner scanner = new Scanner(System.in);
       int xplevel = scanner.nextInt();
       //get user "annual income"
       System.out.println("What's your annual income?");
       Scanner scanner2 =  new Scanner(System.in);
       double income = scanner2.nextDouble();
       scanner2.close();
       //initialize success message
       String successMessage = "Congrats! you qualify for the loan";
       //check for conditions
       if(income >= minimumIncome && xplevel >= workXP){
           System.out.println(successMessage);
       }else{
           System.out.println("Sorry, you do not qualify for a loan");
       }
   }
}
