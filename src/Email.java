import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String email;
	private String password;
	private static Character[] passTemplate = {
			'A','B','C','D','E','F','G','H','I','J',
			'K','L','M','N','O','P','Q','R','S','T',
			'U','V','W','X','Y','Z','a','b','c','d',
			'e','f','g','h','i','j','k','l','m','n',
			'o','p','q','r','s','t','u','v','w','x',
			'y','z','!','@','#','$','%','^','&','*',
			'(',')','-','_','=','+','1','2','3','4',
			'5','6','7','8','9'
			};
	
	Email() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Your First Name: ");
		this.firstName = scanner.next();
		System.out.println("Please Enter Your Last Name: ");
		this.lastName = scanner.next();
		System.out.println("Please Enter Your Department: ");
		this.department = scanner.next();
		this.email = this.genEmail();
		this.password = this.genPassword();
	}
	
	public String genEmail() {
		return this.firstName + "." + this.lastName + "@" + this.department + ".company.com";
	}
	
	public String genPassword() {
		String password = "";
		int rand;
		for (int i = 0; i < 12; i++) {
			rand = (int) Math.floor(Math.random() * passTemplate.length);
			password += passTemplate[rand];
		}
		return password;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public String getPass() {
		return this.password;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setPassword(String pass) {
		this.password = pass;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

}
