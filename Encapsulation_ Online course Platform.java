class Course { 
    private String courseName; 
    private String courseId; 

    private String instructor; 
    private int maxStudents; 
    private int currentStudents; 
    // Setter methods 
    void setCourseName(String name) { 
        courseName = name; 
    } 
    void setCourseId(String id) { 
        courseId = id; 
    } 
    void setInstructor(String name) { 
        instructor = name; 
    } 
    void setMaxStudents(int max) { 
        if (max > 0) { 
            maxStudents = max; 
        } 
    } 
    void setCurrentStudents(int current) { 
        if (current >= 0 && current <= maxStudents) { 
            currentStudents = current; 
        } 
    } 
    // Getter methods 
    String getCourseName() { 
        return courseName; 
    } 
  
    String getCourseId() { 
        return courseId; 
    } 
  
    String getInstructor() { 
        return instructor; 
    } 
    int getMaxStudents() { 
        return maxStudents; 
    } 
    int getCurrentStudents() { 
        return currentStudents; 

 
    } 
    // Method to enroll a student 
    void enrollStudent() { 
        if (currentStudents < maxStudents) { 
            currentStudents++; 
            System.out.println("Student enrolled in " + courseName); 
        } else { 
            System.out.println("Course is full."); 
        } 
    } 
  
    // Method to drop a student 
    void dropStudent() { 
        if (currentStudents > 0) { 
            currentStudents--; 
            System.out.println("Student dropped from " + courseName); 
        } 
    } 
} 
public class e1 { 
    public static void main(String[] args) { 
        Course javaCourse = new Course(); 
        javaCourse.setCourseName("Java Programming"); 
        javaCourse.setCourseId("CS101"); 
        javaCourse.setInstructor("Dr. Smith"); 
        javaCourse.setMaxStudents(50); 
        javaCourse.setCurrentStudents(45); 
  
        System.out.println("Course Name: " + javaCourse.getCourseName()); 
        System.out.println("Instructor: " + javaCourse.getInstructor()); 
  
        javaCourse.enrollStudent(); 
        javaCourse.dropStudent(); 
    } 
} 
