public class Game {
    int[] score = new int[2];

    public void setUp(){
        score[0] = 0;
        score[1] = 0;
    }

    public String displayScore() {
        return Integer.toString(score[0]) + "/" + Integer.toString(score[1]);
    }

    public void scores(int playerNumber) {
        score[playerNumber] += 15;
    }
}
