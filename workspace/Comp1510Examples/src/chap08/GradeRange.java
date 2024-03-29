package chap08;

/**
 * Demonstrates the use of an array of objects.
 *
 * @author Lewis
 * @author Loftus
 * @version 1
 */
public class GradeRange {
    /** constant array of standard grades. */
    public static final Grade[] GRADES = {new Grade("A", 95),
                                          new Grade("A-", 90),
                                          new Grade("B+", 87),
                                          new Grade("B", 85),
                                          new Grade("B-", 80),
                                          new Grade("C+", 77),
                                          new Grade("C", 75),
                                          new Grade("C-", 70),
                                          new Grade("D+", 67),
                                          new Grade("D", 65),
                                          new Grade("D-", 60),
                                          new Grade("F", 0)};

    /**
    * Creates an array of Grade objects and prints them.
    * @param args Unused
    */
    public static void main(String[] args) {

        for (Grade letterGrade : GRADES) {
            System.out.println(letterGrade);
        }
    }
}
