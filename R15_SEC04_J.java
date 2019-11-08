/******************************************************************************
 *  Compilation:  javac R15_SEC04_J.java
 *  Execution:    java R15_SEC04_J
 *
 *  Adds a value to a hash table, prints the table's contents and then attempts
 *  to remove the value
 *
 ******************************************************************************/

import java.util.*;
import java.io.*;
import java.math.*;

public class R15_SEC04_J {

    public static void main(String[] args) {
	
    SensitiveHash sh1 = new SensitiveHash();
    
    sh1.addEntry(1, "test1");
    sh1.addEntry(2, "test2");
    
    sh1.print();
    
    sh1.removeEntry(1);
    
    sh1.print();
      
    }
}

/*
 * Rule 15. Platform Security (SEC)
 * Incorrect code per:
 * https://wiki.sei.cmu.edu/confluence/display/java/MET01-J.+Never+use+assertions+to+validate+method+arguments
 *
 *Rule 15-SEC04
 */


class SensitiveHash {
  private Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
 
    public void addEntry(int key, String value) {
        ht.put(key, value);
    }
 
    public void removeEntry(Object key) {
        ht.remove(key);
    }
    
    public void print() {
        System.out.println(ht);
    }
}
