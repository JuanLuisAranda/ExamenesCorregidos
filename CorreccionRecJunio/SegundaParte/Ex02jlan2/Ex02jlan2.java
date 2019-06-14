package Ex02jlan3;

/**
 * Fecha: 13/06/2019 Ejercicio nº 3
 *
 * @author Juan Luis Aranda Navarro
 */
public class Ex02jlan2 {

  public static void main(String[] args) {
    CuentaCorriente cuenta1 = new CuentaCorriente();
    CuentaCorriente cuenta2 = new CuentaCorriente(1500);
    CuentaCorriente cuenta3 = new CuentaCorriente(6000);
    System.out.println(cuenta1);
    System.out.println(cuenta2);
    System.out.println(cuenta3);
    cuenta1.ingreso(2000);
    cuenta2.cargo(600);
    cuenta3.ingreso(75);
    cuenta1.cargo(55);
    cuenta2.transferencia(cuenta3, 100);
    System.out.println(cuenta1);
    System.out.println(cuenta2);
    System.out.println(cuenta3);
  }

}
