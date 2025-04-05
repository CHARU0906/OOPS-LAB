class CarRental { 
    private String carModel; 
    private double rentalPrice; 
    private boolean isAvailable; 
    // Setter methods 
    void setCarModel(String model) { 
        carModel = model; 
    } 
  
    void setRentalPrice(double price) { 
        if (price > 0) { 
            rentalPrice = price; 
        } else { 

            System.out.println("Rental price must be greater than zero."); 
        } 
    } 
    void setAvailability(boolean available) { 
        isAvailable = available; 
    } 
    // Getter methods 
    String getCarModel() { 
        return carModel; 
    } 
    double getRentalPrice() { 
        return rentalPrice; 
    } 
    boolean getAvailability() { 
        return isAvailable; 
    } 
  
    // Rent a car 
    void rentCar() { 
        if (isAvailable) { 
            isAvailable = false; 
            System.out.println(carModel + " has been rented."); 
        } else { 
            System.out.println(carModel + " is not available."); 
        } 
    } 
  
    // Return a car 
    void returnCar() { 
        isAvailable = true; 
        System.out.println(carModel + " has been returned."); 
    } 
} 
  
// Main class 
public class Main { 
    public static void main(String[] args) { 
        CarRental car = new CarRental(); 
        car.setCarModel("Toyota Corolla"); 
        car.setRentalPrice(50); 

        car.setAvailability(true); 
  
        System.out.println("Car Model: " + car.getCarModel()); 
        System.out.println("Rental Price: $" + car.getRentalPrice()); 
        System.out.println("Available: " + car.getAvailability()); 
  
        car.rentCar(); 
        car.returnCar(); 
    } 
} 
