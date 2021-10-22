import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Random;

public class Problema9 {
    public static void main(String[] args) {
        /*Problema 9.	Si se tiene una pila P1 que puede almacenar enteros, proponga un código (programa en java) de una función denominada
        Pares que utiliza las operaciones básicas de pilas y colas que realice lo siguiente:
            a.	Almacenar en P1 una cantidad aleatoria de enteros.
            b.	Mostrar por pantalla la cantidad de números que aleatoriamente se almacenarán (máximo 200)
            c.	Mostrar por pantalla el entero ingresado en P1.
            d.	Recorrer P1 y almacenar los pares de en una cola Q1 y los impares en una pila P2.
            e.	Imprimir la pila P2 y la cola Q1.
        */
        Random random = new Random();
        int rangoAleatorio = 200, numerosAleatorios ,cantidadAleatoria = random.nextInt(rangoAleatorio),contador = 1,numeroPop;
        Stack P1 = new Stack(),P2 = new Stack();
        Queue Q1 = new LinkedList();
        System.out.println("Se almacenaran: " + cantidadAleatoria + " numeros aleatorios.");
        while (cantidadAleatoria >= contador){ //Entrega los valores a P1
            numerosAleatorios = random.nextInt(rangoAleatorio);
            P1.push(numerosAleatorios);
            System.out.println("El numero " + contador +" ingresado en P1 es: " + numerosAleatorios);
            contador++;
        }
        System.out.println(P1);//Muestra P1 llena
        for (int i = 0; i < cantidadAleatoria; i++) { //recorremos P1 y decidimos si el numero es par o impar, luego lo asignamos a la variable correspondiente.
            numeroPop = (int) P1.pop();
            if(numeroPop % 2 == 0){
                Q1.add(numeroPop);
                if (numeroPop == 0){
                    P2.push(numeroPop);
                }
            } else {
                P2.push(numeroPop);
            }
        }
        System.out.println(P1);//muestra P1 vacia
        System.out.println(Q1);//muestra Q1
        System.out.println(P2);//muestra P2




    }
}
