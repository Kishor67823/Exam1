import java.util.Scanner;

public class TenMaker {
    public static void main(String[] args) {
        //an object of scanner named "in " is made, it will allow input from the normal input
        //of the system like the keyboard using the System.in
        Scanner in = new Scanner(System.in);
        //asks the user to input a integer
        System.out.print("Please enter a integer: ");
        //takes in the users input into a variable called inputOfInteger
        int inputOfInteger = in.nextInt();
        //an object of scanner named "secondIn " is made, it will allow input from the normal input
        //of the system like the keyboard using the System.in
        Scanner secondIn = new Scanner(System.in);
        //asks the user to input another integer
        System.out.print("Please enter another integer: ");
        //takes in the users input into a variable called inputOfSecondInteger
        int inputOfSecondInteger = secondIn.nextInt();
        //creates a boolean variable called if10 that calls the makes10 method
        //and passes in inputOfInteger and inputOfSecondInteger
        boolean if10 = makes10(inputOfInteger, inputOfSecondInteger);
        // if the method comes back as true then it prints that the sum was 10
        //if the method comes back as false then it prints that the sum was not 10
        if (if10) {
            System.out.print("The sum of the two numbers you inputted is 10 ");
        } else {
            System.out.print("The sum of the two numbers you inputted is not 10 ");
        }
    }

    //takes in inputOfInteger and inputOfSecondInteger and determines if they equal 10 when added
    public static boolean makes10(int inputOfInteger, int inputOfSecondInteger) {
        //if sum of inputOfInteger and inputOfSecondInteger equal 10 then this method returns true
        if (inputOfInteger + inputOfSecondInteger == 10) {
            return true;
        }
        // if sum of inputOfInteger and inputOfSecondInteger was not 10 then this method returns false
        return false;
    }
}
