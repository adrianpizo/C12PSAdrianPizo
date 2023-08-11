package B1;

public class Main {
    public static void main(String[] args) {
        int edad = 25;
        double fraccion = 18.4;
        String palabras = "Hola";
        boolean esBoolean = true;
        char caracter = 'A';

        Integer edadW = 20;
        Double fraccionW = 18.4;
        String palabrasW = "Hola";
        Boolean esBooleanW=true;
        Character caracterW ='A';

        //esBooleanW = palabrasW.equals("HOLA");
        //System.out.println(esBooleanW);

        //esBoolean=(3>4);
        //System.out.println(esBoolean);

        if (palabrasW.equals("HOLA")){
            System.out.println("Son Inguales las Palabras");
        }else {
            System.out.println("Son Diferentes las Palabras");
        }

        if (esBooleanW = palabrasW.equalsIgnoreCase("HOLA")){
            System.out.println("Son Inguales");
        }else {
            System.out.println("Son Diferentes");
        }
    }
}
