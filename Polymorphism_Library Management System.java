class Ebook extends Book { 
int fileSize; 
 
Ebook(String title, String author, int fileSize) { 
super(title, author); 
this.fileSize = fileSize; 
} 
 
 
@Override 
void displayInfo() { 
System.out.println("Ebook: " + title + " by " + author + " (Size: " + 
fileSize + "MB)"); 
} 

} 
class PrintedBook extends Book { 
int pages; 
 
PrintedBook(String title, String author, int pages) { 
super(title, author); 
this.pages = pages; 
} 
 
 
@Override 
void displayInfo() { 
System.out.println("Printed Book: " + title + " by " + author + " 
(Pages: " + pages + ")"); 
} 
} 
public class LibraryManagement { 
public static void main(String[] args) { 
// Creating an array of Book objects (looping used) 
Book books[] = new Book[3]; 
 
books[0] = new Ebook("Java Basics", "John Doe", 5); 
books[1] = new PrintedBook("Data Structures", "Jane Smith", 300); 
books[2] = new Ebook("Machine Learning", "Alan Turing", 10); 
for (Book b : books) { 
b.displayInfo(); 
} 
} 

}
