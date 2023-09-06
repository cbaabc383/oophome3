package ru.geekbrains.lesson3.task2;

/**
 * Обычный рабочий (фулл-тайм)
 */
public class Worker extends Employee{
    public Worker(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата (фиксированная) %.2f",
                surName, name, salary);
    }
}
