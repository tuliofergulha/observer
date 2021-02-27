package com.example.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class StolenCar implements Car{

    // contain a support object instead of extending the support class
    PropertyChangeSupport propertyChangeSupport = new  PropertyChangeSupport(this);

    public void addObserver(PropertyChangeListener propertyChangeListener){
        propertyChangeSupport.addPropertyChangeListener("move", propertyChangeListener);
    }

    @Override
    public void moveUp() {
        System.out.println("Stolen car moved up");
        propertyChangeSupport.firePropertyChange("move", "", "up");
    }

    @Override
    public void moveDown() {
        System.out.println("Stolen car moved down");
        propertyChangeSupport.firePropertyChange("move", "", "down");
    }

    @Override
    public void moveRight() {
        System.out.println("Stolen car moved right");
        propertyChangeSupport.firePropertyChange("move", "", "right");
    }

    @Override
    public void moveLeft() {
        System.out.println("Stolen car moved left");
        propertyChangeSupport.firePropertyChange("move", "", "left");
    }

}
