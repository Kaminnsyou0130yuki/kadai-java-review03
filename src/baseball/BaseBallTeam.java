package baseball;

public class BaseBallTeam {

//    フィールド
    private String name;
    private int win;
    private int lose;
    private int draw;

    public BaseBallTeam() {

    }

//    コンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

//    setterメソッド
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

//    勝率計算
    public double getRate() {
        double winRate = (double) win / (win + lose);
        return  winRate;
    }

//    表示
    public void report() {
        System.out.println(name +" の2022年の成績は " + win + "勝 " + lose + "敗 " + draw + "分、勝率は " + getRate() + "です。");
    }
}
