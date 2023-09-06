package ru.geekbrains.lesson3.hw3;

import java.util.Comparator;

public class BirthDayComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getBirthDay(), o2.getBirthDay());
    }
}
