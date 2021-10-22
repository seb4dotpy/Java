import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*Problema 10.	Proponga un código (programa en java) de una función denominada Compara que tenga como parámetros dos colas del mismo tipo y devuelva true si las dos colas son idénticas.*/
        Random random = new Random();
        int numerosAleatorios, rango = 100;
        Queue llenaCola1 = new LinkedList(), llenaCola2 = new LinkedList(); //llena los parametros para colas Q1 y Q2
        for (int i = 0; i < 10; i++) {
            numerosAleatorios = random.nextInt(rango);
            if (i < 5) {
                llenaCola1.add(numerosAleatorios);
            } else {
                llenaCola2.add(numerosAleatorios);
            }
        }
        Compara(llenaCola1, llenaCola2);
        System.out.println("La cola 1 es: " + llenaCola1);
        System.out.println("La cola 2 es: " + llenaCola2);
    }
    public static boolean Compara(Queue Q1, Queue Q2) { //verifica si Q1 == Q2 y regrsa True o False segun sea el caso
        if (Q1 == Q2) {
            return true;
        } else {
            System.out.println("Las colas no son iguales");
            return false;
        }
    }
}
