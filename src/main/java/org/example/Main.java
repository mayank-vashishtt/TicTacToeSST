package org.example;

import org.example.controllers.GameController;
import org.example.models.*;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("heLLO");

//        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        GameController gameController = new GameController();

//        System.out.print("Enter the game dimensions: ");
        int dimension = 3;
        List<Player> players = List.of(
                new Player("Mayank", new Symbol('X'), PlayerType.HUMAN),
                new Bot("Scaler", new Symbol('O'),PlayerType.BOT, BotDIfficultyLevel.EASY)

        );

        Game game  = gameController.startGame(dimension , players);
        gameController.printBoard(game);


    }
}