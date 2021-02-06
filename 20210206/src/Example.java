
public class Example {
	public static void main(String[] args) {
		int N = 5;
		for(int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("■ ");
			}
			System.out.println();
		}

		System.out.println();
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
	}
		System.out.println();
		
		for (int i = 10; i >= 5; i--) {
			System.out.println(i);
		}
		System.out.println();
		
		for (int i = 10; i >= -10; i--) {
			System.out.println(i);
		}
		System.out.println();
		
		for (int i = 10; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("*");
		
		for (int i = 50; i >= 10; i--) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("*");
		
		for (int i = 0; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
	}
}
