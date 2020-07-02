package com.uniyaz.TemplateMethod;

/**
 * @author Gaye DURMAZ
 * @date 7/2/2020
 */
public class SuperMario extends Game {
    @Override
    void oyuncuSeç() {
        System.out.println("Karakter Seçiniz:");
        System.out.println("- Mario\n- Luigi ");
    }

    @Override
    void oyunuBaslat() {
        System.out.println("Mario oyunu başlatıldı.");
    }

    @Override
    void oyunuBitir() {
        System.out.println("Mario oyunu sonlandırıldı.");
    }
}
