import java.util.Arrays;

public class Problema4 {
    public static void main(String[] args) {
        /*
         Proponga un código (programa en java) de una función denominada Reemplazar que tenga como argumentos lo siguiente: una lista con tipo de elemento int y dos valores int: nuevo y viejo.
         Dicha subrutina debe distinguir si el segundo valor (viejo) aparece en algún lugar de la lista, y si es así debe ser reemplazado por el primero (nuevo).
        */
        int nuevo = 10, viejo = 11; //se asignan arbitrariamente los valores nuevo y viejoi
        int[] element = new int[1];
        element[0] = viejo; //se asigna el valor viejo a element[]
        Reemplazar(element,viejo,nuevo); //llamada y paramentros de la funcion reemplazar
    }
    public static void Reemplazar (int [] elemento, int valor1,int valor2){ //funcion reemplazar evalua si el numero viejo es igual se reemplazara por el nuevo
        if(elemento[0] == valor2){
            elemento[0] = valor2;
            System.out.println(Arrays.toString(elemento));
        } else {
            elemento[0] = valor1;
            System.out.println(Arrays.toString(elemento));
        }
    }
}
