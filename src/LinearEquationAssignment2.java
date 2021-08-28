/*Name: Ryan Teixeira
Assignment 2
Program: Computer System Technology - Information Systems Engineering

Calculates the slope, mid-point, distance between chosen points P and Q,
  and outputs the linear equation of the graph.*/


import java.util.Scanner;

public class LinearEquationAssignment2 {
    public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);
    double x1 = 0;
    double y1 = 0;
    double x2 = 0;
    double y2 = 0;
    double slope = 0;
    double midpointX = 0;
    double midpointY = 0;   
    double distBtwn = 0;
    double b = 0;
    
    System.out.println("");
    // recording input of both cordinates
    System.out.println("Recording Point P: ");
    System.out.print("Enter x1-Value: ");
    x1 = input.nextDouble();
    System.out.print("Enter y1-Value: ");
    y1 = input.nextDouble();

    System.out.println("Recording Point Q: ");
    System.out.print("Enter x2-Value: ");
    x2 = input.nextDouble();
    System.out.print("Enter y2-Value: ");
    y2 = input.nextDouble();
    
    // Storing calculations in variables
    slope = (y2-y1)/(x2-x1);
    midpointX= (x1 + x2)/2;
    midpointY = (y1 + y2)/2;
    distBtwn= Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    b = -(slope * x1) + y1;

    // Printing the program output
    System.out.println("");
    System.out.println("A Line connected by P(" + x1 + ", " + y1 +") and " 
    + "Q(" + x2 + ", " + y2 + ")");

    System.out.printf("- Has a slope of %2.2f\n", slope);   
    System.out.printf("- Has a mid-point of (%.1f%s %.1f%s\n"
    ,midpointX,",", midpointY,")");
    
    System.out.println("");
    System.out.printf("The distance between P and Q is %.2f\n", distBtwn);
    System.out.printf("The line's equation is y = %1.2f%s%1.2f\n",
    slope,"x + ", b);

    }
}
