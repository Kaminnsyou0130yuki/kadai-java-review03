package baseball;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;

    public BaseBallTeam() {
    }

    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public double getRate() {
        double winningRate = (double) win / (win + lose);
        return winningRate;
    }

    public void report(double winnnigRate) {
        System.out.println(name + "の2022年の成績は " + win + "勝 " + lose + "敗 " + draw + "分、" + "勝率は " + winnnigRate + "です。");
    }

}
