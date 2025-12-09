import java.util.Scanner;
public class Mad_Lib_Game {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Mad Lib Game!\n");

        String story_start = "Yesterday, I decided to build a robot named _____(noun), " +
                       "It was a _____ (adjective) robot that could _____ (verb) " +
                       "so _____ (adverb). Everyone said it was the most " +
                       "_____ (adjective) robot they had ever seen!";

        System.out.println("Here is a story template:");
        System.out.println(story_start);

        System.out.println("\nLet's start filling in the blanks!");

        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter a adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter an verb: ");
        String verb = scanner.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = scanner.nextLine();

        System.out.print("Enter a adjective1: ");
        String adjective1 = scanner.nextLine();

        String story_end = "Yesterday, I decided to build a robot named " + noun + ", " +
                       "It was a " + adjective + " robot that could " + verb + 
                       " so " + adverb + ". Everyone said it was the most " +
                       adjective1 + " robot they had ever seen!";
        
        System.out.println("\nHere is your story:");
        System.out.println(story_end);

        scanner.close();
    }
}