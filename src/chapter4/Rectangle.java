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
 */
public class Rectangle {
   static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){
        String again;
        do {
            System.out.println("Enter the values of your Rectangle, what's its length ?");
            double length = scanner.nextDouble();
            System.out.println("And its width ?");
            double width = scanner.nextDouble();
            Rectangle myRectangle = new Rectangle(length, width);
            double perimeter = Math.ceil(myRectangle.calculatePerimeter(length,width));
            System.out.println("Here are the properties of your Rectangle: " + "\n" +
                    "Length: " +length + "\n" +
                    "Width: " +width + "\n" +
                    "Perimeter: " +perimeter);
            System.out.println("DO YOU WANT TO GIVE IT ANOTHER TRY (Yes / No) ?");
            scanner.nextLine();
            again = scanner.nextLine().toLowerCase();
        }while (again.equals("yes"));
    }
   private double length;
    private double width;


    public Rectangle (double length, double width){
        this.length = length;
        this.width = width;
    }

    public double calculateArea (double length, double width){
        double area  = this.length * this.width;
        return area;
    }

    public double calculatePerimeter (double length, double width){
        double perimeter = 2 * (this.length + this.width);
        return perimeter;
    }


}
