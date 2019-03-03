/**
 * 
 */

/**
 * @author Megha
 *
 */
public class Lambda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyInterface1 myInterface;
		myInterface=() -> 3.14;
		System.out.println("Value for PI :"+ myInterface.getValueOfPI());

	}

}


