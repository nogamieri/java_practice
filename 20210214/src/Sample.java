class Rectangle {
		int width;
		int height;

		//コンストラクタ
		Rectangle (int w, int h){
			this.width = w;
			this.height = h;
		}

		void printInfo() {
			System.out.println("幅" + this.width + "高さ" + this.height);
		}
	}

public class Sample {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(3,4);
		r.printInfo();
	}

}
