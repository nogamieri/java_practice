import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "bye!";
		
		String regex = "e.*o";
		Pattern p = Pattern.compile(regex);
		
		Matcher m1 = p.matcher(str1);
		
		System.out.println(str1 + " は");
		if(m1.find()) {
			System.out.println("マッチします");
		}else {
			System.out.println("マッチしません");
		}
		
		Matcher m2 = p.matcher(str2);
		
		System.out.println(str2 + " は");
		if(m2.find()) {
			System.out.println("マッチします");
		}else {
			System.out.println("マッチしません");
		}
	}

}
