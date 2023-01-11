package com.java_basics.lecture29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		/** LinkedHashMap is ordered, map don't store duplicates keys**/
//		HashMap<String, String> dictionary = new LinkedHashMap<>();
//		HashMap<String, String> dictionary = new HashMap<>();
		/** ordered  **/
		TreeMap<String, String> dictionary = new TreeMap<>();
		
		dictionary.put("Brave", "ready to face and endure danger or pain; showing corage.");
		dictionary.put("Brillant", "exceptionally clever or tallented.");
		dictionary.put("Joy", "a feeling of great pleasure and happiness.");
		dictionary.put("Confidence", "the state of feeling certain about the truth of something.");
		dictionary.put("Brillant", "xxxxxxxxxxxxxxxxxxxxxxxxx");
		
//		for(String word: dictionary.keySet()) {
//			System.out.println(dictionary.get(word));
//		}
		
		for(Map.Entry<String, String> entry : dictionary.entrySet()) {
			System.out.println(entry.getKey());System.out.println(entry.getValue());
			
		}
	}

}
