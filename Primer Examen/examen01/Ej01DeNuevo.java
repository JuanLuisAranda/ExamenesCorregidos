package parte2;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Juan Luis Aranda Navarro
 */
public class Ej01DeNuevo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    HashMap<String, String> m = new HashMap<String, String>();
    
    //Se añade las capitales que ya sabe el programa
    m.put("Espana", "Madrid");
    m.put("Portugal", "Lisboa");
    m.put("Francia", "Paris");
    
    String indice;
    do {
      System.out.println("Escribe el nombre de un país y te diré su capital: ");
      indice = s.nextLine();
      
      if (indice.equals("salir")){
        
      } else if (m.containsKey(indice)) {
        System.out.println("La capital de " + indice + " es " + m.get(indice));
      } else {
        System.out.println("No conozco la respuesta ¿cuál es la capital de " + indice + "?");
        String pais = s.nextLine();
        m.put(indice, pais);
        System.out.println("Gracias por enseñarme nuevas capitales.");
      }
    } while (!indice.equals("salir"));
            
  }
  
}
