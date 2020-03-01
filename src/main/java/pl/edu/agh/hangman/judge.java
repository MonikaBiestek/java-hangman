package pl.edu.agh.hangman;

import java.util.ArrayList;

public class judge
{
	boolean guess(char userLetter, String word, ArrayList<Character> wordView)
	{
		if(((int)userLetter > 65 && (int)userLetter < 90) || ((int)userLetter > 97 && (int)userLetter < 122))
		{
			this.search(userLetter, word, wordView);
			return true;
		}
		else return false;
	}
	
	void search(char userLetter, String word, ArrayList<Character> wordView)
	{
		for(int i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) == userLetter) wordView.set(i, userLetter);
		}
	}
}
