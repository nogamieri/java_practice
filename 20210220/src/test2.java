
public class test2 {

	private static String hantei(int n) {
		if( n % 2 == 0 ) {
			return "偶数";}
		else {
			return "奇数";
		}
	}
	
	
	public static void main(String[] args) {
		int num;
		String kekka;
		
		num = 9;
		kekka = hantei(num);
		System.out.println(kekka);
		
		num = 10;
		kekka = hantei(num);
		System.out.println(kekka);
	}
}
