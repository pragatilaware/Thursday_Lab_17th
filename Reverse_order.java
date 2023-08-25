/*
 Q2] Write a JAVA program which will generate the threads:

- To display 20 terms of Fibonacci series.

- To display 1 to 9999 in reverse order.
 */


package Thursday_17th_Aug;

public class Reverse_order  extends Thread{
	public void run() {
		
		try {
			
			System.out.println("print the reverse no");
			System.out.println("\nreverse no is");
			for(int i=9999;i>1;i--) {
				System.out.println(i+" ");
				
			}
			System.out.println("\n");
			
			
		}
		catch( Exception e) {
			e.printStackTrace();
			
			
		}
	}

}
