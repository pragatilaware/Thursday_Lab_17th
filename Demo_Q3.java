/*
 Q 3. Write a Java program which creates only one object. If user attempts to create second object, he should not be able to create it. (Using user defined Exception).
 */

package Thursday_17th_Aug;

public class Demo_Q3 {
	
	public static void main(String[] args)
    {
         try
         {
              Test_Q3 t1 = new Test_Q3();
              Test_Q3 t2 = new Test_Q3();
              Test_Q3 t3 = new Test_Q3();
         }
         catch (NotMoreException ex)
         {
              System.out.println(ex);
         }
    }

}
