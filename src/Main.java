import java.time.LocalDate;

public class Main {

    //Задача №1
    private static void  checkYearIsLeapAndPrint(int year) {
        boolean leapYearConditions = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        boolean validYear = year >= 1584;
        if (validYear && leapYearConditions) {
            System.out.printf(" « %s год — високосный год»", year);
        } else {
            System.out.printf(" « %s год — невисокосный год».", year);
        }
    }

    // Задача №2
    private static void validateDeviceAndYear(int clentDeviceYear, int year) {
        int ios =0;
        int android=1;
        int currentYear = LocalDate.now().getYear();
        if (clentDeviceYear == ios && year < currentYear) {
            System.out.println ("«Установите облегченную версию приложения для iOS по ссылке».");
        } else if (clentDeviceYear == ios && year >= currentYear) {
            System.out.println ("«Установите версию приложения для iOS по ссылке».");
        } else if (clentDeviceYear == android && year < currentYear) {
            System.out.println("«Установите облегченную версию приложения для Android по ссылке».");
        } else if (clentDeviceYear == android && year >= currentYear) {
            System.out.println("«Установите версию приложения для Android по ссылке».");
        } else {
            System.out.println ("Такая система не поддерживается");
        }
    }


    //  Задача №3
    private static void deliveryDistance(int deliveryDistance) {
        int days = 1;
        String deliveryTime = " + срок доставки.";

        if (deliveryDistance <= 20) {
            System.out.printf("Пoтpeбуется дней:" + days+deliveryTime);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = days + 1;
            System.out.println("Пoтpeбуется дней: " + days+deliveryTime);

        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            days+=2;
            System.out.println("Пoтpe6yeтcя дней: " + days+deliveryTime);

        } else {
            System.out.println("Доставки нет");
        }

    }



    public static void main(String[] args) {

        System.out.println("Задача №1_____________________________________________________________________");
        int year = 2021;
        checkYearIsLeapAndPrint(year);


        System.out.println("\nЗадача №2_____________________________________________________________________");
        int clientOS = 1;
        int clentDeviceYear = 2024;
        validateDeviceAndYear(clientOS, clentDeviceYear);



        System.out.println("\nЗадание №3_____________________________________________________________________");
        deliveryDistance(95);





    }


}








