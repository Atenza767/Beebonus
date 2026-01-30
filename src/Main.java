//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int initialAmount = 100; // Начальная сумма на счете
        int amountDeposited = 1100; // Сумма пополнения
        int bonus;
        // Вычисление бонуса
        if (amountDeposited > 1000) {
            bonus = amountDeposited / 100;
        } else {
            bonus = 0;
        }
        // Вычисление итоговой суммы баланса
        int totalAmount = initialAmount + amountDeposited + bonus;
        System.out.println((bonus) + " Ваш бонус ");
        System.out.println((totalAmount) + " Итоговый баланс");
    }
}