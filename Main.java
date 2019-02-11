package Condicionales;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	int band = 1;
	int numero, random=0;
	


	 do {	
		 
		 numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero "));

		 	
		    random += numero;
		 	
		 	if (numero == 0) {
				band = 0;
			}
				
				
		} while (band != 0);
		
		
		JOptionPane.showMessageDialog(null, "La suma total es " + random);
	}
}
