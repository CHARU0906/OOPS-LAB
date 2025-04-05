import java.util.Scanner; 
class Question { 
String questionText; 
 
 
public Question(String questionText) { 
this.questionText = questionText; 
} 
public void askQuestion() { 
System.out.println(questionText); 
} 
 
 
public boolean checkAnswer(String answer) { 
return false; 
} 
} 
 
 
class MCQ extends Question { 
String[] options; 
String correctAnswer; 

 
 
public MCQ(String questionText, String[] options, String 
correctAnswer) { 
super(questionText); 
this.options = options; 
this.correctAnswer = correctAnswer; 
} 
 
 
@Override 
public void askQuestion() { 
System.out.println(questionText); 
for (String option : options) { 
System.out.println(option); 
} 
} 
 
 
@Override 
public boolean checkAnswer(String answer) { 
return answer.equalsIgnoreCase(correctAnswer); 
} 
} 
class DescriptiveQuestion extends Question { 

 
public DescriptiveQuestion(String questionText, String correctAnswer) 
{ 
super(questionText); 
this.correctAnswer = correctAnswer; 
} 
 
 
@Override 
public boolean checkAnswer(String answer) { 
return answer.equalsIgnoreCase(correctAnswer); 
} 
} 
public class OnlineExam { 
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
Question[] questions = { 
new MCQ("What is the capital of France?", new String[]{"A) 
Paris", "B) London", "C) Berlin", "D) Rome"}, "A"), 
new DescriptiveQuestion("Who discovered gravity?", "Newton"), 
new MCQ("Which language is used for Android development?", 
new String[]{"A) Java", "B) C++", "C) Python", "D) Ruby"}, "A") 
}; 
 
 
int score = 0; 
for (Question q : questions) { 

 
q.askQuestion(); 
System.out.print("Your Answer: "); 
String userAnswer = scanner.nextLine(); 
if (q.checkAnswer(userAnswer)) { 
System.out.println("Correct!\n"); 
score++; 
} else { 
System.out.println("Wrong answer.\n"); 
} 
} 
System.out.println("Your total score: " + score + "/" + 
questions.length); 
scanner.close(); 
} 
}
