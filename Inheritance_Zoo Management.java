class Animal  
String name; 
 
public Animal(String name) { 
this.name = name; 
} 
 
 
public void makeSound() { 
System.out.println(name + " makes a sound."); 
} 
} 
class Mammal extends Animal { 
public Mammal(String name) { 
super(name); 
} 
 
 
@Override 
public void makeSound() { 
System.out.println(name + " growls."); 
} 
} 
class Bird extends Animal { 
public Bird(String name) {

 
super(name); 
} 
 
 
@Override 
public void makeSound() { 
System.out.println(name + " chirps."); 
} 
} 
class Reptile extends Animal { 
public Reptile(String name) { 
super(name); 
} 
 
 
@Override 
public void makeSound() { 
System.out.println(name + " hisses."); 
} 
} 
public class ZooManagement { 
public static void main(String[] args) { 
Animal[] zoo = { 
new Mammal("Lion"), 
new Bird("Parrot"),

 
new Reptile("Snake"), 
new Mammal("Tiger") 
}; 
for (Animal a : zoo) { 
a.makeSound(); 
} 
} 
}
