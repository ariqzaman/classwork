package intro;

public class Soph extends Student {

	private String internship;
	public Soph(String name, String internship) {
		super(name);
		this.internship= internship;
		
	}
	
	public void talk(){
		super.talk(); 
		System.out.println(" and I am a soph!");
		System.out.println("I intern as a" + internship);
	}

}