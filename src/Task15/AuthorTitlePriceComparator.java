package Task15;

import java.util.Comparator;

public class AuthorTitlePriceComparator implements Comparator<Book> {
	public int compare(Book book1, Book book2) {
		int titleCompare = book1.getTitle().compareTo(book2.getTitle());
        int authorCompare = book1.getAuthor().compareTo(book2.getAuthor());
        int priceCompare = book1.getPrice() - book2.getPrice();

        return (authorCompare == 0) ? (titleCompare == 0 ? priceCompare : titleCompare ): authorCompare;
	} 
}