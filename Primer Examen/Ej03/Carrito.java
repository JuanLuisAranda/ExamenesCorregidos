package Ej03;

import java.util.ArrayList;

/**
 *
 * @author Juan Luis Aranda
 */
public class Carrito {

  ArrayList<Elemento> a = new ArrayList<>();

  public void agrega(Elemento e) {
    boolean encontrado = false;
    for (Elemento elemento : a) {

      if (elemento.getProducto().equals(e.getProducto())) {
        elemento.setCantidad(elemento.getCantidad() + 1);
        encontrado = true;
      }
    }
    if (!encontrado) {
      a.add(e);
    }
  }

  public int numeroDeElementos() {
    return a.size();
  }

  public double importeTotal() {
    double total = 0;
    for (Elemento e : a) {

      total += e.getPrecio() * e.getCantidad();

    }
    return total;
  }

  @Override
  public String toString() {
    String pinta = "";
    for (Elemento e : a) {
      pinta += e + "\n";
    }
    return pinta;
  }

}
