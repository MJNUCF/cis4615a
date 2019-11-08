/******************************************************************************
 *  Compilation:  javac R49_MSC03_J.java
 *  Execution:    java R49_MSC03_J
 *
 *  Pings a set IP address (the google DNS)
 *
 ******************************************************************************/

import java.util.*;
import java.io.*;
import java.net.*;

public class R49_MSC03_J {
    
    public static void main(String[] args) throws UnknownHostException, IOException {
	
    IPaddress ip = new IPaddress();
    
    InetAddress google;
    
    google = InetAddress.getByName(ip.ipAddress);
    
    if (google.isReachable(5000))
        System.out.println("Host is reachable"); 
    else
        System.out.println("Host is unreachable"); 
    }
}

/*
 * Rule 49. Miscellaneous (MSC)
 * Incorrect code per:
 * https://wiki.sei.cmu.edu/confluence/display/java/MET01-J.+Never+use+assertions+to+validate+method+arguments
 *
 * Rule 49-MSC03
 */

class IPaddress {
  String ipAddress = new String("8.8.8.8");
}



