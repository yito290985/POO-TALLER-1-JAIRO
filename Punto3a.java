import javax.swing.JOptionPane;


public class Punto3a{
	
	
	public static void main(String[] args) {
	
		double n = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero "));
		
		if(n < 0) {
			JOptionPane.showMessageDialog(null, " El numero " + Math.round(n) + " negativo: ");
		}else { 
			JOptionPane.showMessageDialog(null, " El numero " + Math.round(n) + " es positivo: ");
		}	    	
	
	}
}

