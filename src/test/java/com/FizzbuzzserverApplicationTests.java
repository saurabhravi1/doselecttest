package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fizzbuzz.FizzBuzzRestAPI;

@SpringBootTest
class FizzbuzzserverApplicationTests {

	@Autowired
	private FizzBuzzRestAPI api;
	
	@Test
	void testFizzBuzzLogic() {
	
		/**Initializing Test data*/
		
		int int1=3;
		int int2=5;
		int limit=16;
		String str1="Fizz";
		String str2 = "Buzz";
		
		String expectedOutput = "1,2,Fizz,4,Buzz,Fizz,7,FizzBuzz,Fizz,Buzz,11,Fizz,13,14,Fizz,FizzBuzz";
		StringBuilder actualOutput= new StringBuilder();
		try {
			actualOutput = api.FizzBuzzAPI(int1, int2, limit, str1, str2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(actualOutput.toString(), expectedOutput.toString());
		
		
	
	}

}
