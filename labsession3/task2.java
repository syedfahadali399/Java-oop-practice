package labsession3;
class Student {

    String name;
    int rollNumber;
    double[] grade;
    double totalNumber;
    String getGrade;

    Student(String stdName, int stdId, double[] stdGrades) {
        this.name = stdName;
        this.rollNumber = stdId;
        this.grade = stdGrades;

        getStdGrade();
    }

    void getStdGrade() {

        for(int i = 1; i < grade.length; i++) {
            totalNumber += grade[i];
        }

        if(totalNumber >= 200 && totalNumber <= 300) {
            getGrade = "A";
        } else if(totalNumber >= 100 && totalNumber <= 200) {
            getGrade = "B";
        } else if(totalNumber >= 50 && totalNumber <= 100) {
            getGrade = "C";
        } else {
            getGrade = "Fail";
        }
    }

    void showDetail() {
        System.out.println("The Student name is: " + name);
        System.out.println("The Student roll number is: " + rollNumber);
        System.out.println("The Student Total number is " + totalNumber);
        System.out.println("The Student average grade is " + getGrade);

    }

}

public class task2 {
    public static void main(String[] args) {

        double[] grade1 = {70.15, 60.30, 40.50};
        Student student1 = new Student("Fahad", 370, grade1);

        student1.showDetail();
    }
}