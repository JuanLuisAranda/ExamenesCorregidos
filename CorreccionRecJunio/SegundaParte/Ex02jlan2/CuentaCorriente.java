package Ej03;

import java.util.ArrayList;

/**
 *
 * @author Juan Luis Aranda Navarro
 */
class CuentaCorriente {

  ArrayList<CuentaCorriente> a = new ArrayList<>();

  private String numCuenta = "";
  private double saldo;
  private double ingreso;
  private double cargo;
  private double transferencia;

  CuentaCorriente() {
    for (int i = 0; i < 10; i++) {
      numCuenta += (int) (Math.random() * 10);
    }
  }
  CuentaCorriente(double saldo) {

    this.saldo = saldo;
    for (int i = 0; i < 10; i++) {
      numCuenta += (int) (Math.random() * 10);
    }
  }
  
  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  void ingreso(double ingreso) {
    this.ingreso = ingreso;
  }

  public void setIngreso(double ingreso) {
    this.ingreso = +this.saldo;
  }

  void cargo(double cargo) {
    this.cargo = cargo;
  }

  public void setCargo(double cargo) {
    this.cargo = +this.saldo;
  }

  void transferencia(CuentaCorriente cuenta3, double transferencia) {
    this.transferencia = transferencia;
  }

  public void setTransferencia(CuentaCorriente cuenta3, double transferencia) {
    this.transferencia = +this.transferencia;
    this.transferencia = -this.transferencia;
  }

  public double getTransferencia() {
    return transferencia;
  }
  void movimientos() {
      this.movimientos = movimientos;
      
    }

    @Override
    public String toString() {
      return "Movimientos de la cuenta " + numCuenta + "\n-----------------------------------";
    }


}
