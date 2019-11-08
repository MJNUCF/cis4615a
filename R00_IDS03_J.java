/******************************************************************************
 *  Matthew Nipper
 *  Compilation:  javac R00_IDS03_J.java
 *  Execution:    java R00_IDS03_J
 *
 *  logs user login attempts and sanatizes the input.
 *
 ******************************************************************************/

import java.io.*;
import java.util.logging.Logger;

public class R00_IDS03_J {

    public static void main(String[] args) {
	
        Logger logger = Logger.getLogger("R00_IDS03_J");
    
        boolean loginSuccessful = true;
        String username = "asdf123";

        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
            logger.severe("User login failed for: " + sanitizeUser(username));
        }
        
        loginSuccessful = false;
        
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + sanitizeUser(username));
        } else {
            logger.severe("User login failed for: " + sanitizeUser(username));
        }
    }
    
    /*
     * Rule 00. Input Validation and Data Sanitization (IDS)
     * Corrected code per:
     * https://wiki.sei.cmu.edu/confluence/display/java/IDS03-J.+Do+not+log+unsanitized+user+input
     *
     * Rule 00-IDS03
     */
     
    public String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username))
            ? username : "unauthorized user";
    }
}
