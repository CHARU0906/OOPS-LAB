abstract class Voter { 
    protected String name; 
    protected int age; 
    public Voter(String name, int age) { 
        this.name = name; 
        this.age = age; 
    } 
     
    public abstract boolean isEligibleToVote(); 
      public void displayVoterInfo() { 
        System.out.println("Name: " + name); 
        System.out.println("Age: " + age); 
    } 
} 
 class CitizenVoter extends Voter { 
    public CitizenVoter(String name, int age) { 
        super(name, age); 
    } 
 
     
    @Override 
    public boolean isEligibleToVote() { 
        return age >= 18; // Eligible to vote if 18 or older 
    } 
} 
  
class NonCitizenVoter extends Voter { 
    public NonCitizenVoter(String name, int age) { 
        super(name, age); 
    } 
     
    @Override 
    public boolean isEligibleToVote() { 
        return false; // Non-citizens are not eligible to vote 
    } 
} 
  
public class VotingSystem { 
    public static void main(String[] args) { 
        Voter voter1 = new CitizenVoter("John Doe", 25); 
        Voter voter2 = new NonCitizenVoter("Jane Smith", 22); 
         
        voter1.displayVoterInfo(); 
        if (voter1.isEligibleToVote()) { 
            System.out.println("This person is eligible to vote."); 
        } else { 
            System.out.println("This person is NOT eligible to vote."); 
        } 
         
        voter2.displayVoterInfo(); 
        if (voter2.isEligibleToVote()) { 
            System.out.println("This person is eligible to vote."); 
        } else { 

 
            System.out.println("This person is NOT eligible to vote."); 
        } 
    } 
} 
