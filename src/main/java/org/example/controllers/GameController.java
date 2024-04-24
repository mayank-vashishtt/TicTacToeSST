package org.example.controllers;

import org.example.models.Game;
import org.example.models.GameState;
import org.example.models.Move;
import org.example.models.Player;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players){
//        validate if two players have the same symbol or not?
//        if 2 players have same symbol, then show some exception


        return new Game(dimension, players);
    }

    public void makeMove(Game game){
        return;
    }

    public GameState checkState(Game game){
        return game.getGameState();

    }

    public Player getWinner(Game game){
        return game.getWinner();

    }

    public void printBoard(Game game){
       game.printBoard();

    }

}
