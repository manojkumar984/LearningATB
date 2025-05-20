package ex_08_If_conditions;

import java.util.Scanner;

public class Task_classification_of_triangles {

    //A program that classifies a triangle based on its side lengths.
    // Given three input values representing the lengths of the sides,
    // determine if the triangle is equilateral (all sides are equal),
    // isosceles (exactly two sides are equal), or scalene (no sides are equal).
    // Use an if-else statement to classify the triangle.

    public static void main(String[] args) {

        System.out.println("Enter the traiangle based on its length");
        Scanner scanner = new Scanner(System.in);
        System.out.println("side1 = ");
        int side1 = scanner.nextInt();
        System.out.println("side2 = ");
        int side2 = scanner.nextInt();
        System.out.println("side3 = ");
        int side3 = scanner.nextInt();
        if (side1 == side2 && side2 == side3)
        {
            System.out.println("The given triangle is equilateral");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The given triangle is Isosceles");
            
        } else {
            System.out.println("The given Triangle  is Scalene");
        }
        {
            
        }
    }
}
