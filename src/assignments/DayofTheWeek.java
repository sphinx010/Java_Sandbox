package assignments;

import java.util.Scanner;

public class DayofTheWeek {
    static Scanner scanner =  new Scanner(System.in);

    public static void main (String[] args){
        setTheDay();
        returnTheDay();
    }
    private static int theDay;

    public static int setTheDay(){
        System.out.println("There are 7 days in a week, pick a number:");
        int userInput = scanner.nextInt();
        return theDay = userInput;
    }

    private static String weekDays [] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    public static String returnTheDay (){
        int userInp = theDay  - 1;
        if(userInp >= 0 && userInp < weekDays.length){
            System.out.println(weekDays[userInp]);
        }else{
            System.out.println("Sorry, invalid input");
        }
        return  weekDays[userInp];
    }

}
