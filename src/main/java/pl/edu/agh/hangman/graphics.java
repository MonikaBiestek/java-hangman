package pl.edu.agh.hangman;

import java.util.ArrayList;

public class graphics
{
private ArrayList<Character> secret = new ArrayList<>();
	
	public ArrayList<Character> getSecret()
	{
		return secret;
	}

	public void setSecret(ArrayList<Character> secret)
	{
		this.secret = secret;
	}
	
	void initial(String word)
	{
		for(int i = 0; i < word.length(); i++)
    	{
    		this.secret.add('_');
    	}
	}
	
	void viewProgress()
	{
		for(char being : this.secret)
		{
			System.out.print(being + " ");
		}
	}
}
