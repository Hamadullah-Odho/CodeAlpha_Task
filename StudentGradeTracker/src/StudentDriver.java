import java.util.Scanner;

public class StudentDriver {

    public static void main(String[] args) {

        boolean flag = true;
        Scanner input = new Scanner(System.in);
        StudentService studentService = new StudentService();

        while (flag){

            System.out.println("1. Add students");
            System.out.println("2. generate Report");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int userInput =  Integer.parseInt(input.nextLine());

            try {
                if(userInput == 1){
                    studentService.addStudent(input);
                }
                else if(userInput == 2){
                    studentService.showReport();
                }
                else if(userInput == 3){
                    flag = false;
                }
                else{
                    System.out.println("Invalid choice");
                }
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }







        }
    }
}
