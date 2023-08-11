package B2;
//Trabajar en un programa que me calcule en grupos ordenados los numeros
// pares e impares desde el 1 hasta un numero especifico.


import java.util.Scanner;

public class TrabajoEnClaseB2_1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String numpar="", numimpar="";
        System.out.println("Ingrese el Numero a Llegar: ");
        int numero = lectura.nextInt();
        if (numero>=1){
            for (int i = 0; i <= numero; i++) {
                if (i % 2 == 0){
                    if (i==numero){
                        numpar += i;
                    }else {
                        numpar +=i + ",";
                    }
                }else {
                    if (i==(numero-1)){
                        numimpar +=i;
                    }else {
                        numimpar +=i + ",";
                    }
                }
            }

        }else {
            System.out.println("No es un Numero Positivo");
        }
        System.out.println("Numeros Pares: \n " +numpar+"\n NumerosImpares:\n"+numimpar);
    }
}
