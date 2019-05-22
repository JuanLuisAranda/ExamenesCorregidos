package CorreccionRec.Ejercicio3;

/**
 *
 * @author Juan Luis Aranda Navarro
 */
public interface Prestable {
  public void presta (); //fijará el atriburo prestado a true
  public void devuelve(); //fijará el atributo prestado a false
  public boolean estaPrestado(); //devolvera true si el objeto está prestado
  
}
