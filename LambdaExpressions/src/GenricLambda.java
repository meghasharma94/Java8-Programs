/**
 * @author Megha
 * This Program makes lambda function generic 
 * irrespective of the data type
 *
 */
@FunctionalInterface
interface GenericInterface<T>{
	
	T function(T t);
	
}
public class GenricLambda {

	static String str="Lambda";
	static int intVal=5;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GenericInterface<String> gString= (str) ->{
			
			String myResult="";
			for(int i=str.length()-1;i>=0;i--) {
				myResult+=str.charAt(i);
			}
			
			return myResult;
		};
		
		System.out.println("Reverse of String :"+ str+ ": is :"+gString.function(str));
		
		GenericInterface<Integer> gInt= (intVal) ->{
			
			int val=1;
			for(int i=1;i<=intVal;i++) {
				
				val = val* i;
			}
			
			return val;
		};
		
		System.out.println("Factorial of integer :"+ intVal+ ": is :"+gInt.function(intVal));
	}

}
