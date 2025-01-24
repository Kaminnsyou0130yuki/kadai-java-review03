package baseball;

public class Reviwe03 {

    public static void main(String[] args) {

//        インスタンス化
        BaseBallTeam team1 = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam team2 = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam team3 = new BaseBallTeam("阪神タイガース",68 ,71 ,4);
        BaseBallTeam team4 = new BaseBallTeam("読売ジャイアンツ",68 ,72 ,3);
        BaseBallTeam team5 = new BaseBallTeam("広島東洋カープ",66 ,74 ,3);
        BaseBallTeam team6 = new BaseBallTeam("中日ドラゴンズ",66 ,75 ,2);

        double team1WinningRate = team1.getRate();
        team1.report(team1WinningRate);

        double team2WinningRate = team2.getRate();
        team2.report(team2WinningRate);

        double team3WinningRate = team3.getRate();
        team3.report(team3WinningRate);

        double team4WinningRate = team4.getRate();
        team4.report(team4WinningRate);

        double team5WinningRate = team5.getRate();
        team5.report(team5WinningRate);

        double team6WinningRate = team6.getRate();
        team6.report(team6WinningRate);


/*      team1.setName("東京ヤクルトスワローズ");
        team1.setWin(80);
        team1.setLose(59);
        team1.setDraw(4);       */

    }

}
