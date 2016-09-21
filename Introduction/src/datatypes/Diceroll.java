package datatypes;

import java.util.Random;

public class Diceroll {
	

 public static void main(String[] args) {
	 int[] results = new int[6];
		int totalrolls = 1000;
		for(int index = 0; index< totalrolls; index++){
			int roll = rollUnfairDie();
		System.out.println("Roll #"+(index+1)+" die is "+ roll);	
		}
	 
 for(int i = 0; i < 6; i++){
	 int percentage = (int)(1000*(double)results[i]/totalrolls);
 System.out.println((i+1) + " was rolled "+percentage+ "%");
 }
 
 }
	public static int rollFairDie(){
		Random gen = new Random();
		return gen.nextInt(6);
		
	} 
 

 public static int rollUnfairDie(){
	 int roll = rollFairDie();
	 if (roll < 6){
		 return roll+1;
	 }

	 else return roll; 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 



 

 

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

}