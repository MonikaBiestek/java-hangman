package pl.edu.agh.hangman;

import java.util.ArrayList;

public class graphics
{
private ArrayList<String> secret = new ArrayList<>();
	
	public ArrayList<String> getSecret()
	{
		return secret;
	}

	public void setSecret(ArrayList<String> secret)
	{
		this.secret = secret;
	}
	
	void initial(String word)
	{
		for(int i = 0; i < word.length(); i++)
    	{
    		secret.add("_");
    	}
	}
}
