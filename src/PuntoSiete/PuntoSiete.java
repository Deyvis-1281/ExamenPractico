package PuntoSiete;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota = 0;
        double suma = 0;
        int contador = 0;
        double promedio;

        do{
            System.out.print("Digite nota (para detener el programa y obtener el promedio, presiones -1: ");
            nota = scanner.nextDouble();

            if (nota != -1) {
                suma += nota;
                contador++;
            }
        }while (nota != -1);

        if (contador > 0){
            promedio = suma/contador;
            System.out.print("Promedio de las notas ingresadas es: " + promedio);
        }

    }
}