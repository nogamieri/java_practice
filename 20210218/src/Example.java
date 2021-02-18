class VirtualPet{
	String name;
	int HP;
	int maxHP;
	
	VirtualPet(String name){
		this.name = name;
		this.HP = 50;
		this.maxHP = 100;
	}
	
	void printinfo() {
		System.out.println("名前" + this.name);
		System.out.println("体力" + this.HP);
		System.out.println("最大体力" + this.maxHP);
	}
	
	void run() {
		if(this.HP < 10) {
			System.out.println(name + ":体力が足りなくて走れません。");
		}else {
			System.out.println(name + ":走るよ。体力-10。最大体力+10");
			this.HP -= 10;
			this.maxHP += 10;
		}
	}
	void sleep() {
		System.out.println(name + ":おやすみなさい。体力完全回復");
		this.HP = this.maxHP;
	}
	
	void eat() {
		System.out.println(name + ":いただきます。体力回復30");
		this.HP += 30;
		if(this.HP > this.maxHP) {
			this.HP = this.maxHP;
		}
	}
}

class VirtualBird extends VirtualPet{
	VirtualBird(String name){
		super(name);
	}
	void run() {//スーパークラスのrunメソッドをオーバーライド
		System.out.println("ぼくは鳥なので走れません");
	}
	void fly() {
		System.out.println("飛ぶよ");
	}
}

public class Example {

	public static void main(String[] args) {
		VirtualBird vp = new VirtualBird("なにかしらのペット");
		vp.printinfo();
		vp.run();
		vp.sleep();
		vp.eat();
		vp.printinfo();
		vp.fly();

	}

}
