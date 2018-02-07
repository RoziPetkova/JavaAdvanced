package l01Book;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getTitle().compareTo(o2.getTitle()) == 0 ? o1.getYear().compareTo(o2.getYear()) : o1.getTitle().compareTo(o2.getTitle());
	}

}
