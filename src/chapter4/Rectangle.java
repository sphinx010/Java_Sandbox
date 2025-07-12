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
I also learned how the scanner object behaves when scanning tokens (words, numbers, lines)
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
        Rectangle myRoom1 = Rectangle.createUserRectangleObject();
        Rectangle myRoom2 = Rectangle.createUserRectangleObject();
        do {
            calculateTheAreaOfTwoRooms(myRoom1, myRoom2);
            System.out.println("DO YOU WANT TO GIVE IT ANOTHER TRY (Yes / No) ?");
            scanner.nextLine();
            again = scanner.nextLine().toLowerCase();
        } while (again.equals("yes"));

        do {
            double perimeter = Math.ceil(myRoom1.calculatePerimeter());
            System.out.println("Here are the properties of your 1st Room: " + "\n" +
                    "Length: " +myRoom1.getLength() + "\n" +
                    "Width: " +myRoom1.getWidth() + "\n" +
                    "Perimeter: " +perimeter);
            System.out.println("DO YOU WANT TO GIVE IT ANOTHER TRY (Yes / No) ?");
            scanner.nextLine();
            again = scanner.nextLine().toLowerCase();
        }while (again.equals("yes"));
        scanner.close();
    }
   private double length;
    private double width;


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
    private Rectangle (){

    }

    // using a factory method to create new object instances
    public static Rectangle createUserRectangleObject (){
        Rectangle r = new Rectangle();
        r.setLength();
        r.setWidth();
        return r;
    }

    public static void calculateTheAreaOfTwoRooms (Rectangle r1, Rectangle r2){
        double area1 = r1.calculateArea();
        double area2 = r2.calculateArea();
        double totalArea = Math.ceil( area1 + area2);
        System.out.println("Here is the value of the space in your two rooms: " + "\n" +
                "Room1: " + area1 + "m" + "\n" +
                "Room2: " + area2 + "m" );
        System.out.println("And your total space is: " + totalArea + "m2" + "\n" +
                "");
    }

    //sets length
    public void setLength(){
        System.out.println("Enter the values of your Rectangle, what's its length ?");
        double length = scanner.nextDouble();
        this.length = length;
    }

    //set
    public void setWidth (){
        System.out.println("And its width ?");
        double width = scanner.nextDouble();
        this.width = width;
    }

    //gets length
    public double getLength (){
        return length;
    }

    //gets width
    public double getWidth(){
        return width;
    }

    public double calculateArea (){
        double area  = length * width;
        return area;
    }

    public double calculatePerimeter (){
        double perimeter = 2 * (length + width);
        return perimeter;
    }


}
