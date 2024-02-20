import java.util.Scanner;

public class BeverageSelector {

    public static void main(String[] args) {
        //an object of scanner named "in " is made, it will allow input from the normal input
        //of the system like the keyboard using the System.in
        Scanner in = new Scanner(System.in);

        //asks the user to input their choice of beverage
        System.out.println("Select a beverage from (1) Water, (2) Coke, (3) Coffee: ");
        //takes in the users name input into a variable called inputOfBeverage
        int inputOfBeverage = in.nextInt();
        //if user inputted 1 then water is printed
        //if user inputted 2 then coke is printed
        //if user inputted 3 then coffee is printed
        if (inputOfBeverage == 1) {
            System.out.println("Water");
        } else if (inputOfBeverage == 2) {
            System.out.println("Coke");
        } else {
            System.out.println("Coffee");
        }
    }
}