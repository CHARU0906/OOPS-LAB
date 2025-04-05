abstract class Question {  
  
    protected String questionText;  
  
    public Question(String questionText) {  
  
        this.questionText = questionText;  
  
    }  
  
    public abstract boolean checkAnswer(String answer);  
  
     public void displayQuestion() {  
  
        System.out.println("Question: " + questionText);  
  
    }  
  
}  
  
class MultipleChoiceQuestion extends Question {  
  

 
    private String[] options;  
  
    private String correctAnswer;  
  
    public MultipleChoiceQuestion(String questionText, String[] options, String 
correctAnswer) {  
  
        super(questionText);  
  
        this.options = options;  
  
        this.correctAnswer = correctAnswer;  
  
    }  
  
     @Override  
  
    public boolean checkAnswer(String answer) {  
  
        return correctAnswer.equalsIgnoreCase(answer);  
  
    }  
  
    public void displayOptions() {  
  
        for (int i = 0; i < options.length; i++) {  
  
            System.out.println((i + 1) + ". " + options[i]);  
  

        }  
  
    }  
  
}  
  
class TrueFalseQuestion extends Question {  
  
    private boolean correctAnswer;  
  
    public TrueFalseQuestion(String questionText, boolean correctAnswer) {  
  
        super(questionText);  
  
        this.correctAnswer = correctAnswer;  
  
    }  
  
    @Override  
  
    public boolean checkAnswer(String answer) {  
  
        return (correctAnswer && answer.equalsIgnoreCase("true")) || (!correctAnswer && 
answer.equalsIgnoreCase("false"));  
  
    }  
  
}  

 
public class java {  
  
    public static void main(String[] args) {  
  
            Question[] questions = new Question[2];  
  
        questions[0] = new MultipleChoiceQuestion("What is the capital of France?",   
  
                                                   new String[]{"Berlin", "Madrid", "Paris", "Rome"},   
  
                                                   "Paris");  
  
        questions[1] = new TrueFalseQuestion("The Earth is flat.", false);  
  
        for (Question question : questions) {  
  
            question.displayQuestion();  
  
              
  
            if (question instanceof MultipleChoiceQuestion) {  
  
                ((MultipleChoiceQuestion) question).displayOptions();  
  
            }  
  
            String userAnswer = "Paris";   
  
            System.out.println("User answer: " + userAnswer);  

  
            System.out.println("Correct: " + question.checkAnswer(userAnswer));  
  
            System.out.println();  // Blank line between questions  
  
        }  
  
    }  
  
}
