import java.util.Scanner;

public class Summer {
    public static void main(String[] args) {
        //makes a double variable called inputOfNumber
        double inputOfNumber = 1;
        //makes a double variable called total
        double total = 0;
        //while inputOfNumber is not 0 the user is continually asked for a number, then the
        // number is added to the
        //total variable
        while (inputOfNumber != 0) {
            //an object of scanner named "in" is made, it will allow input from the normal input
            //of the system like the keyboard using the System.in
            Scanner in = new Scanner(System.in);
            //the user is asked for a number
            System.out.print("Input An Number: ");
            //takes in the users input into a variable called inputOfNumber
            inputOfNumber = in.nextDouble();
            //total adds the inputOfNumber to itself
            total = total + inputOfNumber;
        }
        //prints out total when while loop ended because user entered 0 as input
        System.out.println("Sum: " + total);
    }
}
