package B2;

import javax.swing.*;
import java.util.Scanner;

public class IngresosPorConsola {
    public static void main(String[] args) {
        //OTRA FORMA DE SOLICITAR DATOS:

        JOptionPane.showMessageDialog(null,"Esto es un Mensaje Usando JOptionPane");

        //Solicitar un dato al Usuarion y almacenarla en una Variable:
        String nombre = JOptionPane.showInputDialog( null,"Ingrese su Nombre: ");

        //Muestra un cuadro de Dialogo con el Nombre Ingresado:
        JOptionPane.showMessageDialog(null,"Hola: " + nombre + "Bienbenido al JOptionPane");

        Scanner scanner = new Scanner(System.in);

        //Leer un Numero Entero
        System.out.print("Ingresa un numero Entero: ");
        int numeroEntero = scanner.nextInt();
        System.out.println("Numero entero ingresado es: " +numeroEntero);

        //Leer un numero de punto flotante:
        System.out.print("Ingresa un Numero de punto Flotante: ");
        double numeroFlotante = scanner.nextDouble();
        System.out.println("Numero de Punto Flotante es: " +numeroFlotante);

        //Leer una Cadena:
        System.out.print("Ingrese una Cadena: ");
        String cadena = scanner.nextLine();
        System.out.println("La Cadena Ingresada es: " +cadena);

        //Cerrar el Objeto Scanner para liberar Recursos
        scanner.close();
    }
}
