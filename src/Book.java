
public class Book {
	// i created the books with attributes
	private int bookID;
	private  String bookName;
	private  String author;
	private String genre;
	
	public Book (int ID, String bookName, String author, String genre) {
		this.bookID = ID;
		this.bookName = bookName;
		this.author = author;
		this.genre = genre;
	}
	// i generated only getters, not setters because i'm not setting or changing any data
	public int getBookID() {
		return bookID;
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
