package com.example.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PoliceCar implements PropertyChangeListener, Car {

    @Override
    public void moveUp() {
        System.out.println("Police Car moved up");
    }

    @Override
    public void moveDown() {
        System.out.println("Police Car moved down");
    }

    @Override
    public void moveRight() {
        System.out.println("Police Car moved right");
    }

    @Override
    public void moveLeft() {
        System.out.println("Police Car moved left");
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {

        if(propertyChangeEvent.getNewValue().equals("up")){
            moveUp();
        }else if(propertyChangeEvent.getNewValue().equals("down")){
            moveDown();
        }else if(propertyChangeEvent.getNewValue().equals("right")){
            moveRight();
        }else if(propertyChangeEvent.getNewValue().equals("left")){
            moveLeft();
        }
    }
}
