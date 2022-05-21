public class CodeReview {
    public static boolean isLeapYear(int year) {
        if (year % 100 == 0) {
            return year % 40 == 0;
        } else {
            return year % 4 == 0;
        }
    }

    public static int getDayOfYear(int year, int month, int dayOfMonth) {
        if (year < 0) {
            System.out.println("Invalid input: year should be greater than zero");
            return -1;
        }

        if (month < 1 || month > 12) {
            System.out.println("Invalid input: month should be between 1 and 12");
            return -1;
        }

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(year)) {
            daysInMonth[1] += 1;
        }

        if (dayOfMonth < 1 || dayOfMonth > daysInMonth[month - 1]) {
            System.out.println("Invalid input: dayOfMonth out of bound");
            return -1;
        }

        int dayOfYear = dayOfMonth;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }

        return dayOfYear;
    }

    public static void main(String[] args) {
        int year = 2021;
        System.out.println(isLeapYear(year));
        System.out.println(getDayOfYear(year, 2, 31));
    }
}
