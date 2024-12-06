package PuntoSeis;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        int tabla;
        int m= 1;

        System.out.print("Ingrese el numero de la tabla de multiplicar: ");
        numero = scanner.nextInt();

        while (m <= 20){

            tabla = numero * m;
            System.out.print("Resultado: " + numero + "x" + m + "= " + tabla + "\n");
            m++;
        }
    scanner.close();
    }
}