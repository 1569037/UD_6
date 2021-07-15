/***
 * Version 1 del Ejercicio4
 * @author evelyn
 * Fecha 08/07/2021
 */
import javax.swing.JOptionPane;
public class Ejercicio4App {

	public static void main(String[] args) {
		
		//Pedimos al usuario que introduzca un numero para calcular su factorial
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para calcular su factorial."));
		
		//Mostramos el factorial del numero anterior utilizando el metodo factorial
		JOptionPane.showMessageDialog(null,"El factorial de "+num+" es "+factorial(num));
	}
	public static int factorial(int n)
	{
		int mul = 1; //utilizamos una variable acumulativa
		for(int i=n; i>0; i--) //hacemos un bucle que itera de n a 1
		{
			mul = mul * i; //calculamos el factorial de n
		}
		return mul;
	}

}
