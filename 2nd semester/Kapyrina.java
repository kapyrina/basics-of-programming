/*
 * Вариант: 4. Номер зачетной книжки: 21-674.
 *
 * Автор: Капырина Алина Андреевна, ЗИТ-21
 * Дата: 31.05.2022
 *
 * По данному натуральному n вычислите сумму 1^3+2^3+3^3+...+n^3. Реализовать ввод трех чисел.
 */

import java.util.Scanner; /* Класс для взаимодействия с пользователем */

public class Kapyrina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int j = 0; j <= 2; j++) {
            int result = 0;
            
            System.out.print("Введите натуральное число n:");
            int n = scanner.nextInt();
            
            for (int i = 0; i <= n; i++) {
                result += i^3;
            }
            
            System.out.println("Сумма 1^3+2^3+3^3+...+n^3 = " + result);
        }
    }
}