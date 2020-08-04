package ru.geekbrains.lesson5;

public abstract class Animal {
        private final int MAX_RUN_LENGTH = 0;
        private final int MAX_SWIM_LENGTH = 0;
        private final double MAX_JUMP_HEIGTH = 0;

        protected abstract void run(int length);

        protected abstract void swim(int length);

        protected abstract void jump(double height);
    }


