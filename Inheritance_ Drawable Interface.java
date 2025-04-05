interface Drawable { 
    void draw(); 
} 
  
abstract class Shape implements Drawable { 
    abstract void displayInfo(); 
} 
  
class Circle extends Shape { 
    double radius; 
  
    public Circle(double radius) { 
        this.radius = radius; 
    } 
  
    @Override 
    public void draw() { 
        System.out.println("Drawing Circle"); 
    } 
  
    @Override 
    void displayInfo() { 
        System.out.println("Circle with radius: " + radius); 
    } 
} 
  
class Rectangle extends Shape { 
    double width, height; 
  
    public Rectangle(double width, double height) { 
        this.width = width; 
        this.height = height; 
    } 
  
    @Override 
    public void draw() { 
        System.out.println("Drawing Rectangle"); 
    } 
  

 
    @Override 
    void displayInfo() { 
        System.out.println("Rectangle with width: " + width + " and 
height: " + height); 
    } 
} 
  
public class pract { 
    public static void main(String[] args) { 
        Shape circle = new Circle(5); 
        Shape rectangle = new Rectangle(4, 6); 
  
        circle.draw(); 
        circle.displayInfo(); 
 
        rectangle.draw(); 
        rectangle.displayInfo(); 
    } 
} 
