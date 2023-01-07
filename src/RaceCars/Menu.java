package RaceCars;

import java.util.Scanner;

public class Menu {
    Scanner scanner;
    RaceCar raceCar;

    public Menu(Scanner scanner, RaceCar raceCar) {
        this.scanner = scanner;
        this.raceCar = raceCar;
    }


    public void greet() {
        System.out.println("Welcome to Racing Adventures!");
        System.out.println("Are you ready to build your race car? Please enter yes or no.");
        String userResponse = getNextStringLineFromUser();
        if (userResponse.equalsIgnoreCase("yes")) {
            System.out.println("Let's go build that car!");
            carBuilder();
        } else if (userResponse.equalsIgnoreCase("no")) {
            System.out.println("Goodbye");
        } else {
            System.out.println("Invalid option");
        }
    }

    public void carBuilder() {
        System.out.println("Enter the color you want your car to be.");
        raceCar.setColor(getNextStringLineFromUser());
        System.out.println("Are you sure you want your car to be " + raceCar.getColor() + "?");
        System.out.println("Please enter yes or no.");
        String userResponse = getNextStringLineFromUser();
        if (userResponse.equalsIgnoreCase("yes")) {
            System.out.println("Your car is " + raceCar.getColor());
        } else if (userResponse.equalsIgnoreCase("no")) {
            System.out.println("What color do you want your car to be?");
            raceCar.setColor(getNextStringLineFromUser());
            System.out.println("Are you sure you want your car to be " + raceCar.getColor() + "?");
            System.out.println("Please enter yes or no.");
        }
    }
    private String getNextStringLineFromUser() {
        //scanner.nextLine();
        return scanner.nextLine();
    }
}