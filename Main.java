/*
 Q1. Write a program that creates 2 threads - each displaying a message (Pass the message as a parameter to the constructor). The threads should display the messages continuously till the user presses ctrl+c.
 */

package Thursday_17th_Aug;

public class Main extends Thread {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1("Running thread1..");
		t1.start();
		Thread2 t2= new Thread2("Running thread2...");
		t2.start();
		
		
		
		
	}

}
