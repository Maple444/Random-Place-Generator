//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// This starts the program
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello. Let's go somewhere.");


        // Choosing what kind of place to find
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to see?");
        System.out.println();
        System.out.println("1. Random Country");
        System.out.println("2. Random Continent");
        System.out.println("3. Random City");

        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Let's select a country");
        }
        else if (choice == 2) {
            System.out.println("Let's select a continent");
        }
        else if (choice == 3) {
            System.out.println("Let's select a city");
        }
        else {
            System.out.println("Please choose between option 1, 2, and 3.");
        }
    }
}