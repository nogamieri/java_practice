
public class Example {

	public static int getRandomNumber() {
		int i = (int)(Math.random() * 100) +1;
				return i;
	}

	public static String getWeatherForcast() {
		String[] days = {"今日", "明日", "明後日"};
		String[] weathers = {"晴れ", "雲", "雨", "雪", "雷"};

		String day = days[(int)(Math.random() * days.length)];
		String weather = weathers[(int)(Math.random() * weathers.length)];

		String resalt = day + "の、天気は" + weather + "です。";
		return resalt;
		
	}
	
	public static boolean isEvenNumber(int value) {
		return (value % 2 == 0);
		
	}

	public static void main(String args[]) {
		int i = getRandomNumber();
		System.out.println(i);

		System.out.println(getWeatherForcast());
	}
	
	


}
