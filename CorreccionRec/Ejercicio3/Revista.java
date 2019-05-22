package CorreccionRec.Ejercicio3;

/**
 *
 * @author Juan Luis Aranda
 */
class Revista {
  private int numero;
  
  public Revista (String codigoISBN, String titulo, int anoPublicacion, int numero) {
    super(codigoISBN, titulo, anoPublicacion);
    this.numero = numero;
  }

  @Override
  public String toString() {
    String salida = "REVISTA:\n";
    salida += super.toString();
    salida += "Número: " + this.numero + "\n";
    return salida;
  }
}
