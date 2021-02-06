class Idol {
	String name;
	String group;
}

public class Test {

	public static void main(String[] args) {
		
		Idol j = new Idol();
		j.name = "末澤誠也";
		j.group = "Aぇgroup";
		
		Idol j1 = new Idol();
		j1.name = "加藤シゲアキ";
		j1.group = "news";
		
		Idol j2 = new Idol();
		j2.name = "北山宏光";
		j2.group = "Kis-my-ft2";
		
		Idol[] idols = new Idol[3];
		idols[0] = j;
		idols[1] = j1;
		idols[2] = j2;
		
		
	for (int i = 0; i < idols.length; i++) {
		System.out.println("推しアイドルの名は" + idols[i].name) ;
	}
		
	}

}
