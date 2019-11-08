/******************************************************************************
 *  Compilation:  javac R04_STR03_J.java
 *  Execution:    java R04_STR03_J
 *
 *  Tries to encode a BigIntiger into a string and then repeats it and prints
 *  to show the result
 *
 ******************************************************************************/

import java.util.*;
import java.io.*;
import java.math.*;

public class R04_STR03_J {

    public static void main(String[] args) {
    
    /*
     * Rule 04. Characters and Strings (STR)
     * Incorrect code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/STR03-J.+Do+not+encode+noncharacter+data+as+a+string
     *
     *Rule 04-STR03
     */
	
    BigInteger x = new BigInteger("530500452766");
    byte[] byteArray = x.toByteArray();
    String s = new String(byteArray);
    byteArray = s.getBytes();
    x = new BigInteger(byteArray);
    
    System.out.println(x);
      
    }
}
