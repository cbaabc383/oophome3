package ru.geekbrains.lesson3.hw3;

/**
 * TODO: Доработать в рамках домашнего задания
 */
public class Freelancer extends Employee {

    /**
     * отработано часов
     */
    private int hours;

    public int getHours() {
        return hours;
    }

    public Freelancer(String name, String surName, double salary, int birthDay, int hours) {
        super(name, surName, salary, birthDay);
        this.hours = hours;
    }

    @Override
    public double calculateSalary() {
        return salary * hours;
    }

    @Override
    public String toString() {
        return String.format("%s %s; %d г.; Фрилансер; Расчетная заработная плата за %d час. %.2f ",
                getSurName(), getName(), getBirthDay(), getHours(), calculateSalary());
    }
}
