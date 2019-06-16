package Ej03nuevo;

import java.util.ArrayList;

/**
 *
 * @author Juan Luis Aranda Navarro
 */
public class CuentaCorriente {

  private String numCuenta = "";
  private double saldo;
  private ArrayList<String> movimientos = new ArrayList<String>();

  public CuentaCorriente() {
    for (int i = 0; i < 10; i++) {
      numCuenta += (int) (Math.random() * 10);
    }
  }

  public CuentaCorriente(double saldo) {
    this.saldo = saldo;
    for (int i = 0; i < 10; i++) {
      numCuenta += (int) (Math.random() * 10);
    }
  }

  public void ingreso(double cantidad) {
    saldo += cantidad;
    String movimiento = "Ingreso de " + cantidad + " € Saldo: " + saldo + " €";
    this.movimientos.add(movimiento);
  }

  public void cargo(double cantidad) {
    saldo -= cantidad;
    String movimiento = "Cargo de " + cantidad + " € Saldo: " + saldo + " €";
    this.movimientos.add(movimiento);
  }

  public void transferencia(CuentaCorriente cuenta, double cantidad) {
    this.saldo -= cantidad;
    cuenta.saldo += cantidad;
    String movimiento1 = "Transf. emitida de " + cantidad + " € a la cuenta " + cuenta.numCuenta + " Saldo: " + saldo + " €";
    String movimiento2 = "Transf. recibida de " + cantidad + " € de la cuenta " + numCuenta + " Saldo: " + cuenta.saldo + " €";
    this.movimientos.add(movimiento1);
    cuenta.movimientos.add(movimiento2);
  }

  public void movimientos() {
    System.out.println("Movimientos de la cuenta " + numCuenta);
    System.out.println("-----------------------------------");
    for (int i = 0; i < movimientos.size(); i++) {
      System.out.println(movimientos.get(i));
    }
  }

  @Override
  public String toString() {
    return "Numero de cta: " + numCuenta + " Saldo: " + saldo;
  }

}
