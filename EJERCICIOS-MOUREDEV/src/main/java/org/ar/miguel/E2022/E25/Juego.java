package org.ar.miguel.E2022.E25;

class Juego {
    private String player1;
    private String player2;

    public Juego(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Juego() {
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }
}
