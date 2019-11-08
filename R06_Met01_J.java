/******************************************************************************
 *  Compilation:  javac R06_Met01_J.java
 *  Execution:    java R06_Met01_J
 *
 *  Computes and returns the sum of the absolute value of parameters a and b
 *
 ******************************************************************************/

public class R06_Met01_J {

    public static void main(String[] args) {
	
       int a = 17;
       int b = 42;
       int c = getAbsAdd(a, b);
       System.out.println("a = " + a);
       System.out.println("b = " + b);
       System.out.println("c = " + c);

       a = Integer.MIN_VALUE;
       b = Integer.MAX_VALUE;
       c = getAbsAdd(a, b);
       System.out.println("a = " + a);
       System.out.println("b = " + b);
       System.out.println("c = " + c);
      
    }

    /*
     * Rule 06. Methods (MET)
     * Incorrect code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/MET01-J.+Never+use+assertions+to+validate+method+arguments
     *
     *Rule 06-Met01
     */


    public static int getAbsAdd(int x, int y) {
        assert x != Integer.MIN_VALUE;
        assert y != Integer.MIN_VALUE;
        int absX = Math.abs(x);
        int absY = Math.abs(y);
        assert (absX <= Integer.MAX_VALUE - absY);
        return absX + absY;
    }
}
