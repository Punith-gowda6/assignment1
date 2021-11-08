public class Account{
	private static Account obj;
	private Account() {
		System.out.println("Account Instance Created");
	}
	
	public static void createObject() {
		if(obj == null) {
			obj=new Account();
		}
		else {
			System.out.println("Object already created");
		}
	}
}