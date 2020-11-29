import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.Scanner;
import java.util.Collections;
import java.util.Scanner;

public class DataBooks {
	
	ArrayList<Book> booklist = new ArrayList<Book>();
	String searchTitle() {
		return null;
	}
	
	public DataBooks () {
		//scanner to read the txt files of books...
			try {
				BufferedReader bookReader = new BufferedReader(new FileReader("C:\\Users\\rita_\\Documents\\codes\\Library System\\src\\Books.txt"));
				String contentBook = bookReader.readLine();
				
				String[] dataB;//create an array of string that is going to hold the dataB
				
				int ID;
				String nameBook;
				String author;
				String genre;
				
				while (contentBook != null) { //while the content of the book is not null...
					
					dataB = contentBook.split(","); // split the data by comes
					ID = Integer.parseInt(dataB[0]); //the ids at position 0, have to be converted to integer numbers
					nameBook = dataB[1]; //nameBook at position 1
					author = dataB[2]; // author at position 2
					genre = dataB[3]; // genre at position 3
		//so now i can print by name of the book and author
//					System.out.println(nameBook + ", by " + author);
					
					System.out.println(contentBook); // prints the full list of books
//					System.out.println(dataB[0]); // it prints just the IDs at position 0
//					System.out.println(dataB[1]); // it will print the names of the books
					
					contentBook = bookReader.readLine();// read while there are lines to read
				}
				
			 }catch (IOException e) {
				System.out.println("An error occurred.");
			  }
	}
	public String searchTitle(ArrayList<Book> booklist, String targetTitle) {
		
		String booksearch;
		
		System.out.println("Which book are you searching for today?");
		Scanner bookInput = new Scanner(System.in);
		booksearch = bookInput.nextLine();
		
		if (targetTitle == null) 
	    	return "\n No Book Avaliable ";
	    for(int i = 0; i < booklist.size(); i++){
	        if(targetTitle.equalsIgnoreCase(booklist.get(i).getNameBook())){
	            return targetTitle;
	        }
	    }
	    return "\n No Books Avaliable "; //reachable only if no book found
	}
}
