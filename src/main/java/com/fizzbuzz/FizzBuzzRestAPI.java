package com.fizzbuzz;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.FizzbuzzserverApplication;
import com.fizzbuzz.exception.InvalidInputException;

@RestController
public class FizzBuzzRestAPI {

	@GetMapping("/FizzBuzzAPI/{int1}/{int2}/{limit}/{str1}/{str2}")
	public StringBuilder FizzBuzzAPI(@PathVariable int int1, @PathVariable int int2, @PathVariable int limit,
			@PathVariable String str1, @PathVariable String str2) throws Exception{
		StringBuilder result = new StringBuilder();
		
		if(StringUtils.isBlank(str1)||StringUtils.isBlank(str2)||
		int1<1 || int2<1) {
			throw new InvalidInputException("Any of the below conditions not satisfying : "
					+ "1. int1, int2 and limit path variables should be greater than zero."
					+ "2. str1 and str 2 should not be blank/null");
		} 
		
		for (int i = 1; i <= limit; i++) {
			String fizzBuzzValueForI= (i%int1==0)?str1:i%int2==0?str2:i%(int1+int2)==0?str1.concat(str2):String.valueOf(i);
			result.append(fizzBuzzValueForI);
			if(i!=limit) {
				result.append(",");
			}
		}
		
		return result;
	}
	@GetMapping("/statistics")
	public String getStatistics() {
		Optional<Entry<String, Integer>> max = FizzbuzzserverApplication.requestLoggerWithParameter.entrySet().stream().max(Map.Entry.comparingByValue());
		String response1="No Request Received";
		String response2="";
		if(max.isPresent()) {
			response1 = "The parameters corresponding to the most used request : "+max.get().getKey();
			response2 = "\nThe number of hits for the most frequent request : "+max.get().getValue();
		}
		return response1.concat(response2);		
	}
	
	

}
