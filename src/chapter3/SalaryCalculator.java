package chapter3;

import java.util.Scanner;

/*
MY JAVA PRACTICE
if statement
this would guarantee that all salesmen get a base pay of a $1,000;
for reaching the 10 sales quota
and where they sell above the quota, they'll receive a $250.00 bonus pay
so the if statement would ensure that where the sales are less than the quota, the salesmen get nothing,
and where the sales are above the quota, the salesmen get a reward $$🤑
 */
public class SalaryCalculator {
    public static void main (String[] args){
        //declare logic variables
        int basePay = 1000;
        int bonusPay = 250;
        int quota = 10;
        System.out.println("How many sales did you make this week?");
        Scanner scanner = new Scanner(System.in);
        int workDone = scanner.nextInt();
        int failure = quota - workDone ;
        if(workDone > quota){
            int salary = basePay + bonusPay;
            System.out.println("Congrats, you have earned $" + salary + " as your salary.");
        }else if (workDone == quota){
            System.out.println("Congrats, you have earned $" + basePay + " as your salary.");
        }else
        System.out.println("You did not meet your quota!... you're " + failure + " sales short!");
    }
}
