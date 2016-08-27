import javax.swing.JOptionPane;


public class Punto3f{
	
	
	public static void main(String[] args) {
			
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer numero"));
		
		
		if(n1 > n2 && n2 > n3) {
			JOptionPane.showMessageDialog(null, "Numeros ordenados: " + n1 + ", " + n2 + ", " + n3); 
		}else if(n1 > n3 && n3 > n2){
			JOptionPane.showMessageDialog(null, "Numeros ordenados: " + n1 + ", " + n3 + ", " + n2);
		}else if(n1 < n2 && n1 > n3){
			JOptionPane.showMessageDialog(null, "Numeros ordenados: " + n2 + ", " + n1 + ", " + n3);
		}else if(n3 < n2 && n1 > n3){
			JOptionPane.showMessageDialog(null, "Numeros ordenados: " + n2 + ", " + n3 + ", " + n1);
		}else if(n1 < n2 && n2 > n3){
			JOptionPane.showMessageDialog(null, "Numeros ordenados: " + n3 + ", " + n2 + ", " + n1);
		}else if(n1 < n3 && n1 > n2){
			JOptionPane.showMessageDialog(null, "Numeros ordenados: " + n3 + ", " + n1 + ", " + n2);
			}
		}			
	}

	