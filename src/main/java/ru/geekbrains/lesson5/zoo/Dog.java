package ru.geekbrains.lesson5.zoo;

import ru.geekbrains.lesson5.Animal;

public class Dog extends Animal {

        private final int MAX_RUN_LENGTH = 500;
        private final double MAX_JUMP_HEIGTH = 0.5;
        private final int MAX_SWIM_LENGTH = 10;

        @Override
        public void run(int length) {
            if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("dog run");
            else System.out.println("dog don`t run");
        }

        @Override
        public void swim(int length) {
            if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) System.out.println("dog swim");
            else System.out.println("dog don`t swim");
        }

        @Override
        public void jump(double height) {
            if ((height >= 0) && (height <= MAX_JUMP_HEIGTH)) System.out.println("dog jump");
            else System.out.println("dog don`t jump");
        }
    }


