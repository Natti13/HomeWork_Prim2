//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int score = 100;
        int sumRecharge = 1500;
        int bonusScore;
        int totalScore;

        if (sumRecharge > 1000) {
            bonusScore = sumRecharge / 100;
            totalScore = score + sumRecharge + bonusScore;
        } else {
            totalScore = score + sumRecharge;
            bonusScore = 0;
                    }
        String nameScore = "Счет = ";
        System.out.println(nameScore + totalScore);
        String nameBonusScore = "Количество бонусов = ";
        System.out.println(nameBonusScore + bonusScore );

    }
}