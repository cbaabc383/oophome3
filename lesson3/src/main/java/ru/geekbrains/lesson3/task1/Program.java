package ru.geekbrains.lesson3.task1;

public class Program {


    /**
     *    Создать классы Собака и Кот с наследованием от класса Животное.
     *     Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
     *     Результатом выполнения действия будет печать в консоль. (Например, dog1.run(150); -> 'Бобик пробежал 150 м.');
     *     У каждого животного есть ограничения на действия
     *     (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
     *     Добавить подсчет созданных котов, собак и животных.
     */

    public static void main(String[] args) {



        Animal[] animals = {
                new Cat("Барсик"),
                new Cat("Персик"),
                new Dog("Быстрый", 500, 20),
                new Dog("Тузик", 500, 20),
                new Dog("Шарик", 500, 25),
                new Dog("Бима", 600, 30),
        };

        for (Animal animal: animals) {
            System.out.printf("%d - %s\n", animal.getId(), animal.getName());
            animal.run(200);
            animal.swim(50);
        }

        System.out.println("Счетчик идентификаторов объектов: " + Animal.getIdCounter() );
        System.out.println("Было создано " + Cat.getCounter() + " котов.");
        System.out.println("Было создано " + Dog.getCounter() + " собак.");
        System.out.println("Было создано " + Animal.getCounter() + " животных.");

    }

}
