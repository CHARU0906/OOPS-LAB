class LibraryBook { 
    private String bookId; 
    private String title; 
    private String author; 
    private int availableCopies; 
  
    // Setter methods 
    void setBookId(String id) { 
        bookId = id; 
    } 
  
    void setTitle(String bookTitle) { 
        title = bookTitle; 
    } 

  
    void setAuthor(String bookAuthor) { 
        author = bookAuthor; 
    } 
  
    void setAvailableCopies(int copies) { 
        if (copies >= 0) { 
            availableCopies = copies; 
        } 
    } 
  
    // Getter methods 
    String getBookId() { 
        return bookId; 
    } 
  
    String getTitle() { 
        return title; 
    } 
  
    String getAuthor() { 
        return author; 
    } 
  
    int getAvailableCopies() { 
        return availableCopies; 
    } 
  
    // Borrow a book 
    void borrowBook() { 
        if (availableCopies > 0) { 
            availableCopies--; 
 
            System.out.println("Book borrowed: " + title); 
        } else { 
            System.out.println("Book is not available."); 
        } 
    } 
  
    // Return a book 

 
    void returnBook() { 
        availableCopies++; 
        System.out.println("Book returned: " + title); 
    } 
} 
  
// Main class 
public class Main { 
    public static void main(String[] args) { 
        LibraryBook book = new LibraryBook(); 
        book.setBookId("B101"); 
        book.setTitle("Java Programming"); 
        book.setAuthor("James Gosling"); 
        book.setAvailableCopies(5); 
  
        System.out.println("Book Title: " + book.getTitle()); 
        System.out.println("Author: " + book.getAuthor()); 
  
        book.borrowBook(); 
        book.returnBook(); 
    } 
}
