package l01Book;

import java.util.Iterator;

public class Library implements Iterable<Book> {
	private Book[] books;

	
	public Library(Book... book) {
		this.books = book;		
	}

	@Override
	public Iterator<Book> iterator() {
		return new LibIterator();
	}

	private final class LibIterator implements Iterator<Book> {

		private int currentUndex = 0;

		@Override
		public boolean hasNext() {
			return currentUndex < books.length && books[currentUndex] != null;
		}

		@Override
		public Book next() {
			return books[currentUndex++];
		}

	}
}
