package PuntoNueve;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {

        String[] datos = {"antony", "32", "fredy", "45", "maria", "23"};
        List<String> nombres = new ArrayList<>();
        List<String> edades = new ArrayList<>();
        for (String dato : datos) {
            if (dato.matches("\\d+")) {
                edades.add(dato);
            } else {
                nombres.add(dato);
            }
        }
        System.out.println("Nombres: " + nombres);
        System.out.println("Edades: " + edades);
    }
}