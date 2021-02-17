//java.util.Scannerのパッケージをインポートして使えるように
import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		//スキャナークラスをnew
		Scanner s = new Scanner(System.in);
		System.out.println("【2つの整数の和を計算します】");
		System.out.println("１つ目の整数を入力してください");
		int a = s.nextInt();
		System.out.println("２つ目の整数を入力してください");
		int b = s.nextInt();
		int sum = a + b;
		System.out.println("合計は" + sum + "です");
		
		System.out.println("名前を入力してください");
		String str = s.next();
		System.out.println("あなたの名前は" + str);
	}

}
