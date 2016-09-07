
/*
Author: Salvador Ramirez
Date Created: 9/6/16
Last Modified:9/6/16
Class: CST438 Software Engineering
Professor: Professor Lassen, Professor Shu

*/

package cst438Assignment1;


import static org.junit.Assert.*;

import org.junit.Test;

public class QuestionsAnswersTest {

	@Test
	public void test() {
		// checks if question and answer were hashed correctly
		QuestionsAnswers QA = new QuestionsAnswers();
		
		String question = "How are you?";
		String answer = "Great!";
		QA.put(question , answer );
		boolean result = QA.testAnswer(question, answer);
		assert(result == true);
		
		
	}

}
