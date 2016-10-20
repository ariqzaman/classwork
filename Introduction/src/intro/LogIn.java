package intro;

import java.util.Scanner;

public class LogIn {

	
		
		static Scanner input = new Scanner(System.in);
		
		//////========================================
		
		public static String waitForEntry(){
			return input.nextLine();
		}

	
	private static String username = "test_user";
	private static String password = "test";
	
	public static void main(String[] args){
		//1 point user has one chance to enter name
	 if (correctUser()){
		 askPassword();
	 }
	 else
	 {
		 System.out.println("wrong user pls contact network admin");
		 
	 	}
	 
	}
	
	private static boolean correctUser() {
		System.out.println("Print username");
		//1 point to ask user for userbname
		if(waitForEntry().equals(username)){
			return true;
			}
		return false;
		//could also do return waitForEntry().equals(username); because it already returns true if it matches
	}

	private static void askPassword() {
		boolean inLoop = true;
		int remainingTries = 3;
		//one point use loop
		while(inLoop){
			System.out.println("print password");
			String entry = waitForEntry();
				if(entry.equals(password)){
					System.out.println("u got in!");
					inLoop = false;
				}else{
					remainingTries--;
					if(remainingTries == 0){
						System.out.println("invalid password");
						inLoop = false;
					}else{
						System.out.println("you have "+ remainingTries +" tries left.");
					}
				}
			}
		
	}


	
}