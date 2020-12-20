import java.util.Scanner;

public class SongRepeat {
    public static void main(String[] args) {
        System.out.println("This program repeats a song if you choose so.");

        Scanner userInput = new Scanner(System.in);
        boolean repeat = true;

        while(repeat){
            System.out.println("Song has ended, do you want to repeat? [y/n] ");

            char ans = userInput.next().charAt(0);
            if     (ans == 'y'){repeat = true;}
            else if(ans == 'f'){repeat = false;}
            else{
                System.out.println("Incorrect answer input, ending song...");
                System.exit(0);
            }
        }
        System.out.println("Song has finished, closing program");
    }
}
