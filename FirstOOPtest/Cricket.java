package FirstOOPtest;
class Cricketer {
    String name;
    int BMI;
    int ranking;
    int highest_score;
    int centuries;
    int half_centuries;
    float matches_won;
    float matches_played;

    public Cricketer(String name, int BMI, int highest_score, int centuries, int half_centuries, int matches_won,
            int matches_played) {
        this.name = name;
        this.BMI = BMI;
        this.highest_score = highest_score;
        this.centuries = centuries;
        this.half_centuries = half_centuries;
        this.matches_played = matches_played;
        this.matches_won = matches_won;
    }

    public void win_percentage() {
        float win_percentage_score = ((float) (matches_won / matches_played)) * 100;
        System.out.println("Win Percentage: " + win_percentage_score);
    }
}

public class Cricket {
    public static void main(String args[]) {
        Cricketer cricketer = new Cricketer("Babar Azam", 30, 120, 12, 20, 20, 30);
        cricketer.win_percentage();
    }
}