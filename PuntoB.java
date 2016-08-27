
import javax.swing.JOptionPane;

public class PuntoB {
	
		public static void main(String[] args) {
			
			double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
			double diametro = 2*radio;
			
			JOptionPane.showMessageDialog(null, "El perimetro del circulo es : " + "\n" + diametro);
		
		}
}