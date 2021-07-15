/***
 * Version 1 del Ejercicio6
 * @author evelyn
 * Fecha 08/07/2021
 */
import javax.swing.JOptionPane;
public class Ejercicio6App {
	public static void main(String[] args)
	{
		//Pedimos al usuario que introduzca un numero entero positivo
		
		String n = JOptionPane.showInputDialog("Introduce un numero entero positivo."); 
		
		//si el numero introducido no cumple alguno de los requisitos anteriores informamos al usuario
		
		if (n.contains("-") || n.contains("."))
		{
			JOptionPane.showMessageDialog(null, "El numero introducido no esta en el formato correcto");
		}
		
		//en caso contrario pasamo el numero a formato int y mostramos sus cifras al usurio gracias al metodo "cifras"
		else {
		int num = Integer.parseInt(n);
		
		JOptionPane.showMessageDialog(null, "El numero "+num+" tiene "+cifras(num)+" cifras.");
		}
		
	}
	public static int cifras(int n) {
		int cifras = 0;
		//bucle que divide el numero entero positivo entre 10 y cuenta los numeros que quedan despues de la coma cada iteracion
		while(n>0)
		{
			n = n/10;
			cifras++;
		}
		return cifras;
	}
}
