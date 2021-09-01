package com.bridgeLabz.hashTable;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MyHashMapTest {

	
	@Test
	public void addTheWordsToHashMapAndGetFrequency() {
		
		String sentence = "To be or not to be";
		MyHashMap<String, Integer> myHashMap = new MyHashMap();
		String words[] = sentence.toLowerCase().split(" ");
		
		for (String word: words) {
			Integer value = myHashMap.get(word);
			if(value == null)
				value = 1;
			else value++;
			
			myHashMap.add(word, value);
		}
		
		int frequency = myHashMap.get("to");
		
		Assert.assertEquals(2, frequency);
	}
	
	@Test
	public void addTheWordsToHashMapFunctionAndGetFrequency() {
		
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		
		MyLinkedHashMap<String, Integer> myHashMap = new MyLinkedHashMap<>();
		String words[] = sentence.toLowerCase().split(" ");
		
		for (String word: words) {
			Integer value = myHashMap.get(word);
			if(value == null)
				value = 1;
			else value++;
			
			myHashMap.add(word, value);
		}
		
		int frequency = myHashMap.get("paranoid");
		
		Assert.assertEquals(3, frequency);
	}
 	
}
