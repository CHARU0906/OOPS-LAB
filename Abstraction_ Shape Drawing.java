abstract class Shape { 
    public abstract void draw(); 
} 
  
class Circle extends Shape { 
    @Override 
    public void draw() { 
        System.out.println("Drawing a Circle"); 
    } 
} 
  
class Rectangle extends Shape { 
    @Override 
    public void draw() { 
        System.out.println("Drawing a Rectangle"); 
    } 
} 
  
class Triangle extends Shape { 
    @Override 
    public void draw() { 

 
 
        System.out.println("Drawing a Triangle"); 
    } 
} 
  
public class ShapeDrawingSystem { 
    public static void main(String[] args) { 
        Shape circle = new Circle(); 
        Shape rectangle = new Rectangle(); 
        Shape triangle = new Triangle(); 
  
        circle.draw(); 
        rectangle.draw(); 
        triangle.draw(); 
    } 
} 
