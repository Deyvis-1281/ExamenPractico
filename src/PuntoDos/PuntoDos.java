package PuntoDos;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite su tipo de cuenta: 1 para cuenta de ahorro, 2 para cuenta corriente y 3 para cuenta de nomina: ");
        int cuenta = scanner.nextInt();

        switch(cuenta){

            case 1:
                System.out.print("Tienes cuenta de ahorro");
                break;

            case 2:
                System.out.print("Tienes cuenta corriente");
                break;

            case 3:
                System.out.print("Tienes cuenta de nomina");
                break;
        }
        scanner.close();
    }
}
