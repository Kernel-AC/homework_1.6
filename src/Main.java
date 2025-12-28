//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println();
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println();
        System.out.println("Задание 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println();
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println();
        System.out.println("Задание 5");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();
        System.out.println("Задание 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println();
        System.out.println("Задание 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println();
        System.out.println("Задание 8");
        int saving = 29000;
        int totalSaving = 0;
        for (int month = 0; month <= 12; month++) {
            totalSaving = totalSaving + saving;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSaving + " рублей");
        }
        System.out.println();
        System.out.println("Задание 9");
        int saving2 = 29000;
        int totalSaving2 = 0;
        for (int month = 0; month <= 12; month++) {
            totalSaving2 = totalSaving2 + totalSaving2 / 100;
            totalSaving2 = totalSaving2 + saving2;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSaving2 + " рублей");
        }
        System.out.println();
        System.out.println("Задание 10");
        int a = 2;
        int c = 1;
        for (int b = 1; b <= 10; b++) {
            c = a * b;
            System.out.println(a + "*" + b + "=" + c);
        }

    }


}
