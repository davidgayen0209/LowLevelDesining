package SnakeAndLadder;

import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Board {
    private Dice dice;

    public Queue<Player> getNextTurn() {
        return nextTurn;
    }

    public void setNextTurn(Queue<Player> nextTurn) {
        this.nextTurn = nextTurn;
    }

    private Queue<Player> nextTurn;
    private List<Snake> snakes;
    private  List<Ladder> ladders;
     int boardSize;
     private Map<String,Integer> playerCurrentPosition;

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }


    public List<Snake> getSnakes() {
        return snakes;
    }

    public void setSnakes(List<Snake> snakes) {
        this.snakes = snakes;
    }

    public List<Ladder> getLadders() {
        return ladders;
    }

    public void setLadders(List<Ladder> ladders) {
        this.ladders = ladders;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    public Map<String, Integer> getPlayerCurrentPosition() {
        return playerCurrentPosition;
    }

    public void setPlayerCurrentPosition(Map<String, Integer> playerCurrentPosition) {
        this.playerCurrentPosition = playerCurrentPosition;
    }

    public Board(Dice dice, Queue<Player> nextTurn, List<Snake> snakes, List<Ladder> ladders,
                 int boardSize, Map<String, Integer> playerCurrentPosition) {
        this.dice = dice;
        this.nextTurn = nextTurn;
        this.snakes = snakes;
        this.ladders = ladders;
        this.boardSize = boardSize;
        this.playerCurrentPosition = playerCurrentPosition;
    }
}
