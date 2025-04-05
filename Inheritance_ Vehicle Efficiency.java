class Vehicle { 

    String brand; 
    double fuelEfficiency; 
  
    public Vehicle(String brand, double fuelEfficiency) { 
        this.brand = brand; 
        this.fuelEfficiency = fuelEfficiency; 
    } 
  
    public void calculateFuelEfficiency() { 
        System.out.println("Fuel efficiency: " + fuelEfficiency + " km 
per liter"); 
    } 
} 
  
class Car extends Vehicle { 
    public Car(String brand, double fuelEfficiency) { 
        super(brand, fuelEfficiency); 
 
    } 
  
    @Override 
    public void calculateFuelEfficiency() { 
        System.out.println("Car Fuel efficiency: " + fuelEfficiency + "  
 
km per liter"); 
    } 
} 
  
class Truck extends Vehicle { 
    double load; 
  
    public Truck(String brand, double fuelEfficiency, double load) { 
        super(brand, fuelEfficiency); 
        this.load = load; 
    } 
 
  
    @Override 
    public void calculateFuelEfficiency() { 
        double reducedEfficiency = fuelEfficiency - (load * 0.1); // 
Load decreases efficiency 
        System.out.println("Truck Fuel efficiency: " + 
reducedEfficiency + " km per liter"); 
    } 
} 
  
public class pract { 
    public static void main(String[] args) { 
 
        Vehicle car = new Car("Toyota", 15); 
        Vehicle truck = new Truck("Ford", 10, 500); 
  
        car.calculateFuelEfficiency(); 
        truck.calculateFuelEfficiency(); 
    } 
}
