/*
 Q 3. Write a Java program which creates only one object. If user attempts to create second object, he should not be able to create it. (Using user defined Exception).
 */
package Thursday_17th_Aug;

public class Test_Q3 {
	
	static int cnt=0;
    Test_Q3() throws NotMoreException
    {
         if (cnt == 0)
         {
              cnt++;
         }
         else
              throw new NotMoreException();
    }

}

