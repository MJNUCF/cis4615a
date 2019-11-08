/******************************************************************************
 *  Compilation:  javac R13_FIO002_J.java
 *  Execution:    java R13_FIO002_J
 *
 *  Creates a file and tries to delete it
 *
 ******************************************************************************/

public class R13_FIO002_J {

    public static void main(String[] args) {
    
        File file = new File(args[0]);
        file.delete();
      
    }
}
