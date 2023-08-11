package B3;

public class Main {
    public static void main(String[] args) {
        int day = 3;
        String dayName;
        String palabra = "Hola";
        boolean esEncontrada = false;
        String[]palabrasGuardadas={"Hola","Como","Esta","Usted"};
        for (int i = 0; i < palabrasGuardadas.length; i++) {
            if (palabrasGuardadas[i].equalsIgnoreCase("Hola")){
                esEncontrada=true;
            }
        }
        switch (palabra){
            case "Hola":
                System.out.println("Saludo");
                break;
        }

        switch (day){
            case 1: dayName = "Sunday";
                break;
            case 2: dayName = "Monday";
                break;
            case 3: dayName = "Tuesday";
                break;
            case 4: dayName = "Wednesday";
                break;
            case 5: dayName = "Thursday";
                break;
            case 6: dayName = "Friday";
                break;
            case 7: dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("Day "+ day + "is "+dayName);
    }
}
