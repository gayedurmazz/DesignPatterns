package com.uniyaz;

import com.uniyaz.TemplateMethod.Chess;
import com.uniyaz.TemplateMethod.FireAndWater;
import com.uniyaz.TemplateMethod.Game;
import com.uniyaz.TemplateMethod.SuperMario;

/**
 * Template Method Example
 */
public class App {
    public static void main(String[] args) {
        System.out.println("İki kişilik oyunlar.");

        //Satranç oyunu
        System.out.println("\n*****Satranç oyunu*****\n");
        Game game = new Chess();
        game.play();

        //Super Mario oyunu
        System.out.println("\n*****Super Mario oyunu*****\n");
        game = new SuperMario();
        game.play();

        //Ateş ve su oyunu
        System.out.println("\n*****Ateş ve su oyunu*****\n");
        game = new FireAndWater();
        game.play();

    }
}
