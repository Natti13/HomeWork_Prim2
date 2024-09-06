//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int score;
        score = 100;
        int sumRecharge = 1500;
        int bonusScore;
        int percent = 1;

        if (sumRecharge > 1000) {
            bonusScore = sumRecharge * percent;
        } else {
            bonusScore = 0;
            score = score + sumRecharge;
        }
        String nameScore = "Счет = ";
        System.out.println(nameScore + (score + bonusScore));
        String nameBonusScore = "Количество бонусов = ";
        System.out.println(nameBonusScore + bonusScore);


    }
}