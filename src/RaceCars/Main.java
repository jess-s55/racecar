package RaceCars;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(new Scanner(new InputStreamReader(System.in, StandardCharsets.UTF_8)), new RaceCar());

        menu.greet();

    }
}
