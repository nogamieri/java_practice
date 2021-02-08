class Book {
	String title;
	String author;
	int price;
}
class Practice {
	
}

public class Test {
	public static void main(String[] args) {
		Book books[] = new Book[3];
		books[0] = new Book();
		books[0].title = "Java入門";
		books[0].author = "山田太郎";
		books[0].price =  1200;

		books[1] = new Book();
		books[1].title = "Java中級";
		books[1].author = "田中優樹";
		books[1].price =  2300;
		
		books[2] = new Book();
		books[2].title = "Java上級";
		books[2].author = "佐藤一郎";
		books[2].price =  1800;
		
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i].title);
		}
	}

}
