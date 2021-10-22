import java.util.Arrays;
import java.util.Random;
public class Problema3 {
    public static void main(String[] args) {
            /*
            Problema 3.	Proponga una estructura de almacenamiento y un código (programa en java) que utilice dos arreglos de tipo entero de 10 elementos a fin de realizar lo siguiente:
            a.	Ingrese enteros distintos a cero generados aleatoriamente en un arreglo V1.
            b.	Traspase al segundo arreglo V2 solo los números pares y luego calcule e imprima su promedio.
            c.	Imprima V1 y V2.
            */
        int[] arregloV1 = new int[10], arregloV2 = new int[10];
        Random random = new Random();
        int rangoAleatorio = 100, numeroAleatorio,contador = 0;
        float promedioV2 = 0;
        for (int i = 0; i < arregloV1.length; i++) { //asigna a arregloV1 los numeros generados aleatoriamente y si el numero es par lo asigna a arregloV2
            numeroAleatorio = random.nextInt(random.nextInt(rangoAleatorio));
            if (numeroAleatorio > 0) {
                arregloV1[i] = numeroAleatorio;
                if (numeroAleatorio % 2 == 0) {
                    arregloV2[i] = numeroAleatorio;
                }
            } else {
                i--;//en caso de que el numero generado sea 0, se reduce i para que el ciclo llene arregloV1 completo
            }
        }
        System.out.println(Arrays.toString(arregloV1));//imprime arregloV1
        System.out.println(Arrays.toString(arregloV2));//imprime arregloV2
        for (int j : arregloV2) {//verifica si el valor en arregloV2 es != y si es asi lo suma, luego aumenta en 1 el contador para hacer el calculo del promedio
            if (j > 0) {
                promedioV2 += j;
                contador++;
            }
        }
        promedioV2 = promedioV2/contador;//la suma de los valores =! 0 en arregloV2 y luego los divide en contador, que valida la cantidad de numeros distintos a 0
        System.out.println(promedioV2);


    }
}