import java.util.*;

public class checkout {

	public static void main(String args[]) {
      try(Scanner sc =new Scanner(System.in)){
    	  
    	  
    	  try {
    		  System.out.println(50/0);
    	  }
    	  catch(ArithmeticException e) {
    		  System.out.println("You divided By zero");
    	  }
    	  int arr[] = new int [5];
    	  arr[5] = 90;
      }
      catch(ArrayIndexOutOfBoundsException e) {
    	  System.out.println("Array index of Bounds!");
      }
      //finally block is the last block  the closing block which alwaya gets executed
      //whether the exception is handled or not
      finally {
    	  //sc.close(); // closing the scanner object
    	  System.out.println("Finaly block gets executrd!");
      }
		
		
		
		
	}
