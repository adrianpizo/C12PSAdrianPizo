package B1;
//1. Deben desarrollar un software que calcule el menor de 2 numeros declarados anteriormente.
//2. Deben desarrollar un software que calcule su edad a partor del anio de nacimiento.

public class TrabajoEnClaseB1_1 {
    public static void main(String[] args) {
        int numeroUno = 9;
        int numeroDos = 7;

        if (numeroUno > numeroDos){
            System.out.println("El numero UNO (1) es MAYOR");
        }else {
            System.out.println("El numero DOS (2) es MAYOR");
        }

        final int anio = 2023;
        final int nacimiento = 1994;
        int edad = 0;
        edad = anio - nacimiento;

        System.out.println("Su edad es: "+edad);
    }
}
