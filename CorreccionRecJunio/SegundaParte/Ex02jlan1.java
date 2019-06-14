package parte2recu;

import java.util.HashMap;
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

    HashMap<String, String> m = new HashMap<String, String>();
    
    //Se añade los anfibios con su habitat que ya sabe el programa
    m.put("rana", "En los trópicos y cerca de las zonas húmedas y acuáticas");
    m.put("salamandra", "Ecosistemas húmedos.");
    m.put("sapo", "En cualquier sitio salvo el desierto y la Antártida.");
    m.put("triton", "América y África.");
    
    // Creamos otro para la alimentación de cada anfibio.
    
    HashMap<String, String> a = new HashMap<String, String>();
    
    a.put("rana", "Larvas e insectos.");
    a.put("salamandra", "Pequeños crustáceos e insectos.");
    a.put("sapo", "Insectos, lombrices y pequeños roedores.");
    a.put("triton", "Insectos");
    
    String indice;
    do {
      System.out.print("Introduzca el tipo de anfibio: ");
      indice = s.nextLine();
      
      if (!m.containsKey(indice)){
        System.out.println("Ese tipo de anfibio no existe");
      } else if (m.containsKey(indice)) {
        System.out.println("Habitat: " + m.get(indice));
        System.out.println("Alimentación: " + a.get(indice));
      } 
      
    } while (m.containsKey(indice));
    
  }
  
}
