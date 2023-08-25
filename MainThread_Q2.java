/*
 Q2] Write a JAVA program which will generate the threads:

- To display 20 terms of Fibonacci series.

- To display 1 to 9999 in reverse order.
 */


package Thursday_17th_Aug;

public class MainThread_Q2  extends Thread{
public static void main(String[] args) {
	   try {
		   
		   
		   
		   Reverse_order t2= new  Reverse_order ();
		   t2.start();
		   
		   Thread.sleep(2000);
		   Fibonacci_series t1 = new Fibonacci_series();
		   t1.start();
		   
		  
		   
	   }catch(Exception e) {
		   e.printStackTrace();
		   
	   }
	
}
}
