//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x = 200; // Начальная сумма на счете
        int y = 600; // Сумма пополнения
        int i;
        // Вычисление бонуса
        if (y > 100) {
            i = y / 100;
        } else {
            i = 0;
        }
        // Вычисление итоговой суммы баланса
        int b = x + y + i;
        System.out.println((i) + " Ваш бонус ");
        System.out.println((b) + " Итоговый баланс");
    }
}