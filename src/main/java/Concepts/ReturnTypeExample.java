package Concepts;

public class ReturnTypeExample {
    public static void main(String[] args) {
    String grade;
    String studentName;

    studentName = "John";
    //Introduce score into the method findGrades
    grade = findGrades(90);
    displayGrades(studentName, grade);

    studentName = "Tom";
    //Introduce score into the method findGrades
    grade = findGrades(80);
    displayGrades(studentName, grade);
}

    public static String findGrades(int score) {
        String grade;
        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score >= 70 && score < 80) {
            grade = "C";
        } else {
            grade = "D";
        }
        //return grade retrieve the result of the score evaluation
        return grade;
    }

    public static void displayGrades(String studentName, String grade) {
        //string grade is the result of findGrade method
        System.out.println("*******************************");
        System.out.println("Grade of " + studentName + " is: " + grade);
        System.out.println("*******************************");
    }
}
