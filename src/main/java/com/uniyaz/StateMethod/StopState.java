package com.uniyaz.StateMethod;

/**
 * @author Gaye DURMAZ
 * @date 7/5/2020
 */
public class StopState implements StateInterface{
    @Override
    public void doAction() {
        System.out.println("Bitiş işlemi yapılıyor...");
    }
}
