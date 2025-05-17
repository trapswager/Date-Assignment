package dateapp;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Создаём даты
        try {
            Date date1 = new Date(15, 5, 2023);
            Date date2 = new Date(29, 2, 2024); // високосный год
            Date date3 = new Date(1, 1, 2022);
            Date invalidDate = new Date(31, 2, 2023); // ошибка
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Date myDate = new Date(17, 5, 2025);
        myDate.printDate();
        System.out.println("Day of week: " + myDate.getDayOfWeek());

        // Обновление даты
        myDate.updateDate(1, 1, 2024);
        myDate.printDate();

        // Разница в днях
        Date anotherDate = new Date(10, 5, 2024);
        System.out.println("Difference: " + myDate.calculateDifference(anotherDate) + " days");

        // Сортировка списка дат
        ArrayList<Date> dateList = new ArrayList<>();
        dateList.add(new Date(1, 1, 2023));
        dateList.add(new Date(25, 12, 2022));
        dateList.add(new Date(5, 3, 2023));
        dateList.add(new Date(14, 2, 2021));

        System.out.println("\nBefore sorting:");
        for (Date d : dateList) d.printDate();

        Collections.sort(dateList);

        System.out.println("\nAfter sorting:");
        for (Date d : dateList) d.printDate();
    }
}
