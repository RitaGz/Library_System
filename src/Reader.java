
public class Reader {
	// i created the readers and their attributes
	private int ID;
	private String readerName;
	private String surnameR;
	private String address;
	private int age;
	
	public Reader (int ID, String readerName, String surnameR, String address, int age) {
		this.ID =ID;
		this.readerName = readerName;
		this.surnameR = surnameR;
		this.address = address;
		this.age = age;
		
	}
// i just generated getters, not setters because i'm not setting or changing any data
	public int getID() {
		return ID;
	}

	public String getReaderName() {
		return readerName;
	}
	
	public String getSurnameR() {
		return surnameR;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}
	

}
