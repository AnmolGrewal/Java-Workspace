package chap07;

import java.util.Scanner;

/**
 * Demonstrates the concept of method decomposition.
 * @author Lewis
 * @author Loftus
 * @version 1
 *
 */
public class PigLatin {
    /**
     * Reads sentences and translates them into Pig Latin.
     * @param args unused
     */
    public static void main(String[] args) {
        String sentence;
        String result;
        String another;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("Enter a sentence (no punctuation):");
            sentence = scan.nextLine();

            System.out.println();
            result = PigLatinTranslator.translate(sentence);
            System.out.println("That sentence in Pig Latin is:");
            System.out.println(result);

            System.out.println();
            System.out.print("Translate another sentence (y/n)? ");
            another = scan.nextLine();
        } while (another.equalsIgnoreCase("y"));
    }
}
