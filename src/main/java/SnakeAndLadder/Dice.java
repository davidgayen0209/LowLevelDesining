package SnakeAndLadder;

public class Dice {
    public int getNumberOfDice() {
        return numberOfDice;
    }

    public void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    private int numberOfDice;

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    int rollDice(){
        return ((int) (Math.random()*(6*numberOfDice - 1*numberOfDice))) +1;

    }
}
