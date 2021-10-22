import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Problema8 {
    public static void main(String[] args) {
        /*Problema 8.	Proponga un código (programa en java) de una función denominada Absolutos en el que se manejen un total de 5 pilas: P1, P2, P3, P4 y P5.
        La entrada de datos serán pares de enteros (i,j). De tal forma que el criterio de selección de pila será:
        a.	Los datos de entrada se introducen por teclado.
        b.	Si i es positivo, debe insertarse el elemento i en la pila P1 y j en la pila P2.
        c.	Si i es negativo, debe insertarse el elemento i de la pila P3 y j en la pila P4.
        d.	En la pila P5 se ingresa abs(i) + abs(j). Es decir, la suma de los números absolutos de ambos.
        e.	Si i es cero, fin del proceso de entrada.
        f.	Cuando termina el proceso el programa debe escribir el contenido de la 5 Pilas.
        */
        Stack P1 = new Stack(),P2 = new Stack(),P3 = new Stack(),P4 = new Stack(),P5 = new Stack();
        Scanner teclado = new Scanner(System.in);
        int numeroTeclado,rango1,rango2,suma = 0;
        System.out.println("Por favor ingrese el rango 1 para la matriz: ");
        rango1 = teclado.nextInt();
        System.out.println("Por favor ingrese el rango 2 para la matriz: ");
        rango2 = teclado.nextInt();
        int [] EnterosI = new int [rango1], EnterosJ = new int [rango2];
        for (int i = 0; i < EnterosI.length; i++) { //Crea i como EnterosI y suma sus valores en absoluto
            System.out.println("Por favor ingrese el valor " + i + "de la lista I: ");
            numeroTeclado = teclado.nextInt();
            EnterosI[i] = numeroTeclado;
            suma += Math.abs(EnterosI[i]);
        }
        for (int i = 0; i < EnterosJ.length; i++) {//Crea j como EnterosJ y suma sus valores en absoluto
            System.out.println("Por favor ingrese el valor " + i + "de la lista J: ");
            numeroTeclado = teclado.nextInt();
            EnterosJ[i] = numeroTeclado;
            suma += Math.abs(EnterosJ[i]);
        }
        for (int i = 0; i < EnterosI.length; i++) {//verifica el valor de i para enviarlos a las distintas pilas
            if (EnterosI[i] > 0) {
                P1.push(EnterosI[i]);
                P2.push(EnterosJ[i]);
            } else if (EnterosI[i] < 0){
                P3.push(EnterosI[i]);
                P4.push(EnterosJ[i]);
            } else {
                break;
            }
        }
        P5.push(suma);
        System.out.println(Arrays.toString(EnterosI) + Arrays.toString(EnterosJ));
        System.out.println("La pila P1 es: " + P1);
        System.out.println("La pila P2 es: " + P2);
        System.out.println("La pila P3 es: " + P3);
        System.out.println("La pila P4 es: " + P4);
        System.out.println("La pila P5 es: " + P5);

    }
}
