
public class Book {
	// i created the books with attributes
	private int ID;
	private String nameBook;
	private String author;
	private String genre;
	
	public Book (int ID, String nameBook, String author, String genre) {
		this.ID = ID;
		this.nameBook = nameBook;
		this.author = author;
		this.genre = genre;
	}
	// i generated only getters, not setters because i'm not setting or changing any data
	public int getID() {
		return ID;
	}

	public String getNameBook() {
		return nameBook;
	}

	public String getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
	}
	

}
