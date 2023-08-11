package B2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*      Boolean esNumerico=false;
        int edad = 19;

        if (esNumerico == null){
            System.out.println("El boolean es Null");
        }
        else if (esNumerico){
            System.out.println("Es numerico");
        }else{
            System.out.println("No es numerico");
        }

        System.out.println("----------------------------------");
        String mensaje = (edad>=18) ? "Eres Mayor de Edad" : "Es Menor de Edad";
        System.out.println(mensaje);
*/
        System.out.println("***************************************************");

        List<String> nombre = new ArrayList<>();
        nombre.add("Adrian");
        nombre.add("Felipe");
        nombre.add("Carlos");

        int[] edades ={10,11,9,8,13,17};
/*
        for (String nombres:nombre){
            System.out.println(nombres);
        }

        for (int edadd:edades){
            System.out.println(edadd);
        }
*/
        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }
        for (int i = 0; i < nombre.size() ; i++) {
            System.out.println(i);
        }

    }
}
