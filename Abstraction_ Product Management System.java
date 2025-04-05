abstract class Product { 
    protected String name; 
    protected double price; 
  
    public Product(String name, double price) { 
        this.name = name; 
        this.price = price; 
    } 
  
    public abstract void applyDiscount(); 
    public abstract void displayProductDetails(); 
} 
  
class Electronics extends Product { 
    public Electronics(String name, double price) { 
        super(name, price); 
\
 
    } 
  
    @Override 
    public void applyDiscount() { 
        price *= 0.9; // 10% discount 
        System.out.println("Discount applied to Electronics. New price: $" + price); 
    } 
  
    @Override 
    public void displayProductDetails() { 
        System.out.println("Electronics Product: " + name + ", Price: $" + price); 
    } 
} 
  
class Furniture extends Product { 
    public Furniture(String name, double price) { 
        super(name, price); 
    } 
  
    @Override 
    public void applyDiscount() { 
 
        price *= 0.85; // 15% discount 
        System.out.println("Discount applied to Furniture. New price: $" + price); 
    } 
  
    @Override 
    public void displayProductDetails() { 
        System.out.println("Furniture Product: " + name + ", Price: $" + price); 
} 
}
public class pract { 
public static void main(String[] args) { 
Product electronics = new Electronics("Smartphone", 600); 
Product furniture = new Furniture("Sofa", 1000); 
electronics.displayProductDetails(); 
electronics.applyDiscount(); 
electronics.displayProductDetails(); 
furniture.displayProductDetails(); 
furniture.applyDiscount(); 
furniture.displayProductDetails(); 
} 
} 
