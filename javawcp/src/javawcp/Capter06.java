package javawcp;

public class Capter06 {
	public static void main(String [] args) {		
		int val;
		val = 2 + 5;
		System.out.print(val);
		val++;
		System.out.print(val);
		val *= 5;
		System.out.print(val);
		
		boolean bool = (val == 50);
		System.out.print(bool);
		
		bool = (val < 50) && (val % 10 == 0);
		System.out.println(bool);
	}

}
