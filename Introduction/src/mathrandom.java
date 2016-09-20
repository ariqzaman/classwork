import java.util.Random;

public class mathrandom {

	public static void main(String[] args) {
		for(int index = 0; index < 10; index++){
			System.out.println("Roll #"+ (index + 1)+" die is" + rollFairDie());
		}

	}
	public static int rollFairDie(){
		Random gen = new Random();
		return gen.nextInt(6);
		
	}

}
