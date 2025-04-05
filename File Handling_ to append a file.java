import java.io.FileWriter; 
import java.io.IOException; 
public class e { 
    public static void main(String[] args) { 
        try { 
            FileWriter writer = new FileWriter("example.txt", true); // true = 
append mode 
            writer.write("\nThis line is appended."); 
            writer.close(); 
            System.out.println("Content appended successfully."); 
        } catch (IOException e) { 
            System.out.println("An error occurred."); 
            e.printStackTrace(); 
        } 
    } 
}
