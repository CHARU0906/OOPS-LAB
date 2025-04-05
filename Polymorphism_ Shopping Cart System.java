class Product { 
String name; 
double price; 
 
public Product(String name, double price) { 
this.name = name; 
this.price = price; 
} 
public double calculateDiscount() { 
return 0; 
} 
 
 
public void displayProduct() { 
System.out.println(name + " - Price: $" + price + ", Discount: $" + 
calculateDiscount()); 
} 
} 
class Electronics extends Product { 
public Electronics(String name, double price) { 
super(name, price); 
} 

 
 
@Override 
public double calculateDiscount() { 
return price * 0.10; // 10% discount 
} 
} 
class Clothing extends Product { 
public Clothing(String name, double price) { 
super(name, price); 
} 
 
 
@Override 
public double calculateDiscount() { 
return price * 0.20; // 20% discount 
} 
} 
public class ShoppingCart { 
public static void main(String[] args) { 
Product[] cart = { 
new Electronics("Laptop", 1000), 
new Clothing("T-Shirt", 50), 
new Electronics("Smartphone", 800), 
new Clothing("Jeans", 70) 

 
}; 
System.out.println("Shopping Cart:"); 
for (Product p : cart) { 
p.displayProduct(); 
} 
} 
} 
