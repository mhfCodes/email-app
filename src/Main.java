
public class Main {

	public static void main(String[] args) {
		Email email = new Email("john", "doe");
		
		System.out.println(email.showInfo());
		System.out.println(email.getPass());
		
		email.setEmail("johndoe@mycompany.com");
		email.setPassword("abcd1234");
		
		System.out.println(email.showInfo());
		System.out.println(email.getPass());
	}

}
