package datatypes;

public class StringPractice {

	public static void main(String[] args) {
		//String text = new String ("hello world");
		String text = "hello world";// same as above
		String text2 = "hello ";
		String text3 = "world";
			if (text.equals(text2+text3)){
				System.out.println("these string r equal");
			}
			
			String word1 = "kek";
			String word2 = "kuk";
			if (word1.compareTo(word2) < 0){
				System.out.println("word1 is b4 word2");
			}

	}

}
