package chap08;

/**
 * Demonstrates the use of a variable length parameter list.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class VariableParameters {
    /**
    * Creates two Family objects using a constructor that accepts
    * a variable number of String objects as parameters.
    * @param args Unused
    */
    public static void main(String[] args) {
        Family lewis = new Family("John", "Sharon", "Justin", "Kayla");

        Family camden = new Family("Stephen", "Annie", "Matt", "Mary", "Simon",
                "Lucy", "Ruthie", "Sam", "David");

        System.out.println(lewis);
        System.out.println();
        System.out.println(camden);
    }
}
