package chap06;

import java.util.Scanner;

/**
 * Demonstrates the use of a switch statement.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class GradeReport {
    /**
    * Reads a grade from the user and prints comments accordingly.
    * @param args Unused
    */
    public static void main(String[] args) {
        int grade;
        int category;
        final int binSize = 10;
        final int perfect = 10;
        final int average = 7;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a numeric grade (0 to 100): ");
        grade = scan.nextInt();

        category = grade / binSize;

        System.out.print("That grade is ");

        switch (category) {
            case perfect:
                System.out.println("a perfect score. Well done.");
                break;
            case perfect - 1:
                System.out.println("well above average. Excellent.");
                break;
            case average + 1:
                System.out.println("above average. Nice job.");
                break;
            case average:
                System.out.println("average.");
                break;
            case average - 1:
                System.out.println("below average. You should see the");
                System.out.println("instructor to clarify the material "
                        + "presented in class.");
                break;
            default:
                System.out.println("not passing.");
        }
    }
}
