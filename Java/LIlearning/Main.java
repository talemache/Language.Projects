import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int     studentAge           = 36;
        double  studentGPA           = 3.75;
        String  studentFirstName     = "Chris";
        String  studentLastName      = "Louis";
        char    studentInitial       = studentLastName.charAt(0);
        boolean hasPerfectAttendance = true;

        System.out.print("Name: " + studentFirstName + " ");
        System.out.println(studentInitial + " ");
        System.out.println("Age: " + studentAge + " ");
        System.out.println("GPA: " + studentGPA + " ");

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please update your GPA: ");
        studentGPA = userInput.nextDouble();

        System.out.println("Your new GPA is: " + studentGPA);

    }
}
