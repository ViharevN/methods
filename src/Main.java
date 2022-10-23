public class Main {
    public static void main(String[] args) {
        //задание 1

        int currentYear = leapYear(2022);
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
}