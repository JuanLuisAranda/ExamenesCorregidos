package Ej03;

import java.text.DecimalFormat;

/**
 * Exámen del 2º Trimestre - 1er exámen
 *
 * @author Juan Luis Aranda
 */
public class Ej03 {

  public static void main(String[] args) {
    DecimalFormat formatoTotal = new DecimalFormat("0.00");
    
    Carrito miCarrito = new Carrito();
    miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 19.95, 2));
    miCarrito.agrega(new Elemento("Canon EOS 2000D", 449, 1));
    System.out.println(miCarrito);
    System.out.print("Hay " + miCarrito.numeroDeElementos());
    System.out.println(" productos en la cesta.");
    System.out.println("El total asciende a " + formatoTotal.format(miCarrito.importeTotal()) + " euros");
    System.out.println("\nContinúa la compra...\n");
    miCarrito.agrega(new Elemento("Samsung Galaxy Tab", 199, 3));
    miCarrito.agrega(new Elemento("Tarjeta SD 64Gb", 19.95, 1));
    System.out.println(miCarrito);
    System.out.print("Ahora hay " + miCarrito.numeroDeElementos());
    System.out.println(" productos en la cesta.");
    System.out.println("El total asciende a " + formatoTotal.format(miCarrito.importeTotal()) + " euros");
  }

}
