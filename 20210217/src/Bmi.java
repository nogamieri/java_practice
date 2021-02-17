import java.util.Scanner;

public class Bmi {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("お名前は？");
		String name = s.next();
		System.out.println("身長は？");
		double tall = s.nextInt();
		System.out.println("体重は？");
		double wait = s.nextInt();

		double bmi = wait / (tall/100 * tall/100);
		System.out.println(name + "さんのBMIは" + bmi + "です。");

	}

}
