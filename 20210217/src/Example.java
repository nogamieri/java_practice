class Rectangle {
	int width;
	int height;
	
	//コンストラクタ　newした時に自動で実行されるメソッド
	Rectangle(int w, int h){
		this.width = w;
		this.height = h;
	}
		void printInfo() {
			System.out.println("幅" + this.width + ", 高さ=" + this.height);
		}
		
		int getArea() {return this.width * this.height; }
		
		boolean isLargerThan(Rectangle r) {return this.getArea() > r.getArea(); }
	}

public class Example {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(5 , 3);
		r.printInfo();
		System.out.println(r.getArea());
		System.out.println(r.isLargerThan(r));
	}

}
