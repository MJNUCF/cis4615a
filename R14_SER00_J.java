/******************************************************************************
 *  Compilation:  javac R14_SER00_J.java
 *  Execution:    java R14_SER00_J
 *
 *  Creates an instance of the gameweapon class and uses its toString method
 *
 ******************************************************************************/
 
import java.util.*;
import java.io.*;
import java.math.*;

public class R14_SER00_J {

    public static void main(String[] args) {
	
    GameWeapon a1 = new GameWeapon();
    
    System.out.println(a1.toString());
      
    }
}

    /*
     * Rule 14. Serialization (SER)
     * Correct code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/SER00-J.+Enable+serialization+compatibility+during+class+evolution
     *
     *Rule 14-SER00
     */
     

class GameWeapon implements Serializable {
  private static final long serialVersionUID = 24L;
 
  int numOfWeapons = 10;
         
  public String toString() {
    return String.valueOf(numOfWeapons);
  }
}
