/*
 Q2] Write a JAVA program which will generate the threads:

- To display 20 terms of Fibonacci series.

- To display 1 to 9999 in reverse order.
 */


package Thursday_17th_Aug;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fibonacci_series extends Thread {
	public void run() {
		try {
			int n1=0,n2=1,n3,i,count=20;
			System.out.println("Fibonacci series is.....");
			 System.out.print(n1+" "+n2);//printing 0 and 1    
			    
			 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
			 {  
				 
			  n3=n1+n2;    
			  System.out.print(" "+n3);    
			  n1=n2;    
			  n2=n3;    
			 }    
   }
   catch (Exception ex)
   {
        ex.printStackTrace();
   }
	}
	
	

}
