package arrays;
import java.util.Arrays;

public class ArraySearch {
//
	public static void main(String[] args) {

		int[] arr = {2, 3, 4, 5, 6, 7, 12, 15, 16};
		
//		System.out.println(searchSorted(arr , 10));
		
//		//if(checkHalfway(arr, 12, 0, arr.length-1)){
//		System.out.println("The number you are searching for is less than the value in the middlwe of the array");
//		}else{
//			System.out.println("the number you are searching for is equal or greater than the value in the middle of the array");
//		}
}



////	    public static int searchSorted(int[] sortedArrayToSearch, int key){
////	    /**
////	     * this method is exactly like the one above, except the parameter sortedArrayToSearch will
////	     * always be sorted in DESCENDING order. Again return the index of the key or return -1
////	     * if the key is not in the array
////	     * 
////	     * Note: You should attempt to write a method that is more efficient that searchUnsorted
////	     * */
////	    
////	    	
////	     return -1;
////	    }
//	
//	    
//	    private static boolean checkHalfway(int[] arr, int searchValue, int begin, int end){
//			return searchValue < arr[(begin+end+1)];
//	    	
//	    }
public static double[] getStats(double[] array){
    /** 
     * This method return a double[] contain a WHOLE BUNCH of stats
     * The double array must keep the following stats about the array parameter:
     * index 0 = the mean
     * index 1 = the max
     * index 2 = the min
     * index 3 = the median
     * index 4 = the number of values greater than or equal to the mean
     * index 5 = the number of values below the mean
     * */
    
     double[] stats = new double[6];
         stats[0] = findMean(array);
         stats[1] = findMax(array);
         stats[2] = findMin(array);
         stats[3] = findMed(array);
         stats[4] = findGreaterMean(array, findMean(array));
         stats[5] = findLessMean(array, findMean(array));
         
       //  System.out.println("My mean is " + stats[0]);
         //System.out.println("My max is " + stats[1]);
        // System.out.println("My min is " + stats[2]);
        // System.out.println("My med is " + stats[3]);
        // System.out.println("My greater mean is " + stats[4]);
        // System.out.println("My less mean is " + stats[5]);
     return stats;
}
private static double findLessMean(double[] array, double mean) {
		// TODO Auto-generated method stub
    	double lessMean = 0.00;
    	for(int i =0; i <array.length; i++)
    	{
    		if(array[i] < mean )
    		{
    			lessMean++;
    		}
    	}
		return lessMean;
	}

	private static double findGreaterMean(double[] array, double mean) {
		// TODO Auto-generated method stub
		double greaterMean = 0.00;
    	for(int i =0; i <array.length; i++)
    	{
    		if(array[i] > mean || array[i] == mean)
    		{
    			greaterMean++;
    		}
    	}
		return greaterMean;
	}

	private static double findMed(double[] array) {
		// TODO Auto-generated method stub
		double median = 0.00;
		sortArray(array);
		if(array.length % 2 == 0)
		{
			median = ((double)array[array.length/2] + (double)array[array.length/2 - 1])/2;
		}
		else
		{	
			median = (double) array[array.length/2];
		}
		return median;
	}

	private static void sortArray(double[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i<array.length;i++)
		{
			for(int j = i+1; j<array.length; j++)
			{
				double temp = array[i];
				double temp2 = array[j];
				
				if(temp > temp2)
				{
					array[i] = temp2;
					array[j] = temp;
				}
			}
		}
	}

	private static double findMin(double[] array) {
		// TODO Auto-generated method stub
    	sortArray(array);
		return array[0];
	}

	private static double findMax(double[] array) {
		// TODO Auto-generated method stub
    	sortArray(array);
		return array[array.length-1];
	}

	private static double findMean(double[] array) {
		// TODO Auto-generated method stub
    	double mean = 0.00;
		for(int i = 0; i<array.length; i++)
		{
			mean = mean + array[i];
		}
		return mean/array.length;
	}
	    
}