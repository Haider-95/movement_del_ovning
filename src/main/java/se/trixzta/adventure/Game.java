package se.trixzta.adventure;

import java.util.Scanner;

public class Game {
    private ChooseDirections chooseDirections;

    public Game(Scanner scanner) {
        this.chooseDirections = new ChooseDirections(scanner);
    }
    public void start() {
        System.out.println("Welcome to the Adventure Game, you start in Town center!\nYour Starting position (0,0)\n");
        chooseDirections.move();
    }
}
