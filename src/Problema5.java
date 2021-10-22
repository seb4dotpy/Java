import java.util.Arrays;
public class Problema5 {
    public static void main(String[] args) {
        /*Proponga un código (programa en java) de una función denominada Mezcla2 que tenga como parámetros dos listas de enteros ordenados de menor a mayor
        y que devuelva una nueva lista como unión de ambas con sus elementos ordenados de la misma forma (menor a mayor).*/

        int [] lista1 = new int [] {1, 2, 3, 4}; //utilizamos 2 cadenas asignadas manualmente
        int [] lista2 = new int[] {5, 6, 7, 8};
        System.out.println(Arrays.toString(lista1)); //impirme las cadenas para confirmar que estan bien
        System.out.println(Arrays.toString(lista2));
        Mezcla2(lista1,lista2);//llamamos a la funcion y le entregamos los parametros
    }
    public static void Mezcla2 (int [] l1, int [] l2){ //funcion que junta ambas cadenas de caracteres en una funcion void
        int lenL1 = l1.length,lenL2 = l2.length;
        int [] listasUnidas = new int [lenL1 + lenL2];
        System.arraycopy(l1,0,listasUnidas,0,lenL1);System.arraycopy(l2,0,listasUnidas,lenL1,lenL2); //este método toma los valores de los arrays y los fusiona en uno. El siguiente ejemplo muestra cómo se puede hacer esto para matrices de números enteros.
        System.out.println("Los arreglos concatenados son: " + Arrays.toString(listasUnidas)); //imprimimos las cadenas concatenadas de menor a mayor.
    }
}
