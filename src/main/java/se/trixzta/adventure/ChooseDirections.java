package se.trixzta.adventure;

import java.util.Scanner;

public class ChooseDirections {
    private Scanner scanner;
    private DirectionHandler directionHandler;

    public ChooseDirections(Scanner scanner) {
        this.scanner = scanner;
        this.directionHandler = new DirectionHandler();
    }




    public void move() {

        boolean running = true;
        while (running) {
            System.out.println("In which direction do you wish to move:\nSouth/North/East/West or Quit ?" );
            String userInput = scanner.nextLine().toLowerCase();
            System.out.println(" ");
            System.out.println("You have chose to move towards " + userInput);


            switch (userInput) {
                case "south":
                    directionHandler.moveSouth();
                    break;
                case "north":
                    directionHandler.moveNorth();
                    break;
                case "east":
                    directionHandler.moveEast();
                    break;
                case "west":
                    directionHandler.moveWest();
                    break;
                case "quit":
                    running = false;
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
        }
    }
}