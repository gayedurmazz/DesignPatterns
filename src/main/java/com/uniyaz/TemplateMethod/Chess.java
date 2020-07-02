package com.uniyaz.TemplateMethod;

/**
 * @author Gaye DURMAZ
 * @date 7/2/2020
 */
public class Chess extends Game {
    @Override
    void oyuncuSeç() {
        System.out.println("Karakter Seçiniz:");
        System.out.println("- Beyaz oyuncu\n- Siyah oyuncu");
    }

    @Override
    void oyunuBaslat() {
        System.out.println("Satranç oyunu başlatıldı.");
    }

    @Override
    void oyunuBitir() {
        System.out.println("Satran oyunu sonlandırıldı.");
    }
}
