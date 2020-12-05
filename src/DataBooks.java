import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Scanner;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBooks {
	/* this class does: reading books from file
	 * searching by titles
	 * and sort the books in alphabetic order
	 */
	ArrayList<Book> bookArray = new ArrayList<>();
	ArrayList<Book> temporaryArray = new ArrayList<>();
	
	public DataBooks() {
		loadBookD();
//		searchByTitle();
		//BubbleSortBook();
		printArray(bookArray);
//		ArrayList<Book> bookArray = loadBookD();

	}
	public ArrayList<Book> loadBookD () {
		
		//scanner to read the txt files of books...i couldn't use full path...
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
	// creation of the instance of the Book with parameters...				
					Book book = new Book(ID, nameBook, author, genre);
					bookArray.add(book);
 		//so now i can print by name of the book and author
//					System.out.println(nameBook + ", by " + author);
					
//					System.out.println(contentBook); // prints the full list of books
//					System.out.println(dataB[0]); // it prints just the IDs at position 0
//					System.out.println(dataB[1]); // it will print the names of the books
//					System.out.println(dataB[2]);
//					System.out.println(dataB[3]);
					contentBook = bookReader.readLine();// read while there are lines to read
				}
				
			 }catch (IOException e) {
				Logger.getLogger(DataBooks.class.getName()).log(Level.SEVERE, null, e);
				System.out.println("An error occurred.");
			  }
			return bookArray;
	}
	
//searching by book title
	public String searchByTitle() {
			System.out.println(" Please, enter the Book you are looking for: ");
			Scanner bookInput = new Scanner(System.in);
			String titleSearchInput = bookInput.nextLine();
			
		    if (titleSearchInput == null) 
		    	//return "\n No Books Available ";
		    	System.out.println("The book is not available");
		    
			    for(int i = 0; i < bookArray.size(); i++){
			        if(titleSearchInput.equalsIgnoreCase(bookArray.get(i).getBookName())){
	//		            return "\n Book Available";
			        	System.out.println("The book: " + titleSearchInput + " is available");
			        }
			    }
				return titleSearchInput;
		 
	}
	public String searchByAuthor() {
		System.out.println(" Please, enter the Author you are looking for: ");
		Scanner authorInput = new Scanner(System.in);
		String authorSearchInput = authorInput.nextLine();
		
	    if (authorSearchInput == null) 
	    	//return "\n No Books Available ";
	    	System.out.println("The book by this author is not available");
	    
		    for(int i = 0; i < bookArray.size(); i++){
		        if(authorSearchInput.equalsIgnoreCase(bookArray.get(i).getAuthor()) ){
//		            return "\n Book Available";
		        	System.out.println("The book by: " + authorSearchInput + " is available");
		        }
		    }
			return authorSearchInput;
	 
}
	//sorting the objects inside book file by alphabetic order using bubble sort
	public void BubbleSortBook() {
		
		String bookA;
		String bookB;

		for(int i = 0; i < bookArray.size(); i++) {
			for(int j = i+1; j < bookArray.size(); j++) { //j will be at one position ahead of i
				bookA = bookArray.get(i).getBookName();//from the record at pos i get the object name there
				bookB = bookArray.get(j).getBookName();
				
				if(bookA.compareToIgnoreCase(bookB) > 0) { //it compares one character against the other one
			/* +1 if bookA > bookB -->that means swap them! because B comes after A in alfabetic order
			 *  0 bookA and bookB would have the same value
			 * -1 bookA < bookB they dont need to be swapped, because A comes before B 
			 */
					temporaryArray.add(bookArray.get(i));//adding the records to the temporary Array
					bookArray.set(i, bookArray.get(j));// the swapping is with objects comparing the names
					bookArray.set(j, temporaryArray.get(0));
					temporaryArray.clear();
					
					printArray(bookArray); // it will print every time the array was sorted until the last sortting 
				}
			}
		}
	}
	
	public void printArray(ArrayList<Book> bookArray) {
			
			String toPrint = "[ ";
			for (int i = 0; i < bookArray.size(); i++) {
				toPrint = toPrint +  bookArray.get(i).getBookName() + ", ";
			//	toPrint += bookArray.get(i).getBookName() + ", ";
			}
			toPrint += "]";
			System.out.println(toPrint);

	}
	
	
}

