/******************************************************************************
 *  Compilation:  javac R03_NUM03-J.java
 *  Execution:    java R03_NUM03-J
 *
 *  Reads in an numeric input from the console into an int variable and prints
 *  it again
 *
 ******************************************************************************/

import java.util.*;
import java.io.*;

public class R03_NUM03_J {

    public static void main(String[] args) throws IOException {
        
        DataInputStream inputStream = new DataInputStream(System.in);
       
        int a = getInteger(inputStream);
        System.out.println(a);
      
        inputStream.close();
    }
    
    /*
     * Rule 03. Numeric Types and Operations (NUM)
     * Incorrect code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/NUM03-J.+Use+integer+types+that+can+fully+represent+the+possible+range+of++unsigned+data
     *
     *Rule 03-NUM03
     */

    public static int getInteger(DataInputStream is) throws IOException {
        return is.readInt(); 
    }
}
