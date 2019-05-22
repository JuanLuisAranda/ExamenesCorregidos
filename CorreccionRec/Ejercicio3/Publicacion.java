package CorreccionRec.Ejercicio3;

/**
 *
 * @author Juan Luis Aranda
 */
public class Publicacion {
  private String codigoISBN;
  private String titulo;
  private int anoPublicacion;

  public Publicacion(String codigoISBN, String titulo, int anoPublicacion) {
    this.codigoISBN = codigoISBN;
    this.titulo = titulo;
    this.anoPublicacion = anoPublicacion;
  }

  public String toString() {
    String salida = "";
    salida += "Código: " + this.codigoISBN + "\n";
    salida += "Título: " + this.titulo + "\n";
    salida += "Año de publicación: " + this.anoPublicacion + "\n";
    return salida;
  }

  public String getCodigoISBN() {
    return codigoISBN;
  }

  public int getAnoPublicacion () {
    return this.anoPublicacion;
  }
}
