package arrays;

public class ArraysMain {

	public static void main(String[] args) {
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
	}

}
//sdfg