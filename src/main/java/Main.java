/*
* Autor:_ Carlos Sarmiento
* */

import utils.ExtraerData;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        //declaro e inicializo variables
        ArrayList<Integer> numeros = new ArrayList<>();
        int sumador = 0;
        double promedio;

        //instancio un objeto de la clase EstraerData
        List<Map<String, String>> data = ExtraerData.deExcel();

        //la data del excel la agrego al arraylist declarado
        for(Map<String, String> numero:data)
            numeros.add(Integer.parseInt(numero.get("Numeros")));

        //recorro el arraylist y sumo su contenido
        for(int numero:numeros)
            sumador+=numero;

        //calculo promedio
        promedio = (double) sumador /numeros.size();

        //obtengo el tamaño del arraylist
        int tamanioArray = numeros.size()+1;

        //agrego los siguientes 50 numeros al arraylist
        for(int i=tamanioArray;i<tamanioArray+50;i++)
            numeros.add(i);

        //e imprimo por consola los resultados
        System.out.println("\nPromedio: "+promedio);
        System.out.println("\nNumeros del arrayList: \n");
        for (Integer numero : numeros) {
            System.out.print(numero+" ");
            if(numero%10==0)
                System.out.println("");
        }

    }
}
