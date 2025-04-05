abstract class Vehicle { 
    protected String model; 
  
    public Vehicle(String model) { 
        this.model = model; 
    } 
  
    public abstract void startEngine(); 
} 
  
class Car extends Vehicle { 
    public Car(String model) { 
        super(model); 
    } 
  
    @Override 
    public void startEngine() { 
        System.out.println("Car " + model + " engine started."); 
    } 
} 
  
class Truck extends Vehicle { 
    public Truck(String model) { 
        super(model); 
    } 
  
    @Override 
    public void startEngine() { 

        System.out.println("Truck " + model + " engine started."); 
    } 
} 
  
public class VehicleManagement { 
    public static void main(String[] args) { 
        Vehicle car = new Car("Sedan"); 
        Vehicle truck = new Truck("Freight"); 
  
        car.startEngine(); 
        truck.startEngine(); 
    } 
}
