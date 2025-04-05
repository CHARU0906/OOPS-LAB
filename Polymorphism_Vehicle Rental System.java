Vehicle(String model, double rentalPrice) { this.model = 
model; 
this.rentalPrice = rentalPrice; 
} 
 
double calculateRental(int days) { // Polymorphic method return rentalPrice 
* days; 
} 
 
void displayDetails(int days) { System.out.println("Vehicle: " + model 
+ ", Rental 
Cost for " + days + " days: $" + calculateRental(days)); 
} 
 
} 
@Override 
double calculateRental(int days) { 
return super.calculateRental(days) * 0.9; // 10% discount for 
bikes 
} 
 
} Truck(String model, double rentalPrice, double weightLimit) { 
super(model, rentalPrice); this.weightLimit = 
weightLimit; 
} 
 
@Override 
double calculateRental(int days) { 
return super.calculateRental(days) + (weightLimit * 2 
* days); 

 
} 
 
 
} 
{ public static void main(String[] args) { 
objects (looping used) Vehicle vehicles[] = new Vehicle[3]; 
vehicles[0] = new Car("Sedan", 50); vehicles[1] = new 
Bike("Sports Bike", 30); 
vehicles[2] = new Truck("Heavy Truck", 80, 1000); int 
rentalDays = 5; 
for (Vehicle v : vehicles) { v.displayDetails(rentalDays); 
} 
} 
 
}
