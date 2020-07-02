package com.uniyaz.TemplateMethod;

/**
 * @author Gaye DURMAZ
 * @date 7/2/2020
 */
public class FireAndWater extends Game {
    @Override
    void oyuncuSeç() {
        System.out.println("Karakter Seçiniz:");
        System.out.println("- Su\n- Ateş");
    }

    @Override
    void oyunuBaslat() {
        System.out.println("Ateş ve Su oyunu başlatıldı.");
    }

    @Override
    void oyunuBitir() {
        System.out.println("Ateş ve su oyunu sonlandırıldı.");
    }
}
