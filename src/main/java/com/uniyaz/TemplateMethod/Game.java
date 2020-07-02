package com.uniyaz.TemplateMethod;

/**
 * @author Gaye DURMAZ
 * @date 7/2/2020
 */
public abstract class Game {

    abstract void oyuncuSeç();

    abstract void oyunuBaslat();

    abstract void oyunuBitir();

    /**
     * Oyunun algoritmasının adımları belirlenir.
     * Extend olan sınıflar adım sırasını değiştiremez ancak
     * abstract metodları override ederek davranışlarını değiştirebilir.
     */
    public void play() {
        oyuncuSeç();
        oyunuBaslat();
        oyunuBitir();
    }
}
