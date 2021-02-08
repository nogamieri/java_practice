public class Example {

	public static String getFetherForecast() {

		String[] days = { "今日は", "明日は", "明後日は" };
		String[] weathers = { "晴れ", "曇り", "雨", "雪", "雷" };

		int j = (int) (Math.random() * days.length);
		int i = (int) (Math.random() * weathers.length);

		String day = days[j];
		String weather = weathers[i];

		String result = day + weather;
		return result;
	}

	public static boolean isEvenNumber(int value) {
		return (value % 2 == 0);
	}

	public static void main(String[] args) {
		System.out.println(getFetherForecast());
		System.out.println(isEvenNumber(5));
	}

}
