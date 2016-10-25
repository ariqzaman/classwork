package arrays;
import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {

		int[] arr = {0,9,10,11,4,3,8,9};
//		//swaps first n last
//		swap(arr, 0, arr.length-1);
		
		longestConsecutiveSequence(arr);
	}
	

    public static int longestConsecutiveSequence(int[] array1){
        /**This method counts the longest consecutive sequence in an array.
         * It does not matter where the sequence begins
         * If there are no consecutive numbers, the method should return '1'
         * 
         * Examples:
         * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence '1,2,3,4,5' is 5 integers long 
         * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3 integers long
         * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no consecutive integers
         * */
    	
    	int counter = 1;
    	int longest = 1; 
        for(int i = 0; i<array1.length -1; i++){
        	if(array1[i] + 1==array1[i+1]){
        		counter++;
        		if(counter>longest){
        			longest = counter;
        		}
        	} else {
        		counter = 1;
        	}
        }
       
        
        System.out.println(longest);
        return longest;
    }

}
