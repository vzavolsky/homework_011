import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        task01(2411);
        task02(0,2000);
        task03(150);

    }

    public static void task01(int year) {
        boolean check400s = (year % 400) == 0;
        boolean check100s = (year % 100) == 0;
        boolean check4s = (year % 4) == 0;
        if (check400s || (check4s && !check100s)) {
            System.out.println(year + "-й год — високосный год.");
        } else {
            System.out.println(year + "-й год — невисокосный год.");
        }
    }
    public static void task02(int chooseDeviceOS, int clientDeviceYear) {
        String  appleOS = "Установите %sверсию приложения для iOS по ссылке.",
                androidOS = "Установите %sверсию приложения для Android по ссылке.";
        String lightVersion = (clientDeviceYear < 2015) ? "облегчённую " : "";
        if (chooseDeviceOS == 0) System.out.printf(appleOS,lightVersion);
        if (chooseDeviceOS == 1) System.out.printf(androidOS,lightVersion);
        System.out.println();
    }
    public static void task03(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance > 20) days++;
        if (deliveryDistance > 60) days++;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        } else {
            System.out.println("Потребуется дней: " + days);
        }
    }
}