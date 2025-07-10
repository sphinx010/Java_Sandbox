package chapter3;

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
        // This captures user inputs from the terminal\console
        Scanner scanner = new Scanner(System.in);
        //This declares a string type variable that stores user inputs captured from the terminal
        String studentGrade = scanner.next();
        //This contains an array of Grade messages that would be displayed, with regard to the user inputs
        String[] message = {"An outstanding performance, well-done!",
                "A wonderful performance, You can do better!",
                "An Good performance, You can do better!",
                "A fair performance, work harder!",
                "A poor performance, work harder!",
                "sorry, you did not meet the pass mark!"
        };
        /* Here a switch statement is used,
        it evaluates the expression's value [user input]
        and the case values for equality, and returns its correspondence.
        */
        switch (studentGrade){
            case "F":
                System.out.println(message[5]);
                break;
            case "E":
                System.out.println(message[4]);
                break;
            case "D":
                System.out.println(message[3]);
                break;
            case "C":
                System.out.println(message[2]);
                break;
            case "B":
                System.out.println(message[1]);
                break;
            case "A":
                System.out.println(message[0]);
                break;
            default:
                System.out.println("Student grades are from " + "A" + " through " + "F");
        }

    }
}
