
public class BinarySearch {

	public static void main(String[] args) {
		int lista[] = { 5, 18, 27, 33, 44, 49, 54, 67, 69, 72, 79, 86, 87, 92 };
		int value = BinarySearch.runBinarySearchIteratively(lista, 78, 0, lista.length);
		CAx o = new CBy();
		System.out.println(o.op1(2));
	}

	public static int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
		int index = Integer.MAX_VALUE;

		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if (sortedArray[mid] < key) {
				low = mid + 1;
			} else if (sortedArray[mid] > key) {
				high = mid - 1;
			} else if (sortedArray[mid] == key) {
				index = mid;
				break;
			}
//			System.out.println(sortedArray[mid]);
		}
		return index;
	}
}

class CAx {
	protected int a;
	protected int b;

	public CAx() {
		a *= 2;
		b *= 3;
		System.out.print("CAx construtor ");
		System.out.println("Valor de a: " + a + " Valor b:" + b);
	}

	{
		a = 1;
		b = 2;
		System.out.print("Default constructor CAx() ");
		System.out.println("Valor de a: " + a + " Valor b:" + b);
	}

	public int op1(int x) {
		System.out.println("CAx op1" + "valor de a:" + a + " valor de b:" + b);
		return op2(x) + op3(x) + b;
	}

	public int op2(int x) {
		System.out.println("CAx op2" + "Valor de a: " + a + "valor de x" + x);
		return x + a;
	}

	public static int op3(int x) {
		System.out.println("CAx static op3op3 valor de x: " + x);
		return x * 2;
	}
}

class CBy extends CAx {
	protected int a;

	// 4 //5
	public CBy() {
		System.out.println("CBY()");
		System.out.println(a);
		System.out.println(b);
		a += 3;
		b += 3;
		System.out.print("CBy construtor ");
		System.out.println("Valor de a: " + a + " Valor b:" + b);
	}

	public int op2(int x) {
		System.out.println("CBy op2" + "Valor de a: " + a + "valor de x " + x);
		return x - a;
	}

	public static int op3(int x) {
		System.out.println("CBy static op3 valor de x: " + x);
		return x * 3;
	}
}
