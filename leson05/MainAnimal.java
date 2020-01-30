package rewertoy.leson06.homework;

import java.util.Random;

public class MainAnimal {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Гарфильд"),
                new Cat("Василий"),
                new Cat("Барсик")
        };
        Bird[] birds = {
                new Bird("Шурик"),
                new Bird("Дори"),
                new Bird("Гоша")
        };
        Dog dogs[] = {
                new Dog("Мухтар"),
                new Dog("Бим"),
                new Dog("Тузик")
        };
        Horse[] horses = {
                new Horse("Сникерс"),
                new Horse("Такер"),
                new Horse("Цезарь")

        };

        for (int i = 0; i < 3; i++) {
            System.out.println(cats[i].run(200));
            System.out.println(cats[i].swim(0));
            System.out.println(cats[i].jump(2));
        }
        System.out.println("_____________________________________________");
        for (int i = 0; i < 3; i++) {
            System.out.println(birds[i].run(5));
            System.out.println(birds[i].swim(5));
            System.out.println(birds[i].jump(0.2f));
        }
        System.out.println("_____________________________________________");
        for (int i = 0; i < 3; i++) {
            System.out.println(dogs[i].run(500));
            System.out.println(dogs[i].swim(10));
            System.out.println(dogs[i].jump(0.5f));
        }
        System.out.println("_____________________________________________");
        for (int i = 0; i < 3; i++) {
            System.out.println(horses[i].run(1500));
            System.out.println(horses[i].swim(100));
            System.out.println(horses[i].jump(3));
        }
    }
}
