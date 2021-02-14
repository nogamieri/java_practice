
public class Example1 {

	class Group {
		String name;
		int p;

		// コンストラクタと呼ばれる new した時に自動で実行されるメソッド。これがあるとnewの時に（）内に直接内容書いて初期値を設定できる
		Group(String name, int p){
			this.name = name;
			this.p = p;
		}
	}

	    public static void main(String[] args) {


	    	Group[] g = new Group[5];
	        g[0] = new Group("snowman",9);
	        g[1] = new Group("Sixstones", 6);
	        g[2] = new Group("King&Princce", 9);
	        g[3] = new Group("SexyZone", 5);
	        g[4] = new Group("NEWS", 3);

	        int a = (int)(Math.random()*7)+3;

	        System.out.print(a);

	    }}
