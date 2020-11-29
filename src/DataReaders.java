import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReaders {
	//scanner to read the txt files of reader... people who are going to read the books
		
	public DataReaders () {
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
				System.out.println("Reader ID number: "+ ID + ", " + nameReader);
//				System.out.println(contentReaders); // print all the list of readers
				
				contentReaders = readersR.readLine();
			}
			
		 }catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
