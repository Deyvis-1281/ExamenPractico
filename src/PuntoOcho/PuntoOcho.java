package PuntoOcho;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {

    String linea = "antony|fredy|julian|marcos";
        List<String> lineaSeparada = new ArrayList<>(Arrays.asList(linea.split("\\|")));

    for(String lista : lineaSeparada){
        System.out.print(lineaSeparada);
    }
    }
}