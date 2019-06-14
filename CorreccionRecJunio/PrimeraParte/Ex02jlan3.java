package examenrecu;

/**
 * Fecha: 12/06/2019 Ejercicio nº 3
 *
 * @author Juan Luis Aranda Navarro
 */
public class Ex02jlan3 {

  public static void main(String[] args) {
    int[] array = {111, 222, 333, 444, 6, 8, 789, 9, 10, 456};
    

      System.out.println(aleatorioDeArray(array));
    

  }

  public static int aleatorioDeArray(int[] i) {
    int n = i[(int)(Math.random() * i.length)];
    return n;
  }
}
