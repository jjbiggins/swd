public enum PlayerID {

    P1("PLAYER_1", 0),
    P2("PLAYER_2", 1);

    private final String player;
    private final int playerNumber;

    PlayerID(String player, int playerNumber){
        this.player = player;
        this.playerNumber = playerNumber;
    }

    public String getPlayer() {
        return player;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }
}
