/******************************************************************************
 *  Compilation:  javac R02_EXP00_J.java
 *  Execution:    java R02_EXP00_J
 *
 *  Attempts to delete a file. Warns if the file does not exist.
 *
 ******************************************************************************/
 
import java.util.*;
import java.io.*;

public class R02_EXP00_J {

    public static void main(String[] args) {
	
        MyFile f1 = new MyFile ();
        f1.deleteFile();
      
    }
}

    /*
     * Rule 02. Expressions (EXP)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/EXP00-J.+Do+not+ignore+values+returned+by+methods
     *
     * Rule 02-EXP00
     */
     
class MyFile{

    public void deleteFile(){
     
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        
        if (!someFile.delete()) {
            // Handle failure to delete the file
            System.out.println("Could not delete file!");
        }
     
    }
}
