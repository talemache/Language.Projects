import java.util.Scanner;

public class MultipleChoiceQuestion {
    public static void main(String[] args) {
        System.out.println("Please choose the correct answer.\nWhat is the capital of France?");

        System.out.println("a.) Rome");
        System.out.println("b.) Paris");
        System.out.println("c.) London");
        System.out.print("Please enter a, b, or c: ");

        Scanner userInput = new Scanner(System.in);
        char ans = userInput.next().charAt(0);

        System.out.println();
        if     (ans == 'a'){System.out.println("Incorrect");}
        else if(ans == 'b'){System.out.println("Correct!" );}
        else if(ans == 'c'){System.out.println("Incorrect");}
        else{
            System.out.println("Incorrect answer given, closing program...");
            System.exit(0);
        }

    }
}
