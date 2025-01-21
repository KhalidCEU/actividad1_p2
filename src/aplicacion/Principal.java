
package aplicacion;
import dominio.*;

public class Principal {
    public static void main(String[] args) {
        // Suma hasta n
        System.out.println("Suma hasta n: " + Mates.sumaHastaN(10));

        // Factorial
        System.out.println("Factorial: " + Mates.factorial(5));

        // Potencia N-ésima
        System.out.println("Potencia: " + Mates.potencia(2, 4));

        // Suma elementos
        int[] listaNumeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Suma elementos lista: " + Mates.sumaElementosLista(listaNumeros));

        // Media elementos
        System.out.println("Media elementos lista: " + Mates.mediaElementosLista(listaNumeros));

        // Desviacion tipica elementos
        // Fuente teoria : https://www.superprof.es/apuntes/escolar/matematicas/estadistica/descriptiva/desviacion-tipica.html
        int[] listaNumeros2 = {9, 3, 8, 8, 9, 8, 9, 18};
        System.out.println("Desviación elementos lista: " + Mates.desviacionElementosLista(listaNumeros2));

        // Suma pares en n numeros
        System.out.println("Suma pares: " + Mates.sumaParesHastaN(9));

        // Suma pares de una lista
        System.out.println("Suma pares (lista): " + Mates.sumaParesElementosLista(listaNumeros));

        // Obtener pares de una lista
        System.out.println("Lista pares: " + Mates.obtenerListaPar(listaNumeros));

        // Obtener pares de numeros hasta n
        System.out.println("Lista pares 2: " + Mates.obtenerListaParHastaN(9));
    }
}