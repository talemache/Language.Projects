public class EnumDemo {
    enum Day{SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
    enum Month{JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC}

    public static void main(String[] args){

        Day tgif;
        Month libra;

        tgif = Day.FRIDAY;
        libra = Month.OCT;

        System.out.print("My sign is libra, since I was born in " + libra);
        System.out.print("That's the " + libra.ordinal());
        System.out.print("-th month of the year.");
    }
}
