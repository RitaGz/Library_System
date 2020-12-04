
//import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

//	Scanner input = new Scanner(System.in);

	ArrayList<Book> bookArray = new ArrayList<Book>();
	ArrayList<Reader> readerArray = new ArrayList<Reader>();
	
	public static void main(String[] args) {
		
		// calling the constructors and/or other classes
		
		new MainClass();
	//	new DataBooks();//prints the list of books
//		new DataReaders();//prints the list if readers
//		new SearchingBook();
		
	}

	public MainClass() {
		
	}
	
	public int menu() {

            System.out.println("********************Welcome Home, User!********************");
            System.out.println("              Please Select From The Following Options:               ");
            System.out.println("**********************************************************************");
            System.out.println("1: show the list of books");
            System.out.println("2: search a book by name");
            System.out.println("3: search a book by author");
            System.out.println("4: List all books by title and/or author name alphabetical order");
            System.out.println("5: show the list of readers");
            System.out.println("6: List all readers by alphabetical and/or ID order");
            System.out.println("7: Register that a reader has borrowed a book");
            System.out.println("8: Add a reader to the waiting list");//If a book is borrowed and another reader wants to borrow it
            System.out.println("9: reader has returned a book");
            System.out.println("10: Display the next reader waiting for a book");//If a book is returned and has a waiting queue, display to the user the next reader waiting for that book
            System.out.println("11: For a specific reader, list the books that they have borrowed");
            System.out.println("12: exit library");
	    
        int userInput = 0;
        int userAnswer = 0;
        
        	do {
        		Scanner inputSn = new Scanner (System.in);
        	//let the user input the option	
        		try {
        			System.out.println(
    						"Please select a number from 1 to 7 to start the searching or press 8 to quit the program.");
    				System.out.print("-> ");
     	     	   
    	            userInput = inputSn.nextInt();
    	            
    	            if (!(userInput == 0)) {
    	            String nameBook ;
    	 	            switch(userInput){
    	 	            case 1: 
							loadBookD(); //it has to print the dataB[1]
    	 	            	break;
    	 	            case 2: searchByTitle();
    	 	            	break;
    	 	            case 3: searchByAuthor();
    	 	            	break;
    	 	            case 4: BubbleSortBook();
    	 	                break;
    	 	            case 5: loadReaderData();
    	 	                break;
    	 	            case 6: BubbleSortReader();
    	 	                break;
    	 	            case 7: 
    	 	                break;
    	 	            case 8: 
    	 	            	break;
    	 	            case 9: 
    	 	            	break;
    	 	            case 10: 
    	 	            	break;
    	 	            case 11: 
    	 	            	break;
    	 	            case 12: System.exit(0);
    	 	            }
    	 	            
    	 	         }else {
    	 	           System.out.print("Sorry that is not a correct choise. Please, Try again");
    	 	           userInput = inputSn.nextInt();
    	 	           }
    	       
    	        }catch(Exception e) {
    	     	   System.out.println("Something went wrong, please try again.");
		    	     	  try {
		  					Thread.sleep(1000); // get the next step delayed
		  				} catch (InterruptedException e1) {
		  					
		  					e1.printStackTrace();
		  				}
    	        }
    	        
        	} while( !((userInput != 12) && (userInput < 12) && (userInput > 0)));
        	//while the user input is not 12 and less than 12 and bigger than 0, then keep asking me for option.
        	userAnswer = userInput;
				
				try { 
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				
	    	return userAnswer;
	 }

	private void BubbleSortReader() {
		// TODO Auto-generated method stub
		
	}

	private void loadReaderData() {
		// i need to create it...
		
	}

	private void BubbleSortBook() {
		BubbleSortBook();
		
	}

	private void searchByAuthor() {
		// i need to create the constructor in another class...
		
	}

	private void searchByTitle() {
		searchByTitle();
	}

	private void loadBookD() {
		loadBookD();
	}
	
	//calling the class SearchingBook.
			
		
			
			
			
	

}
