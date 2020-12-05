import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataReaders {
	ArrayList<Reader> readerArray = new ArrayList<Reader>();
	ArrayList<Reader> temporaryReaderArray = new ArrayList<Reader>();
	
	public DataReaders() {
		loadReaderD();
		printArray(readerArray);
		
	}
	
	//scanner to read the txt files of reader... people who are going to read the books	
	public ArrayList<Reader> loadReaderD () {
		try {
			BufferedReader readersR = new BufferedReader(new FileReader("C:\\Users\\rita_\\Documents\\codes\\Library System\\src\\Readers.txt"));
			String contentReaders = readersR.readLine();
			
			String[] dataR;//create an array of string that is going to hold the dataR
			
			int ID;
			String nameReader;
			String surnameR;
			String address;
			int age;
			
			while (contentReaders != null) { //while the content of the readers is not null...
				
				dataR = contentReaders.split(","); // split the data by comes
				ID = Integer.parseInt(dataR[0]); //the ids at position 0, have to be converted to integer numbers
				nameReader = dataR[1];
				surnameR = dataR[2];
				address = dataR[3];
				age = Integer.parseInt(dataR[0]);
			//with this i will print the ID and the names	
//				System.out.println("Reader ID number: "+ ID + ", " + nameReader);
//				System.out.println(contentReaders); // print all the list of readers
				
				Reader reader = new Reader(ID, nameReader, surnameR, address, age);//creating an instance of reader
				readerArray.add(reader);
				
				contentReaders = readersR.readLine();
			}
			
		 }catch (IOException e) {
			 Logger.getLogger(DataReaders.class.getName()).log(Level.SEVERE, null, e);
			 System.out.println("An error occurred.");
		}
		return readerArray;
	}
	//searching a reader by name
		public String searchReaderName() {
				System.out.println(" Please, enter the Reader's name that you are looking for: ");
				Scanner readerInput = new Scanner(System.in);
				String readerSearchInput = readerInput.nextLine();
				
			    if (readerSearchInput == null) 
			    	//return "\n No reader Available ";
			    	System.out.println("The Reader's name is not available on the list");
			    
				    for(int i = 0; i < readerArray.size(); i++){
				        if(readerSearchInput.equalsIgnoreCase(readerArray.get(i).getReaderName())){
		//		            return "\n reader Available";
				        	System.out.println("The Reader: " + readerSearchInput + " is available on the List");
				        }
				    }
					return readerSearchInput;
		}
		
		//searching reader by ID
		public String searchIDreader() {
				System.out.println(" Please, enter the Reader's ID that you are looking for: ");
				Scanner idReaderInput = new Scanner(System.in);
				int idReaderSearchInput = idReaderInput.nextInt();
				
			    //if (idReaderSearchInput == null)
			    	//return "\n No reader Available ";
			    	System.out.println("The Reader is not available on the list");
			    
				    for(int i = 0; i < readerArray.size(); i++){
				        if(readerArray.get(i).getReaderID() == idReaderSearchInput); {
		//		            return "\n Reader Available";
				        	System.out.println("The Reader: " + idReaderSearchInput + " is available on the list");
				        }
				    }
					return null ;
					
		}
		
		//sorting the objects inside reader file by alphabetic order using bubble sort
		public void BubbleSortReader() {
			
			String readerA;
			String readerB;

			for(int i = 0; i < readerArray.size(); i++) {
				for(int j = i+1; j < readerArray.size(); j++) { //j will be at one position ahead of i
					readerA = readerArray.get(i).getReaderName();//from the record at pos i get the object name there
					readerB = readerArray.get(j).getReaderName();
					
					if(readerA.compareToIgnoreCase(readerB) > 0) { //it compares one character against the other one
				/* +1 if readerA > readerB -->that means swap them! because B comes after A in alfabetic order
				 *  0 readerA and readerB would have the same value
				 * -1 readerA < readerB they dont need to be swapped, because A comes before B 
				 */
						temporaryReaderArray.add(readerArray.get(i));//adding the records to the temporary Array
						readerArray.set(i, readerArray.get(j));// the swapping is with objects comparing the names
						readerArray.set(j, temporaryReaderArray.get(0));
						temporaryReaderArray.clear();
						
						printArray(readerArray); // it will print every time the array was sorted until the last sortting 
					}
				}
			}
		}
		
		public void printArray(ArrayList<Reader> readerArray) {
					
					String toPrint = "[ ";
					for (int i = 0; i < readerArray.size(); i++) {
						toPrint = toPrint +  readerArray.get(i).getReaderName() + ", ";
					//	toPrint += readerArray.get(i).getReaderName() + ", ";
					}
					toPrint += "]";
					System.out.println(toPrint);
		
		}
	
		
}
