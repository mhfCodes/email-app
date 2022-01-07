import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String email;
	private String password;
	private int defaultPasswordLength = 8;
	
	Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Please Enter Your Department: ");
		this.department = this.setDepartment();
		this.email = this.genEmail();
		this.password = this.genPassword(defaultPasswordLength);
	}
	
	private String setDepartment() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please Enter Your Department Number:\n(1 = sales, 2 = development, 3 = accounting)\n");
		int choice = scanner.nextInt();
		if (choice == 1) { return "sales"; }
		else if (choice == 2) { return "development"; }
		else if (choice == 3) { return "accouting"; }
		else { return ""; }
	}
	
	private String genEmail() {
		return this.firstName + "." + this.lastName + "@" + this.department + ".company.com";
	}
	
	private String genPassword(int length) {
		String passwordTemplate = "ABCDEFGHIJKLMNOPRQSTUVWXYZ123456789!@#$%^";
		char[] password = new char[length];
		int rand;
		for (int i = 0; i < length; i++) {
			rand = (int) (Math.random() * passwordTemplate.length());
			password[i] = passwordTemplate.charAt(rand);
		}
		return new String(password);
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
	
	public String showInfo() {
		return "Name: " + this.firstName + " " + this.lastName + "\n" +
				"Email: " + this.email + "\n" + "Department: " + this.department;
	}

}
