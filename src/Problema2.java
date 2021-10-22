
/* Problema 2.	Se requiere almacenar temporalmente en una matriz de 25 filas por 4 columnas información de un curso,
 donde cada fila representa la nota de un alumno (de la forma entero, por ejemplo 65, 43, 70),
 y cada columna las 4 notas del semestre.  Proponga una estructura de almacenamiento y un código (programa en java) que realice lo siguiente:
a.	Ingresar las notas de los alumnos en cada fila. (Generar en forma aleatoria desde 10 a 70).
b.	Calcular el promedio de notas por filas e ingresarlos en un vector temporal V1.
c.	Imprimir V1.
d.	Calcular el promedio de notas por columnas e ingresarlos en un vector temporal V2.
e.	Imprimir V2.
f.	Calcular e imprimir el promedio general de la matriz.*/

//import java.util.Arrays;
import java.util.Random;
public class Problema2 {
    public static void main(String[] args){
        int[][] matrix = new int[25][4];
        int[] promedioAlumnos = new int[25],promedioCurso = new int[1];
        int [] promedioColumnas = new int [4];
        int notasAlumnos = 70; // elige un numero aleatorio entre 0 a 70, o sea las notas en enteros.
        int  notaAleatoria,notaCurso = 0,promedio = 0,columna1 = 0,columna2 = 0,columna3 = 0,columna4 = 0,promColumnas=0;
        Random random = new Random();
        for(int i = 0; i < matrix.length; i ++ ){ //ciclo inicial para llenar la matriz matrix[25][4]
            for(int j = 0; j < matrix[i].length; j++){
                notaAleatoria = random.nextInt(notasAlumnos);
                if(notaAleatoria < 10){ // cuando la nota es menor a 10, significa que es una nota inferior a 1.0, por ende no sirve para el promedio, asi qeu simplemente le asigno la nota minima que es 10.
                    notaAleatoria = 10;
                }
                matrix[i][j] = notaAleatoria; //notas del alumno
                promedio += notaAleatoria;//acumula las notas del alumno
                notaCurso += notaAleatoria; //acumula las notas de todos los alumnos
            }
            promedio /= 4;
            promedioAlumnos[i] = promedio; //promedio del alumno, V1 Filas 25
            promedio = 0;
        }
        notaCurso = notaCurso / 100;//promedio final del curso
        promedioCurso[0] = notaCurso;//promedio final del curso
        for(int i = 0; i < matrix.length; i ++){ //Imprime las notas y promedio de los alumnos
            for(int j = 0; j < matrix[i].length; j ++){
                System.out.println("Las notas del alumno: "+ i + " son: " + matrix[i][j]);
            }
            System.out.println("El promedio del alumno: " + i + " es: " + (float) promedioAlumnos[i]); //imprime v1
        }
        System.out.println("El promedio del curso fue: " + promedioCurso[0]);//imprime el promedio general de la matriz
        if (notaCurso >= 40) { // Verifica si el curso aprobo
            System.out.println("Felicidades tu curso tiene promedio superior a 40");
        } else {
            System.out.println("Tabajen mas duro, su promedio como curso fue inferior a 40");
        }
        for (int[] ints : matrix) { //Hace los calculos para el vector columas o V2
            for (int j = 0; j < matrix[j].length; j++) {
                if (j == 0) {
                    columna1 += ints[j];
                } else if (j == 1) {
                    columna2 += ints[j];
                } else if (j == 2) {
                    columna3 += ints[j];
                } else {
                    columna4 += ints[j];
                }
            }
        }
        columna1 /= 25;columna2 /= 25;columna3 /= 25;columna4 /= 25;//division de los promedios en V2
        for (int i = 0; i < promedioColumnas.length; i++) { //Asigna los valores de los promedios de las columnas al vector V2
            if(i == 0){
                promedioColumnas[i] = columna1;
            } else if (i == 1){
                promedioColumnas[i] = columna2;
            } else if (i == 2){
                promedioColumnas[i] = columna3;
            } else{
                promedioColumnas[i] = columna4;
            }
            System.out.println("El promedio de la columna " + i + " es: " + (float) promedioColumnas[i]); //Imprime los promedios de las columnas
        }
        for (int promedioColumna : promedioColumnas) { //calcula el promedio entre todas las columnas y las asigna al vector v2
            promColumnas += promedioColumna;
        }
        System.out.println("El promedio entre las columnas es: " + (float) promColumnas/4);
    }

}






