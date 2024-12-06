package PuntoCinco;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double descuento = 0;

        System.out.print("Digite el valor de su compra: ");
        double compra = scanner.nextDouble();

        if (compra >= 1000){
            descuento = 0.20;
            double totalCompra = compra * descuento;
            System.out.print("El valor de su descuento es de: " + totalCompra);

        }else if (compra >= 500 && compra < 1000){
            descuento = 0.10;
            double totalCompra = compra * descuento;
            System.out.print("El valor de su descuento es de: " + totalCompra);

        }else {
            System.out.print("Su compra no tiene descuento: ");
        }
        scanner.close();
    }
}
