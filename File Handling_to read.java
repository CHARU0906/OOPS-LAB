import java.io.*; 
public class p { 
    public static void main(String[] args) { 
        String filename = "data.txt"; 
        try (FileWriter writer = new FileWriter(filename)) { 
            writer.write("Hello, this is a test file!\n"); 
            writer.write("Java File Handling Example."); 
            System.out.println("File written successfully!"); 
        } catch (IOException e) { 
 
            System.out.println("Error writing file: " + e.getMessage()); 
        } 
        try (BufferedReader reader = new BufferedReader(new 
FileReader(filename))) { 
            String line; 
            System.out.println("Reading from file:"); 
            while ((line = reader.readLine()) != null) { 
                System.out.println(line); 
            } 
        } catch (IOException e) { 

            System.out.println("Error reading file: " + e.getMessage()); 
        } 
    } 
} 
