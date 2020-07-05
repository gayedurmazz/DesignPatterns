package com.uniyaz.StateMethod;

/**
 * @author Gaye DURMAZ
 * @date 7/2/2020
 *
 * State design pattern ile solid prensiplerinden Open-Closed
 * prensibi uygulanmış olur.
 *
 * Yeni bir durum eklenmek istediğinde kod değiştirmeden sınıf olarak eklenir.
 *
 */
public class StateMethodApp {
    public static void main(String[] args) {

        StateContext context = new StateContext();

        // İlk durum atanır.
        context.setState(new InitializeState());
        context.doAction(); // InitialiceState'in doAction metodu çalışır.

        // Durum değişimi
        context.setState(new StartState());
        context.doAction(); // StartState'in doAction metodu çalışır.

        // Durum değişimi
        context.setState(new StopState());
        context.doAction(); // StopState'in doAction metodu çalışır.

    }
}
