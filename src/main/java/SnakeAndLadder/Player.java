package SnakeAndLadder;

public class Player {
    private  String playerName;
    private Piece piececolor;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Piece getPiececolor() {
        return piececolor;
    }

    public void setPiececolor(Piece piececolor) {
        this.piececolor = piececolor;
    }

    public Player(Piece piececolor, String playerName) {
        this.piececolor = piececolor;
        this.playerName = playerName;
    }
}
