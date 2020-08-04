package ru.geekbrains.lesson5.zoo;

import ru.geekbrains.lesson5.Animal;

public class Cat extends Animal {
        private final int MAX_RUN_LENGTH = 200;
        private final double MAX_JUMP_HEIGTH = 2;

        @Override
        public void run(int length) {
            if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("cat run");
            else System.out.println("cat don`t run");
        }

        @Override
        public void swim(int length) {
            System.out.println("cat don`t swim");
        }

        @Override
        public void jump(double height) {
            if ((height >= 0) && (height <= MAX_JUMP_HEIGTH)) System.out.println("cat jump");
            else System.out.println("cat don`t jump ");
        }
    }

