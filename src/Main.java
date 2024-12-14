import java.time.LocalDate;

public class Main {

    public static int printTask(int taskNumber) {
        taskNumber += 1;

        System.out.println();
        System.out.println("Task number " + taskNumber);
        System.out.println();
        return taskNumber;
    }

    public static boolean leapYear(int year) {
        boolean leapYear = false;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            leapYear = true;
        }
        return leapYear;
    }

    public static int determinantOS(int clientOS, int currentYear) {

        if (clientOS == 0 && currentYear < 2024) {
            System.out.println("Установите облегченную версию приложения для IOS");
        }
        if (clientOS == 1 && currentYear < 2024) {
            System.out.println("Установите облегченную версию приложения для Android");
        }
        if (clientOS == 0 && currentYear >= 2024) {
            System.out.println("Установите версию приложения для IOS");
        }
        if (clientOS == 1 && currentYear >= 2024) {
            System.out.println("Установите версию приложения для Android");
        }
        return (0);
    }

    public static void calculateDaysDelivery(int distance) {
        if (distance <= 20) {
            System.out.println("Потребуется один день");
        } else if (distance >= 20 && distance <= 60) {
            System.out.println("Потребуется 2 дня");
        } else if (distance >= 60 && distance <= 100) {
            System.out.println("Потребуется 3 дня");
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {
        printTask(0);

        int year = 2010;
        if (leapYear(year) == true) {
            System.out.println(year + " год - високосный");
        } else {
            System.out.println(year + " год - невисокосный");
        }

        printTask(1);

        int currentYears = LocalDate.now().getYear();
        determinantOS(1, currentYears);

        printTask(2);

        calculateDaysDelivery(25);
    }
}