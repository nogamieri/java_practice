
public class Test {
	public static int[] getInversedArray(int[] array) {
		int[] a = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			a[i] = array[(array.length - 1) - i];
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[] b = {4, 8, 9};
		int[] b2 = getInversedArray(b);
		for(int i = 0; i < b2.length; i++) {
			System.out.println(b2[i] + " ");
		}
	}

}
