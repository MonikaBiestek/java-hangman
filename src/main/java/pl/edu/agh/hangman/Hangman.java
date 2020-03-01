package pl.edu.agh.hangman;

import java.util.Scanner;

public class Hangman
{
    public static final String[] HANGMANPICS = new String[]
    {
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "      |\n" +
                    "=========",
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "      |\n" +
                    "========"
    };

    public static void main(String[] args)
    {
    	//tu szukanko slowa
    	
    	judge theJudge = new judge();
    	graphics viewer = new graphics();
        Scanner scanner = new Scanner(System.in);
    	String word = "nicnic";
    	char letter;
    	
    	viewer.initial(word);
    	int failureProgress = 0;
    	
    	while(failureProgress < 7)
	    {
    		System.out.println();
    		System.out.println("Podaj litere: ");
    		letter = scanner.next().charAt(0);
    		
	    	if(theJudge.guess(letter, word, viewer.getSecret())) viewer.viewProgress();
	    	else
	    	{
	    		viewer.viewProgress();
	    		System.out.println();
	    		System.out.print(HANGMANPICS[failureProgress]);
	    		failureProgress++;
	    	}
	    	
	    	if(theJudge.checkEndStatus(viewer.getSecret())) failureProgress = 7;
    	}
    	
    	scanner.close();
    }
}
