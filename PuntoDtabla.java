

import javax.swing.JOptionPane;

public class PuntoDtabla{
	
	
	public static void main(String[] args) {
		
		
		double n = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Numero a multiplicar"));
		
	
		JOptionPane.showMessageDialog(null, "La tabla del multilplicar del numero " + Math.round(n) + " es :");
		
		for(int c = 1; c <= 10; c++) {
		   double  r = n*c;
			JOptionPane.showMessageDialog(null,  Math.round(n) + " x " + Math.round(c) + " = " + Math.round(r));
		}
	    
	 
	}
}


