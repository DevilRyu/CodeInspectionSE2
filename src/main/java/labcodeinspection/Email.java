package labcodeinspection;

import java.util.Locale;

@SuppressWarnings("PMD.UseUtilityClass")
/**
*
*
* @class Email
*/
public class Email {

	private String m_firstName; //NOPMD This field will be manipulated later
	private String m_lastName; //NOPMD 
	private String password = null; //NOPMD 
	private String department; //NOPMD 
	private int defaultpasswordLength = 8; //NOPMD 
	private String email; //NOPMD 

	/**
	*
	*
	* @constructor Email
	* @param firstName
	* @param lastName
	*/
	public Email(String firstName, String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}

	/**
	*
	*
	* @method showInfo
	* @param firstName
	* @param lastName
	*/
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}
	
	/**
	*
	*
	* @method showInfo
	* @param depChoice
	*/
	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			this.department = "apk";
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}

	/**
	*
	*
	* @method generateEmail
	*/
	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpasswordLength);
		String nombre = this.m_firstName.toLowerCase(Locale.US);
		String apellido = this.m_lastName.toLowerCase(Locale.US);
		this.email = nombre + apellido + "@" + this.department
				+ ".espol.edu.ec";
	}
}
