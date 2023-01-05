package practice.loops;

public class LoopsPractice {

	public static void main(String[] args) {

		int count = 0;
		while (count <= 100) {
			System.out.println("john " + count);
			count++;
			if (count == 2) {
				break;
			}
		}

		String text = "Fasdaslkdasd category:makeup asd ad category:furniture and category:boardgame qqasdsdqL";
		printCategories(text);

		for (int i = text.length() - 1; i >= 0; i--) {
//			System.out.println("char: " +  text.charAt(i) + " ");
		}

		for (int i = 0; i <= 100; i += 2) {
			System.out.println(i);
		}

		int counter = 0;

		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
			int temp = counter + 1;
			counter = temp;
		}

		counter = 0;
		for (int idx = 0; idx < 100; idx++) {
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					System.out.println("the value of idx was " + idx + " ------ " + i + "-----" + j);
					counter++;
				}
			}
		}
		System.out.println(counter);

	}

	public static void printCategories(String str) {

		int b = 0;
		int a = 0;
		while (!(str.indexOf("category:", a) < 0)) {
			a = str.indexOf("category:", a) + 9;
			b = str.indexOf(" ", a - 7);
			System.out.println(str.substring(a, b));
			a = b;
		}

//		int i = 0;
//		while(true) {
//			int found = str.indexOf("category:",i);
//			if (found == -1) break;
//			int start = found + 9;
//			int end = str.indexOf(" ", start);
//			System.out.println(str.substring(start, end));
//			i = end + 1 ;
//		}

	}
}
