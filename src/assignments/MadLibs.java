package assignments;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args){
        /*
        create a program that asks a user for a season of the year,then a whole number, then an adjective.
        Use the input to complete the sentence below, then output the result:
        "on a [adjective][season of the year]day, I drink a minimum of [whole number] cups of coffee."
         */
        // 1.Get the temperature type
        System.out.println("what is the weather like?");
        Scanner scanner =  new Scanner(System.in);
        String weatherType  = scanner.next();
        // 2.Get the season of the year
        System.out.println("what season of the year is it?");
        String season = scanner.next();
        // 3.Get the number of cups of coffee
        System.out.println("How many cups of coffee do you drink?");
        int coffeeCups = scanner.nextInt();
        // 4.Return a full-fledged statement
        System.out.println("On a " + weatherType + " " + season + " day, I drink a minimum of " + coffeeCups
        + " cups of coffee.");

    }


}
