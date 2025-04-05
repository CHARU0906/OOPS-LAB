class Player { 
String 
name; int 
score; 
 
public Player(String name, int score) { 
this.name = name; 
this.score = score; 
} 
 
 
public void displayScore() { 
System.out.println(name + " scored " + score + " points."); 
} 
} 
class CasualPlayer extends Player { 
public CasualPlayer(String name, int score) { 
super(name, score); 
} 
 
 
@Override 
public void displayScore() { 
System.out.println(name + " (Casual) scored " + score + " points."); 
} 
} 

 
 
class ProPlayer extends Player { 
public ProPlayer(String name, int score) { 
super(name, score); 
} 
 
 
@Override 
public void displayScore(){ 
System.out.println(name + " (Pro) scored " + score + " points!"); 
} 
} 
public class GameLeaderboard { 
public static void main(String[] args) { 
Player[] leaderboard = { 
new CasualPlayer("Alice", 150), 
new ProPlayer("Bob", 300), 
new CasualPlayer("Charlie", 200), 
new ProPlayer("Dave", 500) 
}; 
for (Player p : leaderboard) { 
p.displayScore(); 
} 
} 
}
