package l01Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book>{
	private String title; 	
	private Integer year;
	private List<String> authors;
	
	public Book(String title, int year, String...authors) {
		this.setTitle(title);
		this.setYear(year);
		this.setAuthors(authors);
	}
	
	private void setAuthors(String...authors) {
		this.authors = new ArrayList<>();
		if(authors.length > 0)
			this.authors.addAll(Arrays.asList(authors));
	}
	private void setTitle(String title) {
		this.title = title;
	}

	private void setYear(int year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public List<String> getAuthors() {
		return authors;
	}

	@Override
	public int compareTo(Book book) {
		return this.title.compareTo(book.getTitle()) == 0 ? this.year.compareTo(book.getYear()) : this.title.compareTo(book.getTitle());
	}

}
