import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Example1 {

		public static void main (String[] args)  throws IOException1{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("キーボードで入力して");

			String str = new String(br.readLine());

			System.out.println("入力されたのは　" + str + "　です");

		}
}
