package cuentabancaria;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Cuenta {

	//nuestras variables
	String titular;
	double saldo;
	
	private ArrayList<Cuenta> Banca;
	public Cuenta(){
		this.Banca=new ArrayList<Cuenta>();
	}
	
	//metodo constructor
	public Cuenta(String titular, double saldo) {
		this.titular=titular;
		this.saldo=saldo;
	}

	//getters y setters
	public String getTitular() {
		return titular;
	}
	
	public void setTitular (String titular) {
		this.titular=titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	
	//toString
	public String toString() {
		return "\n Saldo: " + this.saldo + "\n Titular: " + this.titular;	
	}
	
	
	public void añadirCuenta(Cuenta nuevaCuenta) {
		Banca.add(nuevaCuenta);
	}
	
	public void ingresarDinero(double cantidad) {
		for (int i=0;i<Banca.size();i++) {
				if(cantidad>=0){
					saldo=Banca.get(i).getSaldo()+cantidad;
					JOptionPane.showMessageDialog(null,"Ahora tienes: " + saldo + "€");
				}else if(cantidad<0) {
					JOptionPane.showMessageDialog(null,"Importe incorrecto");
				}
			}
	}
	
	public void sacarDinero(double cantidad) {
		for (int i=0;i<Banca.size();i++) {
					if(saldo>=0) {
						saldo=Banca.get(i).getSaldo()-cantidad;
						JOptionPane.showMessageDialog(null, "Te quedan: " + saldo + "€");
					}else if(saldo<0) {
						JOptionPane.showMessageDialog(null,"No hay suficiente dinero en la cuenta");
					}
			}
	}
	
	public void buscarCuenta(String nombre) {
		String titulares="";
		for (int i=0;i<Banca.size();i++) {
		if(Banca.get(i).getTitular().equalsIgnoreCase(nombre)) {
			titulares=titulares+Banca.get(i).getTitular()+"\n" + saldo;
			JOptionPane.showMessageDialog(null, "Los datos son: " + titulares);
		}else {
			JOptionPane.showMessageDialog(null,"No hay ninguna cuenta con ese titular");
		}
		}
	}
}
