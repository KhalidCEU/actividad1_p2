
package dominio;

public class Mates {

    // Suma 0 + 1 + 2 + ... + n.
    public static int sumaHastaN(int nb) {
        int resultado = 0;

        for (int i = 0; i <= nb; i++) {
            resultado += i;
        }

        return resultado;
    }

    // Factorial de un numero
    public static int factorial(int nb) {
        int resultado = 1;

        for (int i = nb; i > 0; i--) {
            resultado *= i;
        }

        return resultado;
    }

    // Potencia n-esima
    public static int potencia(int nb, int exponente) {
        int resultado = 1;

        for (int i = 1; i <= exponente; i++) {
            resultado *= nb;
        }

        return resultado;
    }

    // Suma elementos de una lista de numeros
    public static int sumaElementosLista(int[] listanumeros) {
        int resultado = 0;

        for (int nb : listanumeros) {
            resultado += nb;
        }

        return resultado;
    }

    // Media aritmetica de una lista de numeros
    public static double mediaElementosLista(int[] listanumeros) {
        double resultado = 0;
        int nbElementos = listanumeros.length;

        for (int nb : listanumeros) {
            resultado += nb;
        }

        resultado = resultado / nbElementos;

        return resultado;
    }

    // Desviación tipica de una lista de numeros
    public static double desviacionElementosLista (int[] listanumeros) {
        double resultado = 0;
        int nbElementos = listanumeros.length;
        double media = mediaElementosLista(listanumeros);

        for (double nb : listanumeros) {
            double diferenciaCuadrado = Math.pow(nb - media, 2);
            resultado += diferenciaCuadrado;
        }

        double varianza = resultado / nbElementos;
        double desviacion = Math.sqrt(varianza);

        return desviacion;
    }

}