public class Recursividad {
    public static void main(String[] args) {
        int base = 2;
        int exponente = 3;
        int resultado = calcularPotenciaSuma(base, exponente);
        System.out.println(base + " elevado a la " + exponente + " es igual a: " + resultado);
    }

    public static int calcularPotenciaSuma(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return suma(base, calcularPotenciaSuma(base, exponente - 1));
        }
    }

    public static int suma(int a, int b) {
        return a + b;
    }
}