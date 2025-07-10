package chapter4;

import java.util.Scanner;

/*
This program notifies workers that they have either the below the minimum,
at the minimum or above required credit score which is 700.
and that fall within the required salary which is $40,000 and above.

How the program is structured:
Individual method are used and called for input processing
user inputs are saved in accessible scopes
variables are initialized at class and method level: locally and globally
 */
public class CreditScoreValidator {
    //Global scope:
    static int requiredCreditScore = 700;
    static double requiredSalary = 40000;

    static double userSalary = getSalary();
    static int userCreditScore = getCreditScore();

    static boolean notifier = isUserQualified(userCreditScore, userSalary);

    public static void main (String[] args){
        isUserQualified(userCreditScore, userSalary);
        System.out.println(message());

    }

    public static double getSalary(){
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        Scanner scanner = new Scanner(System.in);
        int creditScore = scanner.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified (int credit, double salary){
        salary = userSalary;
        credit = userCreditScore;
        if(salary >= requiredSalary && credit >= requiredCreditScore){
           return true;
        }else{
            return false;
        }
    }

    public static String message (){
        if(notifier){
            return "Congratulations, you're qualified";
        }else{
            return "You do not qualify";
        }
    }
}
