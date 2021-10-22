import java.util.Arrays;
import java.util.Random;

public class Problema7 {

    public static void main(String[] args) {
        /*
         Problema 7.	Se tiene una lista enlazada a la que se accede por el primer nodo.
            Proponga un código (programa en java) de una función denominada Traspaso que imprima los nodos de la lista en orden inverso, desde el último nodo al primero.
             Para ello, proponga como apoyo auxiliar la mejor estructura que considere, justificando su elección (un arreglo, otra lista, una pila, una cola o un árbol).
             La cantidad de elementos se genera en forma aleatoria, de igual forma los elementos.
        */
        Random random = new Random();
        int rangoAleatorio = 50; //busca el rango que deba tomar la listaDeDatos
        int numeroAleatorio = random.nextInt(rangoAleatorio);
        int [] listaDeDatos = new int[numeroAleatorio]; //se elige una lista de rango aleatorio, porque es mas sencillo trabajar con listas, a pesar de que consuman mas memoria y hagan mas lento el proceso.

        Traspaso(listaDeDatos);
    }
    public static void Traspaso(int [] datos){
        Random random = new Random();
        int numerosAleatorios = 100,aleatorio;
        for (int i = 0; i < datos.length; i++) {
            aleatorio = random.nextInt(numerosAleatorios);
            datos[i] = aleatorio;
        }
        System.out.println("La lista final de rango aleatorio y numeros aleatorios es: " + Arrays.toString(datos));



    }




}
