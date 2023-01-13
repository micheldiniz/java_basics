package com.java_basics.lecture31.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

	public static void main(String[] args) {
		
		/** raw type!! Errors might be found in execution time!! **/
		ArrayList myRawList = new ArrayList();
		myRawList.add("Don't you dare!!");
		myRawList.add(2);		
		myRawList.add('D');		
		myRawList.add(0.0);
		myRawList.add(false);
		
		myRawList.forEach(p -> {
			System.out.println(p.getClass().getSimpleName());
		});
		
		
		Container<Integer,String> container = new Container<>(12, "Hello!");
		
		Integer item1 = container.getItem1();
		String item2 = container.getItem2();
		System.out.println(item1);
		System.out.println(item2 + "\n");
		
		Container<Double,Integer> container2 = new Container<>(12.00, 100);
		Double val1 = container2.getItem1();
		Integer val2 = container2.getItem2();
		System.out.println(val1);
		System.out.println(val2 + "\n");

		
		Set<String> myStringSet1 = new HashSet<>();
		myStringSet1.add("first");
		myStringSet1.add("second");
		myStringSet1.add("Whatever");
		
		Set<String> myStringSet2 = new HashSet<>();
		myStringSet2.add("first");
		myStringSet2.add("second");
		myStringSet2.add("Computer");
		
		Set<String> resultSet = union(myStringSet1, myStringSet2);
		
		
		Iterator<String> itr = resultSet.iterator();
			while(itr.hasNext()) {
			String var = itr.next();
			System.out.println(var);
		}
		
		System.out.println();
		resultSet.forEach(System.out::println);
		
	}
	
	//specifying that generics is being used
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {		
		Set<E> result = new HashSet<>(set1);
		result.addAll(set2);		
		return result;
	}
	
}
