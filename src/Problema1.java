import java.util.Arrays;
import java.util.Random;

public class Problema1 {
    public static void main(String[] args) {
        // Problema 1.	Se requiere almacenar temporalmente en un arreglo unidimensional de tamaño 100, letras mayúsculas del alfabeto español.
        // Proponga una estructura de almacenamiento y un código (programa en java) que realice:
        // a.	Generar aleatoriamente los caracteres.
        // b.	Contar y mostrar el número de consonantes ingresadas a lista.
        // c.	Contar y mostrar la cantidad de letras posteriores al carácter “M”.
        // d.	Imprimir la lista generada.
        Random random = new Random();

        String[] arregloUnidimensional = new String[100];
        String caracteres = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ"; //Caracteres para generar aleatoriamente
        String[] vocales = new String[] {"A", "E", "I", "O", "U"};
        int contador = 0; //cuenta las consonantes
        for(int i = 0; i < arregloUnidimensional.length; i ++ ){ //Se usa para asignar caracteres aleatorios a arregloUnidimensional[]
            int enteroAleatorio = random.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(enteroAleatorio); //enteroAleatorio y caracterAleatorio permiten buscar un caracter aleatorio desde caracteres[]
            arregloUnidimensional[i] = String.valueOf(caracterAleatorio);
            }
        System.out.println(Arrays.toString(arregloUnidimensional));
        for (String s : arregloUnidimensional) { //compara las vocales y las cuenta en la variable contador, se hace con vocales para ahorrar lineas de codigo.
            for (int j = 0; j < vocales.length; j++) {
                if (j == 0) {
                    if (s.equals(vocales[j])) {
                        contador++;
                    }
                } else if (j == 1) {
                    if (s.equals(vocales[j])) {
                        contador++;
                    }
                } else if (j == 2) {
                    if (s.equals(vocales[j])) {
                        contador++;
                    }
                } else if (j == 3) {
                    if (s.equals(vocales[j])) {
                        contador++;
                    }
                } else {
                    if (s.equals(vocales[j])) {
                        contador++;
                    }
                }
            }
        }
        contador = 100-contador; //al ser un arreglo de tamano 100, simplemente se restan las vocales al arreglo y se introducen nuevamente en la variable contador.
        System.out.println("El arreglo tiene "+ contador + " consonantes");

    }
}



