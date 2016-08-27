import javax.swing.JOptionPane;

public class PuntoEdolar{
	
	
	public static void main(String[] args) {
	
		double vdolar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del dolar "));
		double cdolar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dolares"));
	
		double tdolar = vdolar * cdolar;
		
		JOptionPane.showMessageDialog(null, " El total de dinero en dolares es de: " + Math.round(tdolar));
	    	
	
	}
}


