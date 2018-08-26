package TaskYears;

import java.util.Scanner;

public class TaskYears {
    public static void main(String[] args) {
        System.out.println("Введите год:");
        Scanner a = new Scanner(System.in);
        int year = a.nextInt();

        if ((year % 10 >= 2 & year % 10 <= 4) | (year >= 2 & year <= 4)) {
            System.out.println(year + " года");
        } else if ((year % 10 >= 5 & year % 10 < 9 | year % 10 == 0) | (year >= 5 & year <= 9 | year == 0)) {
            System.out.println(year + " лет");
        } else if (year % 10 == 1 | year == 1) {
            System.out.println(year + " год");
        }

    }
}
