/******************************************************************************
 *  Compilation:  javac R13_FIO02_J.java
 *  Execution:    java R13_FIO02_J
 *
 *  Creates a file and tries to delete it
 *
 ******************************************************************************/

import java.util.*;
import java.io.*;

public class R13_FIO02_J {

    public static void main(String[] args) {
        
    /*
     * Rule 13. Input Output (FIO)
     * Incorrect code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/FIO02-J.+Detect+and+handle+file-related+errors
     *
     *Rule 13-FIO02
     */
    
        File file = new File(args[0]);
        file.delete();
      
    }
}
