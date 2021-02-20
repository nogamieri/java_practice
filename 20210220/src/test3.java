
public class test3 {
	public static void main(String[] args) {
		
		String[] kismy = kis();

		System.out.println(kismy[0]);
		System.out.println(kismy[1]);
		
		
		String[] news = news();

		System.out.println(news[0]);
		System.out.println(news[1]);
		
	}
		
	private static String[] kis() {
		String[] m = {"北山宏光","藤ヶ谷太輔","玉森裕太",
				  	"横尾渉","宮田俊哉","二階堂高嗣","千賀健永"};
		return m;
	}
	
	private static String[] news() {
		String[] m = {"増田貴久","小山慶一郎","加藤シゲアキ",};
		return m;
	}

}
