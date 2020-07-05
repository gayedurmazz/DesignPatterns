package com.uniyaz.StateMethod;

/**
 * @author Gaye DURMAZ
 * @date 7/5/2020
 */
public class StartState implements StateInterface{
    @Override
    public void doAction() {
        System.out.println("Başlangıç işlemi yapılıyor...");
    }
}
