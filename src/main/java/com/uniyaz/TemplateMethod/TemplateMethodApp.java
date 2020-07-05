package com.uniyaz.TemplateMethod;

/**
 * @author Gaye DURMAZ
 * @date 7/2/2020
 */
public class TemplateMethodApp {
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
