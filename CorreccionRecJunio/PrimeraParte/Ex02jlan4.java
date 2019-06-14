package examenrecu;

/**
 * Fecha: 12/06/2019 Ejercicio nº 1
 *
 * @author Juan Luis Aranda Navarro
 */
public class Ex02jlan4 {

  public static void main(String[] args) {
   int[][] array = new int[4][6];
   int fila;
   int columna;

   for (fila = 0; fila < 4; fila++) {
     for (columna = 0; columna < 6; columna++) {
       array[fila][columna] = (int) (Math.random() * 201);
       System.out.printf("%5d ", array[fila][columna]);
     }
     System.out.println("");
   }
   
   System.out.println(nEsimo(array, 4));
   System.out.println(nEsimo(array, 19));
   System.out.println(nEsimo(array, 22));
   System.out.println(nEsimo(array, 23));
   System.out.println(nEsimo(array, 15));
   
 }

 public static int nEsimo(int[][] n, int posicion) {
   int filas = n.length;
   int columnas = n[0].length;

   if ((posicion < 0) || (posicion > filas * columnas - 1)) {
     return -1;
   } else {
     int contador = 0;
     int numero = 0;
     for (int i = 0; i < filas; i++) {
       for (int j = 0; j < columnas; j++) {
         if (contador == posicion) {
           numero = n[i][j];
         }
         contador++;
       }
     }
     return numero;

   }


 }

}
