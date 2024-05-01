import java.time.LocalDate;

public class Main {

    //Задача №1
    private static void checkYearIsLeapAndPrint(int leapYear) {
        boolean leapYearConditions = (leapYear % 400 == 0) || (leapYear % 4 == 0 && leapYear % 100 != 0);
        boolean validYear = leapYear >= 1584;
        if (validYear && leapYearConditions) {
            System.out.printf(" « %s год — високосный год»", leapYear);
        } else {
            System.out.printf(" « %s год — невисокосный год».", leapYear);
        }
    }

    // Задача №2
    private static String validateDeviceAndYear(int deviceType, int year) {
        int currentYear = LocalDate.now().getYear();
        if (deviceType == 0 && year < currentYear) {
            return ("«Установите облегченную версию приложения для iOS по ссылке».");
        } else if (deviceType == 0 && year >= currentYear) {
            return ("«Установите версию приложения для iOS по ссылке».");
        } else if (deviceType == 1 && year < currentYear) {
            return ("«Установите облегченную версию приложения для Android по ссылке».");
        } else if (deviceType == 1 && year >= currentYear) {
            return ("«Установите версию приложения для Android по ссылке».");
        } else {
            return ("Такая система не поддерживается");
        }
    }


    //  Задача №3
    private static String calculateDeliveryDistance(int distance) {
        if (distance > 100) {
            return "Wrong distance";
        } else {
            int i = (int) Math.ceil((double) (distance - 20) / 40) + 1;
            return i + "";
        }
    }


    public static void main(String[] args) {

        System.out.println("Задача №1_____________________________________________________________________");
        int year = 2021;
        checkYearIsLeapAndPrint(year);


        System.out.println("\nЗадача №2_____________________________________________________________________");
        int clientOS = 1;
        int clentDeviceYear = 2024;
        String operatingSystem = validateDeviceAndYear(clientOS, clentDeviceYear);
        System.out.println(operatingSystem );


        System.out.println("\nЗадание №3_____________________________________________________________________");
        String string = calculateDeliveryDistance(100);
        System.out.printf("«Потребуется дней: %s » ",string);



    }


}








