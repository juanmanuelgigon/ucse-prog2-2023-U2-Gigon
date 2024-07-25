package Ejercicios;

import java.util.Random;

public class EsperaYNumero {
    public int esperaYNumero(){
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(1000,5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return random.nextInt(100,500);
    }
}
