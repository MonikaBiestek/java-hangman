package pl.edu.agh.hangman;

import java.util.ArrayList;

public class judge
{
	boolean guess(char userLetter, String word, ArrayList<Character> wordView)
	{
		if(((int)userLetter >= 65 && (int)userLetter <= 90) || ((int)userLetter >= 97 && (int)userLetter <= 122) 
				|| userLetter == 'ą' || userLetter == 'ć' || userLetter == 'ę' || userLetter == 'ł' || userLetter == 'ń'
				|| userLetter == 'ó' || userLetter == 'ś' || userLetter == 'ź'  || userLetter == 'ż')
		{
			return this.search(userLetter, word, wordView);
		}
		else return false;
	}
	
	boolean search(char userLetter, String word, ArrayList<Character> wordView)
	{
		boolean letterFound = false;
		
		for(int i = 0; i < word.length(); i++)
		{
			if(word.charAt(i) == userLetter)
			{
				wordView.set(i, userLetter);
				letterFound = true;
			}
		}
		
		return letterFound;
	}
	
	boolean checkEndStatus(ArrayList<Character> wordView)
	{
		if(wordView.contains('_')) return false;
		else return true;
	}
}
