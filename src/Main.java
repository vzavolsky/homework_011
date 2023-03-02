import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        checkTheLeapYear(2411);
        checkDeviceVersionApp(1,2022);
        System.out.println(checkTheDeliveryPossibility(50));

    }

    public static void checkTheLeapYear(int year) {
        boolean check400s = (year % 400) == 0;
        boolean check100s = (year % 100) == 0;
        boolean check4s = (year % 4) == 0;
        if (check400s || (check4s && !check100s)) {
            System.out.println(year + "-й год — високосный год.");
        } else {
            System.out.println(year + "-й год — невисокосный год.");
        }
    }
    public static void checkDeviceVersionApp(int chooseDeviceOS, int clientDeviceYear) {
        String  appleOS = "Установите %sверсию приложения для iOS по ссылке.",
                androidOS = "Установите %sверсию приложения для Android по ссылке.";
        int currentYear = LocalDate.now().getYear();
        String lightVersion = (clientDeviceYear < currentYear) ? "облегчённую " : "";
        // System.out.println(currentYear + " " + clientDeviceYear + " " + lightVersion);
        if (chooseDeviceOS == 0) {
            System.out.printf(appleOS,lightVersion);
        }
        if (chooseDeviceOS == 1) {
            System.out.printf(androidOS,lightVersion);
        }
        System.out.println();
    }
    public static int checkTheDeliveryPossibility(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance > 20) {
            days++;
        }
        if (deliveryDistance > 60) {
            days++;
        }
        if (deliveryDistance > 100) {
            return -1;
        } else {
            return days;
        }
    }
}