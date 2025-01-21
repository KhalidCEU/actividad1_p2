package dominio;
import java.util.ArrayList;

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

    // Suma de numeros pares hasta N
    public static int sumaParesHastaN(int nb) {
        int resultado = 0;

        for (int i = nb; i >= 2; i--) {
            if (i % 2 == 0) {
                resultado += i;
            }
        }

        return resultado;
    }

    // Suma de elementos pares en una lista
    public static int sumaParesElementosLista(int[] lista) {
        int resultado = 0;

        for (int nb : lista) {
            if (nb % 2 == 0) {
                resultado += nb;
            }
        }

        return resultado;
    }

    // Lista de numeros pares de una lista dada
    public static ArrayList<Integer> obtenerListaPar(int[] lista) {
        ArrayList<Integer> listaPar = new ArrayList<Integer>();

        for (int nb : lista) {
            if (nb >= 2 && nb % 2 == 0) {
                listaPar.add(nb);
            }
        }

        return listaPar;
    }

    // Lista de numeros pares hasta N (en orden descendiente)
    public static ArrayList<Integer> obtenerListaParHastaN(int nb) {
        ArrayList<Integer> listaPar = new ArrayList<Integer>();

        for (int i = nb; i >= 2; i--) {
            if (i % 2 == 0) {
                listaPar.add(i);
            }
        }

        return listaPar;
    }

    // Producto escalar de dos listas no vacias y del mismo tamaño
    public static int productoEscalarListas(int[] lista1, int[] lista2) {
        int resultado = 0;

        if (lista1.length == 0 || lista2.length == 0) {
            System.out.println("Ninguna de las 2 listas puede estar vacía !");
            System.exit(1);
        }

        if (lista1.length != lista2.length) {
            System.out.println("Las listas deben ser del mismo tamaño");
            System.exit(1);
        }

        for(int i = 0; i < lista1.length; i++) {
            resultado += lista1[i] * lista2[i];
        }

        return resultado;
    }
}
