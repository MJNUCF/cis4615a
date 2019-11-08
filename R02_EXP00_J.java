/******************************************************************************
 *  Compilation:  javac R02_EXP00_J.java
 *  Execution:    java R02_EXP00_J
 *
 *  creates and deletes a file
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
     
class MyFile{

    public void deleteFile(){
     
        File someFile = new File("someFileName.txt");
        // Do something with someFile
        someFile.delete();
     
    }
}
