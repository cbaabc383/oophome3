package ru.geekbrains.lesson3.hw3;

import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();

    /**
     * TODO: Переработать метод generateWorker. Метод должен возвращать случайного
     *  сотрудника (Freelancer или Worker)
     * @return
     */
    public static Employee generateEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surNames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

        int salary;
        int type = random.nextInt(2);

        if (type == 0) {
            salary = random.nextInt(300, 1000);
            return new Freelancer(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)],
                    salary, random.nextInt(1960, 2005), random.nextInt(20 * 8));
        } else {
            salary = random.nextInt(30000, 80000);
            return new Worker(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], salary, random.nextInt(1960, 2005));
        }
    }

    public static Employee[] generateEmployees(int count){
        Employee[] employees = new Employee[count];
        for (int i = 0; i < count; i++){
            employees[i] = generateEmployee();
        }
        return employees;
    }

    public static void main(String[] args) {

        Employee[] employees = generateEmployees(12);

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println();

        Arrays.sort(employees, new BirthDayComparator());

        for (Employee employee: employees) {
            System.out.println(employee);
        }


    }

}
