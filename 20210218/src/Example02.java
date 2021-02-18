import java.util.Scanner;

public class Example02 {
	

	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String[] choices = {"グー", "チョキ", "パー", "やめる"};
		
		System.out.println("じゃんけんゲームのはじまりです。");
		System.out.println("あなたはなにを出しますか？");
		System.out.println("[0]グー  [1]チョキ  [2]パー  [9]やめる");
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		int pc = (int)(Math.random()*3)+1;
		if (choice == 9) {
			System.out.println("ゲームを終了します");;
			}
		else if (choice == pc){
			System.out.println("あなた：" + choices[choice] + " コンピューター：" + choices[pc]);
			System.out.println("引き分けです");
		}else if (choice > pc) {
			System.out.println("あなた：" + choices[choice] + " コンピューター：" + choices[pc]);
			System.out.println("あなたの負けです");
		}else if (choice < pc) {
			System.out.println("あなた：" + choices[choice] + " コンピューター：" + choices[pc]);
			System.out.println("あなたの勝ちです");
		}
		}

}
