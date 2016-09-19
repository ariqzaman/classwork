/**
 * 
 */
package intro;

/**
 * @author Student6
 *this class is designed to contrast with the procedural example
 *it embodies an object oriented approach
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student jillian = new Senior("Jillian","programmer");
		Student jordan = new Soph("Jordan","nurse");
		Student jason = new Student("Jason");
		jillian.talk();
		jordan.talk();
		jason.talk();
	}

}
