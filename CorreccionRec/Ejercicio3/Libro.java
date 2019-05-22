package CorreccionRec.Ejercicio3;

/**
 *
 * @author Juan Luis Aranda
 */
public class Libro extends Publicacion implements Prestable{
  boolean prestado;
  
  public Libro (String codigoISBN, String titulo, int anoPublicacion) {
    super(codigoISBN,titulo,anoPublicacion);
    prestado = false;
  }

  @Override
  public String toString() {
    String salida = "LIBRO:\n";
    salida += super.toString();
    salida += "¿Prestado? -> ";
    if(this.prestado) {
      salida += "El libro está prestado";
    } else {
      salida += "El libro no está prestado";
      
    }
    salida += "\n";
    return salida;
  }
  
  @Override
  public void presta(){
    this.prestado = true;
  }
  
  @Override
  public void devuelve(){
    this.prestado = false;
  }
  
  @Override
  public boolean estaPrestado(){
    return this.prestado;
  }
