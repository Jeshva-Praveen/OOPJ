class Book{
		String title;
		String author;
		double price;
		public Book(String title,String author,double price){
			this.title=title;
			this.author=author;
			this.price=price;
		}
		void displayInfo(Book book){
			System.out.println("Title of the book is :"+book.title);
			System.out.println("Author of the book is :"+book.author);
			System.out.println("Price of the book is :"+book.price);		
		}
}

public class library{
		public static void main(String[] args){
			Book book1=new Book("Effective java","joshua Bloch",45);
			Book book2=new Book("rich dad and poor dad","leela",18);
			book1.displayInfo(book1);
			book2.displayInfo(book2);
		}
}
