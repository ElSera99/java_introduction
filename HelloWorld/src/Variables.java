
// Importing date clase to be used
import java.util.Date;

public class Variables {
    public static void main(String[] args) throws Exception {
        /*Usage of primitive types*/ 
        // This class will help with the usage of variables
        System.out.println("Age Initialization");
        byte age = 26;
        System.out.println(age);

        // Re-assignment of value of a variable
        System.out.println("New value of age assigned");
        age = 27;
        System.out.println(age);

        // Define big integer
        // In order to avoid Java compiler errors, make sure to add an "L" at the end of long data types
        long reelsWatchedYearly = 123_123_368_291L;
        // In order to avoid Java compiler errors, make sure to add an "F" at the end of float data types
        float paymentDollars = 0.55F;
        // Ensure to enclose single characters in single quotes '' and strings in double quotes ""
        char category = 'A';
        boolean isElegible = false;

        /*Usage of reference types*/
        /* When declaring primitive types, is not necessary to allocate memory, however,
         * when using reference types, is necessary to allocate memory via the keyword: new
         */
        Date now = new Date(); // Instance of date class
        // Use method getTime from Date instance
        now.getTime();
        System.out.println(now);
    }
}
