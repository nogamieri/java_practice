
public class Example {

	public static void main(String[] args) {
		int i = (int)(Math.random() * 100);
		System.out.println("iの値は"+ i);
		
		switch(i % 5) {
		case 1: System.out.println("大吉です");
		break;
		case 2: System.out.println("中吉です");
		break;
		case 3: System.out.println("小吉です");
		break;
		case 4: System.out.println("凶です");
		break;
		case 5: System.out.println("大凶です");
		break;
		}
	}
} 
