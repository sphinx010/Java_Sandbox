package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){

       //1.Get the number of hours worked
        // we need to inform the user on the data the program wants:
        System.out.println("wassup employee, now enter the number of hours you worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        //2.Get the hourly pay rate
        // the program describes the data it needs:
        System.out.println("so..whats your pay rate?");
        double rate = scanner.nextDouble();
        //3.Multiply hours and pay rate
        double grossPay = hours * rate;
        // 4.Display result
                System.out.println("Well done, you've earned $" + grossPay + " today");
    }


}
