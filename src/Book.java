
public class Book {
	// i created the books with attributes
	private int ID;
	private  String bookName;
	private  String author;
	private String genre;
	
	public Book (int ID, String bookName, String author, String genre) {
		this.ID = ID;
		this.bookName = bookName;
		this.author = author;
		this.genre = genre;
	}
	// i generated only getters, not setters because i'm not setting or changing any data
	public int getID() {
		return ID;
	}

	public String getBookName() {
		return bookName;
		//this is used in search title method
	}

	public String getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
	}
	
	

}
