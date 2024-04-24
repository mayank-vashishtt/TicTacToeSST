package org.example;

import org.example.controllers.GameController;
import org.example.exception.InvalidMoveException;
import org.example.models.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidMoveException {
        System.out.println("Hello audience, be ready for the TicTacToe match");
        System.out.println();
        System.out.println("Empty Board is here below ");
        Scanner scanner = new Scanner(System.in);
        GameController gameController = new GameController();

        int dimension = 3;
        List<Player> players = List.of(
                new Player("Mayank", new Symbol('X'), PlayerType.HUMAN),
                new Bot("EaseBot", new Symbol('O'), PlayerType.BOT, BotDIfficultyLevel.EASY)
        );

        Game game = gameController.startGame(dimension, players);
        //gameController.printBoard(game);

        while (game.getGameState().equals(GameState.IN_PROGRESS)) {
            //1. print the board.
            gameController.printBoard(game);

            //2. Player's turn
            gameController.makeMove(game);
        }

        if (!gameController.checkState(game).equals(GameState.ENDED)) {
            game.setGameState(GameState.DRAW);
            System.out.println("Game DRAW");
        } else {
            gameController.printBoard(game);
            System.out.println("Player " + gameController.getWinner(game).getName() + " is the winner, give a huge amount of applauds");
        }
    }
}