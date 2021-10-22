import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class Problema6 {

    public static void main(String[] args) {
        /*
                Problema 6.	Proponga un código (programa en java) de una función denominada Impares que realice lo siguiente:
                a.	Genere en forma aleatoria los elementos una cantidad al azar (máximo 200), se ingresan en una lista.
                b.	Extraiga todos los impares almacenados de la lista de números enteros y los almacene en una pila.
                c.	Imprima la secuencia original (la lista) y, a continuación, imprima la pila.
        */
        Random random = new Random();
        int rangoEnteros = 200, numeroAleatorio;
        int [] listaEnteros = new int [200];
        for (int i = 0; i < listaEnteros.length ; i++) {
            numeroAleatorio = random.nextInt(rangoEnteros); //elige un numero aleatorio y lo asigna a una variables
            listaEnteros[i] = numeroAleatorio;//la variable se asigna a una lista
        }
        System.out.println("La lista original de enteros es: " + Arrays.toString(listaEnteros));//imprime la lista enteros
        Impares(listaEnteros);//llama a la funcion Impares con el valor de listaEnteros
    }

    public static void Impares(int [] enteros) {
        int impares,espar = 0,j=0;
        int[] listaImpares = new int[200];
        Stack pilaImpares = new Stack();
        for (int entero : enteros) { //compara si es par o no, en caso de ser par, se sumara un contador, si no se sumara a la listaImpares
            if (entero % 2 == 0) {
                espar++;
            } else {
                impares = entero;
                listaImpares[j] = impares;
                if (listaImpares[j] > 0){
                    pilaImpares.push(listaImpares[j]);//asigna los valores impares a la pila
                }
                j++;
            }
        }
        System.out.println("La pila de impares es: " + pilaImpares); //imprime la pila de impares
        System.out.println("Hay " + espar + " numeros pares");//verifica cuantos pares
        System.out.println("Hay " + j + " numeros pares");//verifica cuantos impares
        System.out.println("La lista de los numeros impares es: " + Arrays.toString(listaImpares));
    }
}
