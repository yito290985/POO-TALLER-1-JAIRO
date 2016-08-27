
import javax.swing.JOptionPane;

public class PuntoC {
	
		public static void main(String[] args) {
			
			double pi = 3.14;
			double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
			double longitud = 2*pi*radio;
			
			JOptionPane.showMessageDialog(null, "La longitud del circulo es : " + "\n" + longitud);
		
		}
}
