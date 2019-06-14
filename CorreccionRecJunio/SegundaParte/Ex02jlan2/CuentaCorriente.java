package Ex02jlan3;

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
  
  

  @Override
  public String toString() {
    return "Número de cta: " + numCuenta + " Saldo: " + (saldo-transferencia) + " €";
  }

  void ingreso(double ingreso) {
    saldo += ingreso;
  }
  
  public void setIngreso(double ingreso) {
     this.ingreso =+ this.saldo;
  }

  void cargo(double cargo) {
      saldo -= cargo;
    }  

  void transferencia(CuentaCorriente cuenta3, double transferencia) {
    this.transferencia = transferencia;
    double suma = (this.getTransferencia() + cuenta3.getSaldo());
    cuenta3.setSaldo(suma);
  }


  public double getTransferencia() {
    return transferencia;
  }
  
    

  
  
  
  
}
