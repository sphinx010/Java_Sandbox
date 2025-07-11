package chapter4;

import java.util.Scanner;

// Classes AND Objects
/*
understanding the relationship between classes and objects is crucial in OOP:
Classes create objects
while
objects are designed by classes, it is done
through the class's methods and constructors.
constructors initialize objects with the "new" keyword.
Constructors are named just as the class they belong
example is Scanner scanner =  new Scanner(System.in)
HOWEVER, FOR THIS EXAMPLE: pure focus would remain on
the "Rectangle class"
The Rectangle Class is a class that births rectangles
it will have properties (values) and methods (metrics):
Values: Length, Breadth or Width,
Metrics: Area = L x W, Perimeter = 2 x (L + W)
i also learned how the scanner object behaves when scanning tokens (words, numbers, lines)
from methods such as:
next(): what it reads: it'll read a single word (stop at space/newline)
what it leaves: leaves the (\n) newline behind,
nextInt() & nextDouble(): Reads a number but leaves the (\n) newline behind,
hence the reason for the scanner.nextLine() resolve,  which leads the scanner object away from the space/newline.
 */
public class Rectangle {
   static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        String again;
        do {
            Rectangle myRectangle = new Rectangle();
            double perimeter = Math.ceil(myRectangle.calculatePerimeter());
            System.out.println("Here are the properties of your Rectangle: " + "\n" +
                    "Length: " +myRectangle.length + "\n" +
                    "Width: " +myRectangle.width + "\n" +
                    "Perimeter: " +perimeter);
            System.out.println("DO YOU WANT TO GIVE IT ANOTHER TRY (Yes / No) ?");
            scanner.nextLine();
            again = scanner.nextLine().toLowerCase();
        }while (again.equals("yes"));
    }
   private double length = getLength();
    private double width = getWidth();


//new change - 9:10pm 11th July
    /*
    --------
    create a default type constructor for empty initialisation
    create two methods:
    Getter and Setter
    Gets values, Sets values
    focused on encapsulation
    Removed redundancy: the methods were called too many times
    --------
     */

    //Default constructor
    public Rectangle(){

    }

    //gets length
    public double getLength(){
        System.out.println("Enter the values of your Rectangle, what's its length ?");
        double length = scanner.nextDouble();
        return length;
    }

    //set
    public double getWidth (){
        System.out.println("And its width ?");
        double width = scanner.nextDouble();
        return width;
    }

    public double calculateArea (){
        double area  = this.length * this.width;
        return area;
    }

    public double calculatePerimeter (){
        double perimeter = 2 * (length + width);
        return perimeter;
    }


}
