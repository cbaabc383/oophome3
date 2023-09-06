package ru.geekbrains.lesson3.hw3;

/**
 * Работник
 */
public abstract class Employee implements Comparable<Employee> {

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;

    /**
     * Ставка заработной платы
     */
    protected double salary;
    protected int birthDay;

    protected String getName() {
        return name;
    }

    protected String getSurName() {
        return surName;
    }

    protected double getSalary() {
        return salary;
    }

    public int getBirthDay() {
        return birthDay;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();


    public Employee(String name, String surName, double salary, int birthDay) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return String.format("%s %s", getSurName(), getName());
    }

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }
}
