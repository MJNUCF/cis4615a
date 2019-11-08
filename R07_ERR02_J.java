/******************************************************************************
 *  Compilation:  javac R07_ERR02_J.java
 *  Execution:    java R07_ERR02_J
 *
 *  Tries to open a file to be read and catches any permissions errors
 *
 ******************************************************************************/

import java.io.*; 

public class R07_ERR02_J {

    public static void main(String[] args) {
	
        /*
         * Rule 07. Exceptional Behavior (ERR)
         * Incorrect code per:
         * https://wiki.sei.cmu.edu/confluence/display/java/ERR02-J.+Prevent+exceptions+while+logging+data
         *
         * Rule 07-ERR02
         */
    
        try
        {
        FileReader fr = new FileReader("C:\\Users\\pankaj\\Desktop\\test.txt"); 
        } catch (SecurityException se) {
            
          System.err.println(se);
          // Recover from exception
          
        }
        catch (FileNotFoundException out) {
            
          System.err.println(out);
          
        }
    }
}
