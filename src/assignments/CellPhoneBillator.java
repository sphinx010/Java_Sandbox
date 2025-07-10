package assignments;

import java.util.Scanner;

/*
This program calculates the total of a users cell-phone bill, right after a call
the factors needed for the program to work are:
There is a set plan fee per minute on each call,
There is a charge fee per minute on user phone bill-plan,
There is an estimated time average (in minutes) per call,

Design:
Individual methods are used to get and calculate the following values:
Phone-bill base charge,
Phone-bill tax,
overage or call sessions over a minute (+1min),
Final total, including call charges (fees + tax)

Program variables:
phonePlanCost
overageSessions
taxBill
Total
 */
public class CellPhoneBillator{
    static Scanner scanner =  new Scanner(System.in);
    static double planCost = getBasePlanCost();
    static int overageSesh = getOverageSessions();
    static double taxRate = 12.71;
    static double chargePermin = 0.20;
     static double overage = chargePermin * overageSesh;
     static double total = calculateTotalCost(planCost, taxRate, chargePermin);
     static String statement = phoneBillStatement();
    public static void main (String[] args){
        calculateTotalCost(planCost, taxRate, chargePermin);
        System.out.println(statement);

    }
    public static double getBasePlanCost (){
        System.out.println("Enter The Base Cost of Your Plan:");
        double phonePlanCost = scanner.nextDouble();
        return phonePlanCost;
    }

    public static int getOverageSessions (){
        System.out.println("Enter Overage Minutes:");
        int overageSessions = scanner.nextInt();
        return overageSessions;
    }

    public static double calculateTotalCost (double phPlanCost, double tax, double charge){
        double total = phPlanCost + tax + charge;
        return total;
    }

    public static String phoneBillStatement (){
        String statement = "Phone Bill Statement \n" +
                "Plan: " + "$" + planCost + "\n" +
                "Overage: " + "$" + overage + "\n" +
                "Tax: " + "$" + taxRate + "\n" +
                "Total: " + "$" + Math.ceil(total);
        return statement;
    }
}
