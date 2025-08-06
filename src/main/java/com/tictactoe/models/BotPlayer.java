package com.tictactoe.models;

public class BotPlayer extends Player{
    private DifficultyLevel difficultyLevel;

    public BotPlayer(String name, Symbol symbol) {
        super(name, symbol);
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public void makeMove(Board board) {

    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
