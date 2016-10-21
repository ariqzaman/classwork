package arrays;
import java.util.Arrays;

public class ArraySearch {

	public static void main(String[] args) {

		int[] arr = {5,7,8,9,10,20};
		
		System.out.println(searchSorted(arr , 10));
		
		checkHalfway(arr, 12, 0, arr.length-1);
	}



	    public static int searchSorted(int[] sortedArrayToSearch, int key){
	    /**
	     * this method is exactly like the one above, except the parameter sortedArrayToSearch will
	     * always be sorted in DESCENDING order. Again return the index of the key or return -1
	     * if the key is not in the array
	     * 
	     * Note: You should attempt to write a method that is more efficient that searchUnsorted
	     * */
	    
	    	
	     return -1;
	    }
	    
	    private static boolean checkHalfway(int[] arr, int searchValue, int begin, int end){
			return false;
	    	
	    }
}