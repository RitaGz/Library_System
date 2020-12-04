import java.io.FileWriter;
import java.util.ArrayList;

public class Borrowings {
	FileWriter fwriter;
	
 // write to "borrowings" text file all the books have been borrowed using Collection frameworks
	public Borrowings() {
		
	}
	public void WriteToFile(Book bookName, Reader readerName) {
		ArrayList<Borrowings> borrowedBook = new ArrayList<Borrowings>();
		Borrowings.add(bookName.getBookName() + "," + readerName.getReaderName() );
		System.out.println("The Book: " + bookName.getBookName() + " was borrowed by: " + readerName.getReaderName() );
	
		try {
			fwriter = new FileWriter("Borrowings.txt", true);
			for(int i = 0; i < borrowedBook.size(); i++ ) {
				fwriter.write(i);
				fwriter.flush();
				fwriter.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void add(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
}
