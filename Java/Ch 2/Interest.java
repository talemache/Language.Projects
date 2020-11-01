/**
Computes interest
*/

// CLASS INTEREST
public class Interest{
    public static void main(String[] args){
       
        // VARIABLES   
        double principle;
        double rate;
        double interest;

        principle = 17000;
        rate = .027;
        interest = principle * rate;

        principle = principle + interest;

        System.out.print("The interest earned is $");
        System.out.println(interest);
        System.out.print("The value of the investment after one year is $");
        System.out.println(principle);
    } // END MAIN
}// END CLASS INTEREST