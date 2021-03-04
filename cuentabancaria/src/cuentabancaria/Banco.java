package cuentabancaria;

import javax.swing.JOptionPane;

public class Banco {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Cuenta Banca=new Cuenta();
		
		JOptionPane.showMessageDialog(null,"Bienvenido a la nueva app de banco");
		
		boolean salir=false;
		int menu=1;
		String titular = null;
		Double saldo = null;
		Object[] botones= {"Añadir cuenta bancaria","Ingresar Dinero","Sacar dinero","Buscar datos","Salir"};		
		
		while(!salir) {
			menu=JOptionPane.showOptionDialog(null, "Elige una opción", "Opciones", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE , null , botones, botones[0]);
		
			switch(menu) {
			case 0:
				
				JOptionPane.showMessageDialog(null,"Genial,comencemos a añadir la cuenta");
				
				String pedir=JOptionPane.showInputDialog(null, "Introduceme el titular de la cuenta");
				titular=String.valueOf(pedir);
				
				pedir=JOptionPane.showInputDialog(null, "Genial una vez introducido el titular introduce tu saldo");
				saldo=Double.parseDouble(pedir);
				
				Cuenta nuevaCuenta=new Cuenta(titular,saldo);
				Banca.añadirCuenta(nuevaCuenta);
				
				break;
				
			case 1:
				
				JOptionPane.showMessageDialog(null, "Has elegido la opcion de ingresar dinero");
			 	pedir=JOptionPane.showInputDialog(null, "Introduceme la cantidad");
				int cantidad=Integer.parseInt(pedir);
				
				Banca.ingresarDinero(cantidad);
				break;
				
			case 2:
				
				JOptionPane.showMessageDialog(null, "Has elegido la opcion de sacar dinero");
				
				pedir=JOptionPane.showInputDialog(null, "Introduceme la cantidad");
				cantidad=Integer.parseInt(pedir);
				
				Banca.sacarDinero(cantidad);
				break;
				
			case 3:
				
				JOptionPane.showMessageDialog(null, "Has elegido mostrar los datos");
				pedir=JOptionPane.showInputDialog(null, "Introduceme tu nombre");
				String nombre=String.valueOf(pedir);
				
				Banca.buscarCuenta(nombre);
				break;
			
			case 4:
				salir=true;
				JOptionPane.showMessageDialog(null,"Gracias por utilizar la nueva biblioteca que tengas buen dia");
				break;
			}
		}
	}

}
