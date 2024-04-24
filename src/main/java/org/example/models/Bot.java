package org.example.models;
import  java.util.*;
public class Bot extends Player{

    private BotDIfficultyLevel botDIfficultyLevel;

    public Bot(String name, Symbol symbol, PlayerType playerType, BotDIfficultyLevel botDIfficultyLevel) {
        super(name, symbol, playerType);
        this.botDIfficultyLevel = botDIfficultyLevel;
    }
    @Override
    public Move makeMove(Board board) {
//        find the first empty cell and make the move there
        for(List<Cell> row : board.getBoard()){
            for(Cell cell: row){
                if(cell.getCellState().equals(CellState.EMPTY)){
                    return new Move(cell, this);
                }

            }
        }

        return null;
    }

}
