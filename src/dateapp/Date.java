package dateapp;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Date implements Comparable<Date> {
    private int day;
    private int month;
    private int year;

    // Конструктор
    public Date(int day, int month, int year) {
        if (isValidDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException("Invalid date: " + day + "/" + month + "/" + year);
        }
    }

    // Проверка корректности даты
    public boolean isValidDate(int d, int m, int y) {
        if (y < 1 || m < 1 || m > 12 || d < 1) return false;

        int[] daysInMonth = {
                31, isLeapYear(y) ? 29 : 28, 31, 30,
                31, 30, 31, 31, 30, 31, 30, 31
        };

        return d <= daysInMonth[m - 1];
    }

    // Проверка на високосный год
    private boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || (y % 400 == 0);
    }

    // Обновить дату
    public void updateDate(int d, int m, int y) {
        if (isValidDate(d, m, y)) {
            this.day = d;
            this.month = m;
            this.year = y;
        } else {
            System.out.println("Invalid date. Not updated.");
        }
    }

    // Получить день недели
    public String getDayOfWeek() {
        LocalDate localDate = LocalDate.of(year, month, day);
        return localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }

    // Разница между датами (в днях)
    public int calculateDifference(Date other) {
        LocalDate thisDate = LocalDate.of(this.year, this.month, this.day);
        LocalDate otherDate = LocalDate.of(other.year, other.month, other.day);
        return Math.abs((int) (thisDate.toEpochDay() - otherDate.toEpochDay()));
    }

    // Напечатать дату красиво
    public void printDate() {
        String monthName = LocalDate.of(year, month, day).getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println(monthName + " " + day + ", " + year);
    }

    // Для сортировки (по году, месяцу, дню)
    @Override
    public int compareTo(Date other) {
        if (this.year != other.year) return this.year - other.year;
        if (this.month != other.month) return this.month - other.month;
        return this.day - other.day;
    }
}

