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
    	
    	viewer.initial(word);
    	int failureProgress = 0;
    	//System.out.print(HANGMANPICS[0]);
    	
    	while(failureProgress < 7)
	    {
	    	if(theJudge.guess('c', word, viewer.getSecret())) viewer.viewProgress();
	    	else
	    	{
	    		viewer.viewProgress();
	    		System.out.print(HANGMANPICS[failureProgress]);
	    		failureProgress++;
	    	}
    	}
    }
}
