package ru.geekbrains.lesson3.task1;

public class Cat extends Animal {

    private static int counter;

    public static int getCounter() {
        return counter;
    }

    {
        System.out.println("Initializer - Cat");
        counter++;
    }

    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        System.out.println("Constructor - Cat");

    }

    public Cat(String name) {
        super(name, 200, 0);
        System.out.println("Constructor - Cat");

    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s не умеет плавать!\n", name);
    }
}
