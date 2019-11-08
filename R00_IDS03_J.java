/******************************************************************************
 *  Matthew Nipper
 *  Compilation:  javac R00_IDS03_J.java
 *  Execution:    java R00_IDS03_J
 *
 ******************************************************************************/

import java.util.logging.Logger;

public class R00_IDS03_J {

    public static void main(String[] args) {
	
        Logger logger = Logger.getLogger("R00_IDS03_J");
    
        boolean loginSuccessful = true;
        String username = "asdf123";

        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }
        
        loginSuccessful = false;
        username = "asdf123";
        
        if (loginSuccessful) {
            logger.severe("User login succeeded for: " + username);
        } else {
            logger.severe("User login failed for: " + username);
        }
    }
}
