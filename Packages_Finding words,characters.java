public class p { 
    public static void main(String[] args) { 
        String filename = "sample.txt"; 
        int charCount = 0, wordCount = 0, lineCount = 0; 
  
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) { 
            String line; 
            while ((line = reader.readLine()) != null) { 
                lineCount++; 
                charCount += line.length(); 
                wordCount += line.split("\\s+").length; 
            } 
            System.out.println("Lines: " + lineCount); 
            System.out.println("Words: " + wordCount); 
            System.out.println("Characters: " + charCount); 
        } catch (IOException e) { 
            System.out.println("Error reading file: " + e.getMessage()); 
        } 
    } 
} 
