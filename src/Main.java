
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email email = new Email();
		
		System.out.println(email.getEmail());
		System.out.println(email.getPass());
		email.setEmail("mammadnobari@yahoo.com");
		email.setPassword("abcd1234");
		System.out.println(email.getEmail());
		System.out.println(email.getPass());
		
	}

}
