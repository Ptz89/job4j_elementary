package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double dolg = amount + (amount * percent / 100);
        while (dolg > salary) {
            year++;
            dolg -= salary;
            dolg = dolg + (dolg * percent / 100);
        }
        year += 1;
        return year;
    }

    public static void main(String[] args) {
        System.out.println(Mortgage.year(100, 120, 50));

    }
}
