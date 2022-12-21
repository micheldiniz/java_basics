package java_basics;

public class LearningArrays {

	public static void main(String[] args) {
		
		//creates a 3 positions array
		int[] values = {100, 2100, 15};
		
		//create an 100 position from 0 oto 99 array filled with 0 
		int[] values2 = new int[100];
		
		String[] words = new String[] {"My", "Name", "is"};
		
		//creates a 3 positions array filled with null
		String[] words2 = new String[3];
		words2[0] = "My";
		words2[0] = "Name";
		words2[0] = "is";
		
		for(int i=0; i<values.length;i++) {
			System.out.print(values[i] + " ");
		}
		
		for(int i=0; i<values2.length;i++) {
			System.out.print(values2[i] + " ");
		}
	}
	
	
	
}
