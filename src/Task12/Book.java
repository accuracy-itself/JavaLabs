package Task12;
import java.lang.reflect.Field;

class Book {
	private 	String title;
	private 	String author;
	private 	int price;
	private 	static int edition;

	Book(String title, String author, int price)
	{
		this.author = author;
		this.price = price;
		this.title = title;
	}

	Book()
	{

	}

	public boolean equals(Object obj) {
		if (obj == this) 
			return true;
		if (!(obj instanceof Book)) 
			return false;
		Field[] thisField = this.getClass().getDeclaredFields(); 
		Field[] objFields = obj.getClass().getDeclaredFields();

		if (thisField.length != objFields.length) 
			return false;
		Book book = (Book)obj;

		return this.author == book.author && this.price == book.price && this.title == book.title; 
	}	

	public int hashCode() {
		int hash = 0;
		hash = (title == null ? 0 : title.hashCode());
		hash = 29 * hash + (author == null ? 0 : author.hashCode());
		hash = 29 * hash + price;
		hash = 29 * hash + edition;
		return hash;
	}

	public String toString() {
		return this.author + "\n" + this.title + "\n" + Integer.toString(this.price) + "\n"; 
	}

	public Book clone() {
		Book book = new Book();
		book.title = this.title;
		book.author = this.author;
		book.price = this.price;
	
		return book;	
	}
}