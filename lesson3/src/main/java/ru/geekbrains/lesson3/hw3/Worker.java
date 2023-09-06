package ru.geekbrains.lesson3.hw3;

/**
 * Обычный рабочий (фулл-тайм)
 */
public class Worker extends Employee {
    public Worker(String name, String surName, double salary, int birthDay) {
        super(name, surName, salary, birthDay);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; %d г.; Рабочий; Среднемесячная заработная плата (фиксированная) %.2f",
                surName, name, birthDay, salary);
    }
}
