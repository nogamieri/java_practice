
import java.util.Scanner;
public class Sample {
	
	public static void main(String[] args) {
		System.out.println("じゃんけんゲームの始まりです");
		Scanner s = new Scanner(System.in);
		
		//人間の手
		String[] choices = { "グー", "チョキ", "パー", "やめる" };
		//PCの手
		int pc = (int) (Math.random() * 3) + 1;
		int k = 0;
		int h = 0;
		int m = 0;
		
		boolean playing = true; //ゲーム中はtrue, ゲームが終わればfalse
		 
		//ゲーム中は無限ループ
		while(playing) {
			System.out.println("あなたはなにを出しますか？");
			System.out.println("[0]グー  [1]チョキ  [2]パー  [9]やめる");
			
			int choice = s.nextInt();
			if (choice == 9) {
				playing = false;
				continue;
				}
			
			System.out.println("あなた：" + choices[choice] + "  コンピューター：" + choices[pc]);
			
			//勝敗の判定
			if(pc == choice) {h++;}
			else if((pc + 3 - choice) % 3 == 1) {k++;}
			else {m++;}
			System.out.println("現在のスコアは" + k + "勝" + m + "負" + h + "引き分けです。");
		}
		System.out.println("ゲームを終わります。");
		System.out.println("最終スコアは" + k + "勝" + m + "負" + h + "引き分けでした。");
	}

}
