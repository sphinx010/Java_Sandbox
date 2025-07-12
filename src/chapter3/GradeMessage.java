package chapter3;

import java.util.ArrayList;
import java.util.Scanner;

/*
OBJECTIVE:
use switch statements, learn how it checks for equality ==
over
ifelse statements that checks that the value reads true with set conditions
 */
public class GradeMessage {
    public static void main (String[] args){
        //This prints out the instructions required to capture user inputs
        System.out.println("Enter your grade here:");
        // This captures user inputs
        Scanner scanner = new Scanner(System.in);
        //This declares a string type variable that stores user inputs
        String studentGrade = scanner.next();
        //This contains an array of Grade messages that would be displayed
        ArrayList<String> message = new ArrayList<>();
        message.add("sorry, you did not meet the pass mark!");
        message.add("A poor performance, work harder!");
        message.add("A fair performance, work harder!");
        message.add("An Good performance, You can do better!");
        message.add("A wonderful performance, You can do better!");
        message.add("An outstanding performance, well-done!");


                /*******
                 i removed the former array method:
                 String[] message = { };
                 and replaced it a proper "ArrayList method" which is dynamic and flexible
                 ArrayList<String> message = new ArrayList<>();9
                 **********/

        /* Here a switch statement is used,
        it evaluates the expression's value [user input]
        and the case values for equality, and returns its correspondence.
        */
        switch (studentGrade){
            case "F":
                System.out.println(message.get(0));
                break;
            case "E":
                System.out.println(message.get(1));
                break;
            case "D":
                System.out.println(message.get(2));
                break;
            case "C":
                System.out.println(message.get(3));
                break;
            case "B":
                System.out.println(message.get(4));
                break;
            case "A":
                System.out.println(message.get(5));
                break;
            default:
                System.out.println("Student grades are from " + "A" + " through " + "F");
        }

    }
}
