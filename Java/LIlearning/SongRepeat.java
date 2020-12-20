import java.util.Scanner;

public class SongRepeat {
    public static void main(String[] args) {
        System.out.println("This program repeats a song if you choose so.");
        System.out.println("Song has ended, do you want to repeat? [y/n] ");

        Scanner userInput = new Scanner(System.in);
        char ans = userInput.next().charAt(0);
        boolean repeat = true;

        if(ans == 'y'){repeat = true;}
        else          {repeat = false;}
        while(repeat == true){
            System.out.println("Repeating song...");
            System.out.println("Do you want to repeat again? [y/n] ");

            ans = userInput.next().charAt(0);
            if(ans == 'y'){repeat = true;}
            else          {repeat = false;}
        }
        System.out.println("Song has finished, closing program");
    }
}
