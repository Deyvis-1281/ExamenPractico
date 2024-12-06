package PuntoCuatro;

class Main {
    public static void main(String[] args) {

        int suma = 0;

        for (int s = 1; s <= 100; s++) {

            if (s % 2 == 0){
                suma += s;
            }
        }
        System.out.print("El resultado de la suma es: " + suma);
    }
}
