package pl.edu.agh.hangman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProvideRandomWord {
	
	public static void main(String[] args) throws IOException {
		//loadWords();
	}
	
	public List loadWords() throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("src/main/resources/slowa.txt"));
		String str;

		List<String> list = new ArrayList<String>();
		while((str = in.readLine()) != null){
		    list.add(str);
		}

		//String[] stringArr = list.toArray(new String[0]);
		//for(int i=0; i<list.size(); i++) {
			//System.out.println(list.get(i));
		//}
		return list;
	}

	public String getRandomWord(List<String> items) {
	    return items.get(new Random().nextInt(items.size()));
	}
}