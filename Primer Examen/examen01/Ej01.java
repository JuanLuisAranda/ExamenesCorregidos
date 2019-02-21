package examen01;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Exámen del 2º Trimestre - 1er exámen
 *
 * @author Juan Luis Aranda
 */
public class Ej01 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    HashMap<String, String> m = new HashMap<String, String>();

    m.put("Espana", "Madrid");
    m.put("Portugal", "Lisboa");
    m.put("Francia", "Paris");

    String indice;
    do {
      System.out.println("Escribe el nombre de un país y te diré su capital: ");
      indice = sc.nextLine();

      if (indice.equals("salir")) {

      } else if (m.containsKey(indice)) {

        System.out.println("La capital de " + indice + " es: " + m.get(indice));
      } else {

        System.out.println("No conozco la respuesta ¿cuál es la capital de " + indice);
        String frase = sc.nextLine();

        m.put(indice, frase);

        System.out.println("Gracias por enseñarme nuevas capitales.");

      }
    } while (!indice.equals("salir"));

  }

}
