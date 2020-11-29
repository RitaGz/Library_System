
//import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

//	Scanner input = new Scanner(System.in);

	ArrayList<Book> booklist = new ArrayList<Book>();
	ArrayList<Reader> readerlist = new ArrayList<Reader>();

	String booksearch;
	String dataB;

	public static void main(String[] args) {
		// calling the constructors to print out in the console the books and/or the
		// readers lists
		new MainClass();
//		new DataBooks();//prints the list of books
//		System.out.println("\n");
//		new DataReaders();//prints the list if readers		
	}

	public MainClass() {//constructor

            System.out.println("********************Welcome Home, User!********************");
            System.out.println("              Please Select From The Following Options:               ");
            System.out.println("**********************************************************************");
            System.out.println("1: show the list of books");
            System.out.println("2: search a book by name");
            System.out.println("3: search a book by ID");
            System.out.println("4: search a book by author");
            System.out.println("5: show the list of readers");
            System.out.println("6: search a reader by name");
            System.out.println("7: search a reader by ID");
            System.out.println("8: exit library");
	    
        int userImput = 0;
         
        	do {
        		
        		try {
     	     	   
    	            Scanner imput = new Scanner (System.in);
    	            int option = imput.nextInt();
    	            
    	            if (!(userImput == 0)) {
    	            
    	 	            switch(option){
    	 	            case 1: 
    	 	            	break;
    	 	            case 2: 
    	 	            	break;
    	 	            case 3: 
    	 	            	break;
    	 	            case 4: 
    	 	                break;
    	 	            case 5: 
    	 	                break;
    	 	            case 6: 
    	 	                break;
    	 	            case 7: 
    	 	                break;   
    	 	            case 8: System.exit(0);
    	 	            }
    	 	            
    	 	         }else {
    	 	           System.out.print("Please, Try again");
    	 	           System.out.println("\n");
    	 	           }
    	 	       
    	            
    	        }catch(Exception e) {
    	     	   System.out.println("Something went wrong");
    	        	}
    	        
        	}while( userImput != 0);
	    	
	 }

}
