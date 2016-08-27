
import javax.swing.JOptionPane;

public class PuntoA {
	
		public static void main(String[] args) {
			
			double pi = 3.14;
			double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
			double area = pi*Math.pow(radio, 2);
			
			JOptionPane.showMessageDialog(null, "El area del circulo es : " + "\n" + area);
		
		}
}
