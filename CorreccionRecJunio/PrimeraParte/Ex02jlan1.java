package examenrecu;

import java.util.Scanner;

/**
 * Fecha: 12/06/2019
 * Ejercicio nº 1
 * 
 * @author Juan Luis Aranda Navarro
 */
public class Ex02jlan1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int anchura = 6;
    int altura = 3;

    int opcion = 0;

    while (opcion != 4) {
      int alturaMin = 1;
      int wint = anchura - 1;
      int hint = altura - 1;

      for (int i = 1; i <= anchura; i++) {
        System.out.print("*");
      }
      System.out.println();

      while (alturaMin < hint) {
        System.out.print("*");
        for (int i = 1; i < wint; i++) {
          System.out.print(" ");
        }
        System.out.println("*");
        alturaMin++;
      }

      for (int i = 1; i <= anchura; i++) {
        System.out.print("*");
      }

      System.out.println();

      System.out.println("1.Agrandarlo");
      System.out.println("2.Achicarlo");
      System.out.println("3.Cambiar orientacion");
      System.out.println("4.Salir");
      System.out.print("Indique qué quiere hacer con el rectángulo: ");
      opcion = s.nextInt();

      switch (opcion) {
        case 1:
          anchura++;
          altura++;
          break;

        case 2:
          if ((anchura == 2) || (altura == 2)) {
            
          } else {
            anchura--;
            altura--;
          }
          break;
        case 3:
          if (anchura > altura) {
          anchura = anchura - 3;
          altura = altura + 3;
          } else {
            anchura = anchura + 3;
            altura = altura - 3;
          }
          break;
      }

    }
  }
  
}
