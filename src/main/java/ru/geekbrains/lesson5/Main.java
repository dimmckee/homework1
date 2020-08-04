package ru.geekbrains.lesson5;

import ru.geekbrains.lesson5.zoo.Cat;
import ru.geekbrains.lesson5.zoo.Dog;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();



        cat.run(20);
        dog.run(375);

        dog.swim(15);

        cat.jump(2.2);
        dog.jump(0.3);
}
    }