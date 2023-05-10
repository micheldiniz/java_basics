import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class SumNumbers {

	public static void main(String[] args) {
		
		List<Integer> numeros = new LinkedList<Integer>(Arrays.asList(0,1,2,3,4,5,6));
		
		System.out.println(sumListOfNumbers(numeros));
	}
	
	public static Integer sumListOfNumbers(List<Integer> numbers) {
		//Caso-Base >> 
		if(numbers.size() == 1) {
			return numbers.get(0);
		//Caso-Recursivo >> 
		}else {
			Integer num = numbers.get(0);
			numbers.remove(0);
			return num + sumListOfNumbers(numbers);
		}
	}
}