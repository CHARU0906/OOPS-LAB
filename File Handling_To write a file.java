import java.io.FileWriter; 
import java.io.IOException; 
public class e{ 
public static void main(String[] args){ 
try{ 
FileWriter writer = new FileWriter("example.txt"); 
writer.write("hello everyone your safety our responsibility"); 

 
writer.close(); 
System.out.println("File Written Successfully"); 
} 
catch (IOException e){ 
System.out.println("An error occured"); 
e.printStackTrace(); 
 
} 
} 
}
