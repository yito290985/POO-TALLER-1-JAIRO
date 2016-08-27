import javax.swing.JOptionPane;


public class Punto3d1{
	
	
	public static void main(String[] args) {
		
		double r;
	
		double net = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero entero "));
		
		if(net % 2 == 0) {
			r = Math.pow(net, 2);
			JOptionPane.showMessageDialog(null, "El resultado de elevar " + net + " al cuadrado es: " + Math.round(r));
		}else { 
			r = Math.pow(net, 3);
			JOptionPane.showMessageDialog(null, "El resultado de elevar " + net + " al cubo es: " + Math.round(r));
		}	    	
	}
}
