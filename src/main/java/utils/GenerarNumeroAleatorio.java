package utils;

import java.util.Random;

public class GenerarNumeroAleatorio {
    static String numeroAleatorio="";
    public String getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public void setRangoNumeroAleatorio(int min_val, int max_val) {
        Random ran = new Random();
        numeroAleatorio = Integer.toString(min_val + ran.nextInt((max_val - min_val) + 1));
    }

}
