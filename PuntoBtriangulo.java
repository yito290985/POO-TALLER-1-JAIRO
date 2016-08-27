
import javax.swing.JOptionPane;

public class PuntoBtriangulo {
	
	
	public static void main(String[] args) {
	
		double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del triangulo"));
	
		double area = base*altura/2;
	
		JOptionPane.showMessageDialog(null, "El area del triagulo es : " + "\n" + area);
	    JOptionPane.showMessageDialog(null, "\n" + "    *\n   * *\n  * * *\n * * * *\n* * * * *\n");
	
	
	}
}
