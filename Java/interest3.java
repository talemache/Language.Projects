import java.util.Scanner;

public class interest3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an investment: ");
        double principle = input.nextDouble();

        System.out.println();
        System.out.println("Enter annual interest rate.");
        System.out.print("Enter a decimal, not a percentage: ");
        double rate = input.nextDouble();
        System.out.println();

        int years = 0;

        while(years < 5){
            double interest;
            
            interest = principle * rate;
            principle = principle + interest;
            years = years + 1;
            System.out.print("The value of the investment after ");
            System.out.print(years);
            System.out.print(" years is $");
            System.out.printf("%1.2f", principle);
            System.out.println();

            input.close();
        }

    }
}
