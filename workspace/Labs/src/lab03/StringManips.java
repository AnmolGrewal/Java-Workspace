package lab03;
//***************************************************************
//StringManips.j ava
//
//Test several methods for manipulating String objects
//***************************************************************
import java.util.Scanner;
public class StringManips
{
public static void main (String[] args)
{
Scanner scan = new Scanner(System.in);
String phrase = new String ("This is a String test.");
int phraseLength; // number of characters in the phrase String
int middleIndex; // index of the middle character in the String
String firstHalf; // first half of the phrase String
String secondHalf; // second half of the phrase String
String switchedPhrase; //a new phrase with original halves switched
String middle3;
//compute the length and middle index of the phrase
phraseLength = phrase.length();
middleIndex = phraseLength / 2;
//get the substring for each half of the phrase
firstHalf = phrase.substring(0,middleIndex);
secondHalf = phrase.substring(middleIndex, phraseLength);
//concatenate the firstHalf at the end of the secondHalf
switchedPhrase = secondHalf.concat(firstHalf);
switchedPhrase = switchedPhrase.replace(" ", "*");
//print information about the phrase
middle3 = phrase.substring(phrase.length() / 2 - 1, phrase.length() / 2 + 2);
System.out.println();
System.out.println ("Original phrase: " + phrase);
System.out.println ("Length of the phrase: " + phraseLength +
" characters");
System.out.println ("Index of the middle: " + middleIndex);
System.out.println ("Character at the middle index: " +
phrase.charAt(middleIndex));
System.out.println(middle3);
System.out.println (switchedPhrase);
System.out.println("What State Do you Live in");
String state = scan.next();
System.out.println("What City Do you Live in");
String city = scan.next();
state = state.toUpperCase();
city = city.toLowerCase();
System.out.println(state+city+state);

	}
}