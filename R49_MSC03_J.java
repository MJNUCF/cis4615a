/******************************************************************************
 *  Compilation:  javac R49_MSC03_J.java
 *  Execution:    java R49_MSC03_J
 *
 *  Pings a set IP address (the google DNS) and handles the IP address properly.
 *  When trying to call Arrays.fill(ipAddress,  (byte) 0) like in the example
 *  I got "no suitable method found for fill(char[],int)" so I filled with '0'
 *  instead. I am not sure if this still provides the intended outcome.
 *
 ******************************************************************************/

import java.util.*;
import java.io.*;
import java.net.*;

public class R49_MSC03_J {
    
    public static void main(String[] args) throws UnknownHostException, IOException {
        
        /*
         * Rule 49. Miscellaneous (MSC)
         * Corrected code per:
         * https://wiki.sei.cmu.edu/confluence/display/java/MET01-J.+Never+use+assertions+to+validate+method+arguments
         *
         * Rule 49-MSC03
         */
         
        char[] ipAddress = new char[100];
        int offset = 0;
        int charsRead = 0;
        BufferedReader br = null;
        
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("serveripaddress.txt")));
            while ((charsRead = br.read(ipAddress, offset, ipAddress.length - offset))!= -1) {
                offset += charsRead;
                if (offset >= ipAddress.length) {
                    break;
                }
            }

            InetAddress google = InetAddress.getByName(new String(ipAddress));

            if (google.isReachable(5000))
                System.out.println("Host is reachable"); 
            else
                System.out.println("Host is unreachable"); 
            
        } finally {
            Arrays.fill(ipAddress,  '0');
            br.close();
        }
    }
}






