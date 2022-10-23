public class Main {
    public static void main(String[] args) {
        //задание 1

        int currentYear = leapYear(2022);

        //задание 2

        int phoneOS = phoneYear(1, 2015);





    }

    public static int leapYear(int currentYear) {
        if (currentYear % 4 == 0 && currentYear % 100 != 0 && currentYear % 400 != 0) {
            System.out.println(currentYear + " год високосный");
        }
        else {
            System.out.println(currentYear +" год не високосный");
        }
        return currentYear;
    }

    public static int phoneYear(int clientOS, int phoneYear) {
        if (clientOS == 0 && phoneYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");

        } else if (clientOS == 0 && phoneYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1 && phoneYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");

        } else if (clientOS == 1 && phoneYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        return clientOS;
    }

}