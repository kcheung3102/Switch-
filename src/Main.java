import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner day =new Scanner(System.in);

        System.out.println("Enter days in a month");
        int days = day.nextInt();
        String monthString = "";

	    switch(days) {
            case 9:
                monthString = "no 9 days in a month";
                break;
            case 28:
                monthString = "February";
                break;
            case 30:
                monthString = "September April June Novemember";

                break;
            case 31:
                monthString = "January March May July August October December";
                break;

        }
        System.out.println(monthString);
    }
}
