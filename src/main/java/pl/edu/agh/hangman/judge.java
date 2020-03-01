package pl.edu.agh.hangman;

public class judge
{
	boolean guess(String userLetter, String word)
	{
		if(userLetter.length() > 1 || userLetter == "" || userLetter == " ") return false;
		
		return true;
	}
}
