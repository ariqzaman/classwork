package intro;

public class Student {
	//fields
	private String name;
	//constructor (no return type, it creates students)
	public Student(String name){
		//initialize fields
		this.name = name; 
	}
	
	public void talk(){
		System.out.println("hi my name is"+ name);
	}
}
