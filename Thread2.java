/*
 Q. Write a program that creates 2 threads - each displaying a message (Pass the message as a parameter to the constructor). The threads should display the messages continuously till the user presses ctrl+c.
 */

package Thursday_17th_Aug;

public class Thread2  extends Thread{
	
	 String msg="";
	 
	 Thread2( String msg){
		 this.msg=msg;
		 
		 
	 }
	 public  void run() {
		 try {
			 while(true) {
				 System.out.println(msg);
				 Thread.sleep(2000);
				 
				 
			 }
			 
		 }catch(Exception e) {
			 e.printStackTrace();
			 
		 }
		 
	 }

}
