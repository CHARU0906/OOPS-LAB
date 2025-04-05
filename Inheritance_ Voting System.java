import java.util.Scanner; 
  
public class VotingSystem { 
  
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
  
      
        String[] candidates = { 
            "Alice", 

 
            "Bob", 
            "Charlie", 
            "Diana" 
        }; 
         int[] votes = new int[candidates.length]; 
  
        System.out.println("Welcome to the Voting System!"); 
        System.out.println("Here are the candidates:"); 
         for (int i = 0; i < candidates.length; i++) { 
            System.out.println((i + 1) + ". " + candidates[i]); 
        } 
         System.out.print("Enter the number of voters: "); 
        int numVoters = scanner.nextInt(); 
         for (int i = 0; i < numVoters; i++) { 
            System.out.print("\nVoter " + (i + 1) + ", please enter the number of the candidate 
you want to vote for (1 to " + candidates.length + "): "); 
            int vote = scanner.nextInt(); 
             if (vote >= 1 && vote <= candidates.length) { 
                votes[vote - 1]++; // Increment vote count for the chosen candidate 
            } else { 
                System.out.println("Invalid vote! Please enter a valid candidate number."); 
                i--; // Retry for this voter 
            } 
        } 
  
     
        System.out.println("\nVoting Results:"); 
        for (int i = 0; i < candidates.length; i++) { 
            System.out.println(candidates[i] + ": " + votes[i] + " votes"); 
        } 

 
         int maxVotes = 0; 
        String winner = ""; 
        for (int i = 0; i < candidates.length; i++) { 
            if (votes[i] > maxVotes) { 
                maxVotes = votes[i]; 
                winner = candidates[i]; 
            } 
        } 
  
        System.out.println("\nThe winner is: " + winner + " with " + maxVotes + " votes!"); 
    } 
} 
