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
            methodCallsForBuildingCar();
        } else if (userResponse.equalsIgnoreCase("no")) {
            System.out.println("Goodbye");
        }
        while (!userResponse.equalsIgnoreCase("yes") && !userResponse.equalsIgnoreCase("no")) {
            System.out.println("Invalid option, please enter yes or no.");
            userResponse = getNextStringLineFromUser();
            if (userResponse.equalsIgnoreCase("yes")) {
                methodCallsForBuildingCar();
            } else if (userResponse.equalsIgnoreCase("no")) {
                System.out.println("Goodbye");
            }
        }
    }
    public void methodCallsForBuildingCar() {
        System.out.println("Let's go build that car!");
        carBuilderColor();
        carBuilderNumber();
        carBuilderTurbo();
        printRaceCar();
        carControls();
        startRace();
    }
    public void carBuilderColor() {
        System.out.println("Enter the color you want your car to be.");
        String userResponseColor = getNextStringLineFromUser();
        System.out.println("Are you sure you want your car to be " + userResponseColor + "?");
        System.out.println("Please enter yes or no.");
        String userResponseYN = getNextStringLineFromUser();
        if (userResponseYN.equalsIgnoreCase("yes")) {
            raceCar.setColor(userResponseColor);
            System.out.println("Your car is " + raceCar.getColor());
        } else if (userResponseYN.equalsIgnoreCase("no")) {
            System.out.println("What color do you want your car to be?");
            raceCar.setColor(getNextStringLineFromUser());
            System.out.println("Your car is " + raceCar.getColor());
        }
    }
    public void carBuilderNumber() {
        System.out.println("Please choose a number between 0 and 100 for your car");
        int carNumber = getNextIntFromUser();
        while (carNumber < 0 || carNumber > 100) {
            System.out.println("That number is invalid, please enter a number between 0 and 100");
            carNumber = getNextIntFromUser();
        }
        if (carNumber >= 0 && carNumber <= 100) {
            raceCar.setCarNumber(carNumber);
            System.out.println("Your car is number " + raceCar.getCarNumber());
        }
    }
    public void carBuilderTurbo() {
        System.out.println(String.format("Would you like your car to have a turbo button to boost speed?%nPlease enter true or false"));
        boolean hasTurbo = getNextBoolean();
        if (hasTurbo) {
            raceCar.setTurbo(true);
        } else if (!hasTurbo) {
            raceCar.setTurbo(false);
        }
    }
    public void printRaceCar() {
        StringBuilder sb = new StringBuilder("Here are your car details:");
        sb.append(String.format("%nColor: %s", raceCar.getColor()));
        sb.append(String.format("%nNumber: %d", raceCar.getCarNumber()));
        sb.append(String.format("%nTurbo: %b", raceCar.getTurbo()));
        System.out.println(sb.toString());
        //System.out.println("Here are your car details:");
        //System.out.println("Color: " + raceCar.getColor());
        //System.out.println("Number: " + raceCar.getCarNumber());
        //System.out.println("Turbo: " + raceCar.getTurbo());
    }

    public void carControls() {
        System.out.println("Car Controls:");
        System.out.println("Press the letter G to go.");
        System.out.println("Press the letter B to brake.");
        if (raceCar.getTurbo()) {
            System.out.println("Press the letter T to activate your turbo boost.");
        }
        System.out.println("Press the left arrow key to turn left.");
        System.out.println("Press the right arrow key to turn right.");
    }

    public void startRace() {
        System.out.println("Enter the letter \"s\" to start the race.");
        String userResponse = getNextStringLineFromUser();
        userResponse = getNextStringLineFromUser();
        if (userResponse.equalsIgnoreCase("s")) {
            try {
                System.out.println("3");
                Thread.sleep(1000);
                System.out.println("2");
                Thread.sleep(1000);
                System.out.println("1");
                Thread.sleep(1000);
                System.out.println("GO!");
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }

    private String getNextStringLineFromUser() {
        return scanner.nextLine();
    }

    private int getNextIntFromUser() {
        return scanner.nextInt();
    }

    private boolean getNextBoolean() {
        return scanner.nextBoolean();
    }


}
