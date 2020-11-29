
public class Reader {
	// i created the readers and their attributes
	private int ID;
	private String nameReader;
	private String surnameR;
	private String address;
	private int age;
	
	public Reader (int ID, String nameReader, String surnameR, String address, int age) {
		this.ID =ID;
		this.nameReader = nameReader;
		this.surnameR = surnameR;
		this.address = address;
		this.age = age;
		
	}
// i just generated getters, not setters because i'm not setting or changing any data
	public int getID() {
		return ID;
	}

	public String getNameReader() {
		return nameReader;
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
