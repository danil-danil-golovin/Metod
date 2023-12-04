public class Main {
    public static void main(String[] args) {

        int year = 2024;
        years(year);

        int os = 1;
        int phone = 2015;
        OS(os, phone);

        int deliveryDistance = 95;
        int days = 1;
        Distance(deliveryDistance, days);
    }

    static void years(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    static void OS(int os, int phone) {
        if (os == 0 && phone < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 0 && phone >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (os == 1 && phone < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (os == 1 && phone >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    static void Distance(int deliveryDistance, int days) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней " + days);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней " + (days + 1));
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуйется дней " + (days + 2));
        } else {
            System.out.println("Доставки нет");
        }
    }
}




