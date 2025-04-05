public class bank { 
 
    public static void bookFlight(int passengers) throws IllegalArgumentException { 
        if (passengers <= 0) { 
            throw new IllegalArgumentException("Invalid number of passengers. Must be 
greater than 0."); 
        } else { 
            System.out.println("Flight booked successfully for " + passengers + " 
passengers."); 
        } 
    } 
 
    public static void main(String[] args) { 
        try { 
            // Step 4: Call the method inside try block 
            bookFlight(0);  // Change this value to test valid/invalid cases 
        }  
        catch (IllegalArgumentException e) { 
            System.out.println("Booking Failed: " + e.getMessage()); 
 
        }  
        finally { 
            System.out.println("Thank you for using the Flight Booking System."); 
        } 
    }
