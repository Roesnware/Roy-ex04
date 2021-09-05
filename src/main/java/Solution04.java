import java.util.Scanner;

public class Solution04 {
    /*
    Mad libs are a simple game where you create a story template with blanks for words.
    You, or another player, then construct a list of words and place them into the story,
    creating an often silly or funny story as a result.

     Create a simple mad-lib program
     Scanner 'nounInput' = new scanner for 'noun' input
     Scanner 'verbInput' = new scanner for 'verb' input
     Scanner 'adjectiveInput' = new scanner for 'adjective' input
     Scanner 'adverbInput' = new scanner for 'adverb' input
     print 'Enter a noun: '
     String 'noun' = scan in noun using 'nounInput' scanner
     print 'Enter a verb: '
     String 'verb' = scan in verb using 'verbInput' scanner
     print 'Enter an adjective: '
     String 'adjective' = scan in adjective using 'adjectiveInput' scanner
     print 'Enter an adverb: '
     String 'adverb' = scan in adverb using 'adverbInput' scanner
     printf 'Do you %s your %s %s %s? That's hilarious! ', verb, adjective, noun, adverb
     */
    public static void main(String[] args){

        Scanner nounInput = new Scanner(System.in);
        Scanner verbInput = new Scanner(System.in);
        Scanner adjectiveInput = new Scanner(System.in);
        Scanner adverbInput = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = nounInput.next();

        System.out.print("Enter a verb: ");
        String verb = verbInput.next();

        System.out.print("Enter an adjective: ");
        String adjective = adjectiveInput.next();

        System.out.print("Enter an adverb: ");
        String adverb = adverbInput.next();

        System.out.printf("Do you %s your %s %s %s? That's hilarious! ", verb, adjective, noun, adverb);
    }
}
