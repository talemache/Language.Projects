import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        System.out.println("Please pick a number between 1 and 10: ");

        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();

        System.out.println();
        if(number < 5){
            System.out.println("Enjoy the good luck\na friend brings you");
        }
        else if(number > 10){
            System.out.println("Error, number over 10. Exiting.");
            System.exit(0);
        }
        else {
            System.out.println("Your shoe selection will\nmake you happy today");
        }
    }
}
