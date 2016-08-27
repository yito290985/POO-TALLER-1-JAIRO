import javax.swing.JOptionPane;


public class Punto3b{
	
	public static void main(String[] args) {
		
		double p = 0 ;
	
		double v = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero "));
		
		for(double i = 1; i < v; i++) {
			if(v % i == 0) {
				p++;
			}
		}
		if(p >= 2) {
			JOptionPane.showMessageDialog(null, " El numero " + v + " no es primo ");
		}else { 
			JOptionPane.showMessageDialog(null, " El numero " + v + " es primo ");
		}	    	
	}	
}

	
	