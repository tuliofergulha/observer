package com.example.observer;

public class Observer {

    public static void main(String[] args) {

        StolenCar stolenCar = new StolenCar();

        PoliceCar policeCar = new PoliceCar();

        stolenCar.addObserver(policeCar);

        // movements
        stolenCar.moveUp();
        stolenCar.moveDown();
        stolenCar.moveRight();
        stolenCar.moveLeft();

    }

}
