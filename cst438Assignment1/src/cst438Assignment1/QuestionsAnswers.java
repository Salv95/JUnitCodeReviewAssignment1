
/*
Author: Salvador Ramirez
Date Created: 9/6/16
Last Modified:9/6/16
Class: CST438 Software Engineering
Professor: Professor Lassen, Professor Shu

*/

package cst438Assignment1;

import java.util.HashMap;
import java.util.Random;

public class QuestionsAnswers {
	
	HashMap<String,String> map = new HashMap<String,String>();
	
	
	void put(String question, String answer) {// hashes question and answer
		
		map.put(question, answer);
	}
	
	boolean testAnswer(String question, String answer){// checks if a value was hashed
		
		if(map.get(question) == answer)
		{
			return true;
		}
		
		return false;
	}
	
	String getRandomQuestion()//gets a random value from the hasmap
	{	
		Random r = new Random();
		
		String randomQuestionKey = map.get(r.nextInt(map.size()));
		
		return randomQuestionKey;
	}
	
	

}




