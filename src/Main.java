public class Main {


    public static void main(String[] args) {

        int year = 3098;
        printLeapYear(year);

        int manufacturingYear = 2017;
        int clientOs = 0;
        getDeviceLink (manufacturingYear, clientOs);

        int deliveryDistance = 30;
        System.out.println(calculateDeliveryDistance(deliveryDistance));

    }


    public static void printLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }

    }

    public static void getDeviceLink (int manufacturingYear, int clientOs) {
        if (manufacturingYear >= 2015 && clientOs == 0)
            System.out.println("Установите версию приложения для IOS по ссылке для IOS");
        else if (manufacturingYear < 2015 && clientOs == 0)
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        else if (manufacturingYear >= 2015 && clientOs == 1)
            System.out.println("Установите версию приложения для Android по ссылке");
        else if (manufacturingYear < 2015 && clientOs == 1)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        }


    public static int calculateDeliveryDistance(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else {
            return (int) Math.round((double) deliveryDistance / 40) + 1;

        }

    }
}


