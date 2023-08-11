package B3;

//REALIZAR UN MENU CON 3 OPCIONES, 1. VA A REALIZAR UN LOGIN Y ESE LOGIN DEBE DE
//PEDIR USUARIO Y UN PASS.
//SI LO INGRESA 3 VECES MAL LA INFORMACION DEBE DECIR USUARIO BLOQUEADO.

import java.util.Scanner;

public class TrabajoClaseB3_1 {
    public static void main(String[] args) {
        System.out.println("__________MENÙ DE OPCIONES__________");
        System.out.println("1.-Ingreso de Usuario: \n"+""+"2.-Contacto: \n"+""+"3.-Acerca de: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el Numero Segun la Opcion a Eleir: ");
        int menu = scanner.nextInt();
        String IngUsu = "adrian";
        String IngClave = "1234";
        int opcionmenu=0;
        while (opcionmenu<1){
            switch (menu){
                case 1:
                    System.out.println("Ingrese el Usuario");
                    String Usuario = scanner.next();
                    System.out.println("Ingrese el Usuario");
                    String clave = scanner.next();

                    if (Usuario.equals(IngUsu) && clave.equals(IngClave)){
                        System.out.println("Haz Ingredado al Sistema Exitosamente!");
                    }else {
                        opcionmenu=opcionmenu+1;
                        System.out.println(opcionmenu);
                        System.out.println(Usuario);
                        System.out.println(clave);
                    }
                    break;
                case 2: System.out.println("Estas en la Seccion de Contacto");
                    break;
                case 3: System.out.println("Estas en la Seccion de Acerca de");
                    break;
                default:
                    System.out.println("Error!");
            }
            opcionmenu++;
        }
    }
}
