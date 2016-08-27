import javax.swing.JOptionPane;


public class Punto3c{
	
	
	public static void main(String[] args) {
	
		double ne = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero entero "));
		
		if(ne % 2 == 0) {
			JOptionPane.showMessageDialog(null, " El numero " + Math.round(ne) + " es par ");
		}else { 
			JOptionPane.showMessageDialog(null, " El numero " + Math.round(ne) + " no es par ");
		}	    	
	
	}
}
