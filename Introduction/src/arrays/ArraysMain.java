package arrays;

public class ArraysMain {

	public static void main(String[] args) {
		long StartTime = System.currentTimeMillis();
		//arraysIntroMethod();
		String[] someStrings = new String[99];
		int ten = 10;
		System.out.println("ten is increased by"+ten);
		System.out.println("before "+ someStrings[99]);
		
		populateArray(someStrings);
		printArray(someStrings);
		changeString(someStrings[100]);
		long endTime = System.currentTimeMillis();
		System.out.println("completed method in " + (endTime - StartTime) + " seconds");
		changeArrayElement(someStrings, 99);
		SampleElement sample = new SampleElement(10);
		sample.increase();
		System.out.println("sample element has a number equal to"+ sample.getNumber());
	}
	public static void passByValueDemonstration(){
				
	}
	private static void changeArrayElement(String[] someStrings, int i) {
		// TODO Auto-generated method stub
		someStrings[i] = "new item"+ (i+1);
		
	}
	private static void changeArray(String[] someStrings){
		someStrings = new String[100];
		for(int index = 0; index < someStrings.length; index++){
			someStrings[index] = " new item "+ (index+1);
		}
	}
	
	public static void changeString(String s){
		s = "this shtring has been changed";
	}
	
	private static void printArray(String[] a) {
		// TODO Auto-generated method stub
		for(String s: a){
			System.out.println(s);
			}
	}

	private static void populateArray(String[] a) {
		// TODO Auto-generated method stub
		for(int index = 0; index < a.length; index++){
			a[index] = "value "+ (index+1);
		}
	}

	public static void arraysIntroMethod(){
		// construct 3 arrays
		//these 2 methods do the same thing
		//primitive type arrays fill with zeros 0, 0.0, false
		int[] zeros1 = {0,0,0};
		int[] zeros2 = new int[3];
		//example
		boolean[] booleans = new boolean[3];
		//iterate (2 ways)
		//WHEN TO USE THIS FOR LOOP
		// - the index of this data is important to the reference
		// - you need to cuztomize hour to iterate
			// - increase by 2, backwards, etc...
		for(int index = 0; index < booleans.length; index++){
			System.out.println(index+") " + booleans[index]);
		}
		//SECOND METHOD FOR-EACH
		//always goes in order, doesnt keep track of index
		//easier to type
		
		
		//for(boolean b:booleans){
		//	System.out.println(""+b);
		//	index++;
		//}
		
		
		//these 2 constructors are different
		String[] strings1 = {"","",""};
		String[] strings2 = new String[3];
//		strings2[0] = "value 1";
//		strings2[1] = "value 2";
//		strings2[2] = "value 3";
		
		//bottom one fills null not empty
		for(String s:strings1){
			System.out.println(s);
		}
		//this loop instantiates the strings
		for(int index = 0; index < strings2.length; index++){
			strings2[index] = "value "+ (index+1);
			
		}
		//this loop prints the strings
		for(String s:strings2){
			System.out.println(s);
		}
	}

}
