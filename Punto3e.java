import javax.swing.JOptionPane;


public class Punto3e{
	
	
	public static void main(String[] args) {
			
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer numero"));
		
		
		if(n1 > n2 && n2 > n3) {
			JOptionPane.showMessageDialog(null, "El maximo de los tres numeros es : " + Math.round(n1));
		}else if(n1 < n2 && n2 < n3){
			JOptionPane.showMessageDialog(null, "El maximo de los tres numeros es : " + Math.round(n2));
		}else {
			JOptionPane.showMessageDialog(null, "El maximo de los tres numeros es : " + Math.round(n3));
			}
		}
	}
