package PuntoTres;

class Main {
    public static void main(String[] args) {

        double numeroUno = 4;
        double numeroDos = 6;
        double numeroTres = 3;

        double suma = numeroUno + numeroDos + numeroTres;
        double resta = numeroUno + numeroDos + numeroTres;
        double multiplicacion = numeroUno + numeroDos + numeroTres;
        double divisionUno = (numeroUno + numeroDos)/numeroTres;
        double divisionDos = (numeroUno + numeroTres)/numeroDos;
        double divisionTres = (numeroDos + numeroTres)/numeroUno;

        System.out.print("Suma: "+ suma + "\n");
        System.out.print("Resta: "+ resta + "\n");
        System.out.print("multiplicaciones: "+ multiplicacion + "\n");
        System.out.print("Division Uno: "+ divisionUno + "\n");
        System.out.print("Division Dos: "+ divisionDos + "\n");
        System.out.print("Division Tres: "+ divisionTres + "\n");
    }
}