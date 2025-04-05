abstract class Shape { abstract double calculateArea(); abstract double calculatePerimeter(); } 
class Circle extends Shape { double radius; 
public Circle(double radius) { 
    this.radius = radius; 
} 
 
@Override 
double calculateArea() { 
    return Math.PI * radius * radius; 
} 
 
@Override 
double calculatePerimeter() { 
    return 2 * Math.PI * radius; 
} 
  
} 
class Rectangle extends Shape { double width, height; 
public Rectangle(double width, double height) { 
    this.width = width; 
    this.height = height; 
} 
 
@Override 
double calculateArea() { 
    return width * height; 
} 
 
@Override 
double calculatePerimeter() { 
    return 2 * (width + height); 
} 

  
} 
public class pract { public static void main(String[] args) { Shape circle = new Circle(5); Shape 
rectangle = new Rectangle(4, 6); 
   System.out.println("Circle Area: " + circle.calculateArea() + ", 
Perimeter: " + circle.calculatePerimeter()); 
 
    System.out.println("Rectangle Area: " + rectangle.calculateArea() + ", 
Perimeter: " + rectangle.calculatePerimeter()); 
} 
  
}
