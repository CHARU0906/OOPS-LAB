public class OnlineShopping { 
    public static void main(String[] args) { 
        String[] items = {"Laptop", "Phone", "Headphones"}; 
        int itemIndex = 5; // Invalid index 

        String selectedItem = null; // Simulating a null selection 
 
        try { 
            System.out.println("Selected Item: " + items[itemIndex]); // 
ArrayIndexOutOfBoundsException 
            System.out.println("Item Length: " + selectedItem.length()); // 
NullPointerException 
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Error: Item not found. Please select a valid item."); 
        } catch (NullPointerException e) { 
            System.out.println("Error: No item selected. Please choose an item."); 
        } 
        System.out.println("Shopping system continues..."); 
    } 
} 
