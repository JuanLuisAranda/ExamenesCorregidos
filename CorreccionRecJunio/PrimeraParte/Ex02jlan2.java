package examenrecu;

/**
 * Fecha: 12/06/2019
 * Ejercicio nº 2
 * 
 * @author Juan Luis Aranda Navarro
 */
public class Ex02jlan2 {
  public static void main(String[] args) {
    
    int[] array = new int[10];
    // Relleno el array
    for (int i = 0; i < 10; i++) {
      array[i] = (int) (Math.random() * 101);
    }
    for (int i = 0; i < 10; i++) {
      
      System.out.println(array[i]);
      
      if (Ex02jlan2.esPrimo(array[i]) && Ex02jlan2.esCapicua(array[i])) {
        System.out.println("El número es primo y es capicúa.");
      } else if (Ex02jlan2.esPrimo(array[i]) && !Ex02jlan2.esCapicua(array[i])) {
      System.out.println("El número es primo y NO es capicúa.");
    } else if ( !Ex02jlan2.esPrimo(array[i]) && Ex02jlan2.esCapicua(array[i])) {
      System.out.println("El número NO es primo y es capicúa.");
    } else if (!Ex02jlan2.esPrimo(array[i]) && !Ex02jlan2.esCapicua(array[i])) {
      
      System.out.println("El número NO es primo y NO es capicúa.");
    }
    }
  }
  
  /**
   * Funcion que invierte un número
   * 
   * @param n es númro entero
   * @return el número invertido
   */
  public static long voltea(long n) {
    long invertido = 0;
    while (n > 0) {
      invertido = (invertido * 10) + (n % 10);
      n /= 10;
    }
    return invertido;
  }
  
  /**
   * Función para averiguar si un número es primo
   * 
   * @param n es un número entero
   * @return devuelve verdadero si el número es primo o falso si no lo es
   */
  public static boolean esPrimo(long n) {
    for (int i = 2; i < n; i++) {
      if ((n % i) == 0) {
        return false;
      }
    }
    return true;
  }
  
  /**
   * Función para comprobar si un número es capicúa o no
   * 
   * @param n es un número entero
   * @return devuelve verdadero si el número es capicúa o falso si no lo es
   */
  public static boolean esCapicua(long n) {
    long invertido = voltea(n);
    return n == invertido;
  }
  
  /**
   * Función para sacar los números primos de un array
   * 
   * @param a es un array simple
   * @return un array simple con los 
   */
  public static int[] filtraPrimos(int[] a) {
    int j = 0;
    for (int i = 0; i < a.length; i++) {
      if (Ex02jlan2.esPrimo(a[i])) {
        j++;
      }
    }
    int[] primos = new int[j];
    j = 0;
    for (int i = 0; i < a.length; i++) {
      if (Ex02jlan2.esPrimo(a[i])) {
        primos[j] = a[i];
        j++;
      }
    }
    return primos;
  }
  
  /**
   * Función para sacar los números capicúa de un array
   * 
   * @param a es el array donde se buscarán números capicúa
   * @return un array de números con los capicua del array 'a'
   */
  public static int[] filtraCapicuas(int[] a) {
    int j = 0;
    for (int i = 0; i < a.length; i++) {
      if (Ex02jlan2.esCapicua(a[i])) {
        j++;
      }
    }
    int[] capicua = new int[j];
    j = 0;
    for (int i = 0; i < a.length; i++) {
      if (Ex02jlan2.esCapicua(a[i])) {
        capicua[j] = a[i];
        j++;
      }
    }
    return capicua;
  }
}
