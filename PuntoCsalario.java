
import javax.swing.JOptionPane;

public class PuntoCsalario{
	
	
	public static void main(String[] args) {
	
		double hdiurnas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas diaurnas"));
		double hnocturnas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas nocturnas"));
		double hdominicales = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas dominicales"));
		double hfestivas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas festivas"));
	
		double tdiurnas = hdiurnas * 2500;
		double tnocturnas = (2500 * hnocturnas * 0.35) + 2500 * hnocturnas;
		double tdominicales = (2500 * hdominicales * 0.50) + 2500 * hdominicales;
		double tfestivas = (2500 * hfestivas * 0.75) + 2500 * hfestivas;
		double tsalario = tdiurnas + tnocturnas + tdominicales + tfestivas;
	
		JOptionPane.showMessageDialog(null, "Su salario con base en horas diurnas es de $" + Math.round(tdiurnas));
	    JOptionPane.showMessageDialog(null, "Su salario con base en horas nocturnas es de $" + Math.round(tnocturnas));
	    JOptionPane.showMessageDialog(null, "Su salario con base en horas dominicales es de $" + Math.round(tdominicales));
	    JOptionPane.showMessageDialog(null, "Su salario con base en horas festivos es de $" + Math.round(tfestivas));
	    JOptionPane.showMessageDialog(null, "Su salario total es de $" + Math.round(tsalario));
	
	
	}
}


//System.out.println("Su salario total es de $" + Math.round(totalSalario));