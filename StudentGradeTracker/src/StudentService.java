import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {

    List<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Scanner input) {
        System.out.println("---- Adding student ----\n");

        try {
            System.out.print("Enter number of students :");
            int studentsNum = Integer.parseInt(input.nextLine());


            for(int i = 1; i <= studentsNum; i++) {
                Student student = new Student();


                    System.out.print("Enter student" + i + " : " );
                    String name = input.nextLine();
                    System.out.print("Enter roll no : ");
                    String rollNo = input.nextLine();
                    System.out.print("Enter marks : ");
                    int marks = Integer.parseInt(input.nextLine());

                    student.setName(name);
                    student.setRollNo(rollNo);
                    student.setMarks(marks);



                students.add(student);
            }

        }
        catch (NumberFormatException e) {
            System.out.println("Invalid student Marks");
        }


    }

    public double getAverageScore() {
        double sum = 0;
        for(Student student : students) {
            sum += student.getMarks();
        }

        return (double) sum/students.size();
    }

    public int getHighestMarks() {
        int highestMark = students.get(0).getMarks();
        for(Student student : students) {
            if(student.getMarks() > highestMark) {
                highestMark = student.getMarks();
            }
        }
        return highestMark;
    }

    public int getLowestMarks() {
        int lowestMark = students.get(0).getMarks();
        for(Student student : students) {
            if(student.getMarks() < lowestMark) {
                lowestMark = student.getMarks();
            }
        }
        return lowestMark;
    }

    public void showReport() {

        System.out.println("---- Grade Report ----\n");
        for(Student student : students) {
            System.out.println(student.toString());;
        }
        System.out.println("------------------------\n");
        System.out.println("Average marks: " + getAverageScore());
        System.out.println("Highest marks: " + getHighestMarks());
        System.out.println("Lowest marks: " + getLowestMarks());
        System.out.println();

    }

}
