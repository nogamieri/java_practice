import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] choices = { "グー", "チョキ", "パー", "やめる" };

		System.out.println("じゃんけんゲームのはじまりです。");

		int k = 0;
		int h = 0;
		int m = 0;

		while (3 > (k + h + m)) {
			System.out.println("あなたはなにを出しますか？");
			System.out.println("[0]グー  [1]チョキ  [2]パー  [9]やめる");

			Scanner s = new Scanner(System.in);
			int choice = s.nextInt();
			int pc = (int) (Math.random() * 3) + 1;
			
			if (choice == 9) {
				System.out.println("ゲームを終了します");
			} else if (choice == pc) {
				System.out.println("あなた：" + choices[choice] + "  コンピューター：" + choices[pc]);
				System.out.println("引き分けです");
				System.out.println("");
				h++;
			} else if (choice > pc) {
				System.out.println("あなた：" + choices[choice] + "  コンピューター：" + choices[pc]);
				System.out.println("あなたの負けです");
				System.out.println("");
				m++;
			} else if (choice < pc) {
				System.out.println("あなた：" + choices[choice] + "  コンピューター：" + choices[pc]);
				System.out.println("あなたの勝ちです");
				System.out.println("");
				k++;
			}
			
			System.out.println("現在のスコアは" + k + "勝" + m + "負" + h + "引き分けです。");
			System.out.println("");
		}
		System.out.println("ゲームを終わります。");
		System.out.println("最終スコアは" + k + "勝" + m + "負" + h + "引き分けでした。");
	}

}
