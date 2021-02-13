
public class Example {
	public static int[] getMaxValue(int[] array) {
		int[] a = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			a[i] = array[(array.length - 1) - i];
		}
		return a;
	}

	public static void main(String[] args) {
		int[] b = { 4, 8, 9 };
		int[] b2 = getMaxValue(b);
		for(int i = 0; i < b2.length; i++) {
			System.out.print(b2[i] + " ");
		}

	}

}
