/***
 * Version 1 del Ejercicio3
 * @author evelyn
 * Fecha 08/07/2021
 */
import javax.swing.JOptionPane;
public class Ejercicio3App {

	public static void main(String[] args) {
		
		//Pedimo al usuario que introduzca un numero para comprovar si es primo
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entero para comprovar si es primo")); 
		
		//comprovamos si el numero es primo con el metodo "primo" y mostramos el resultado
		
		boolean primo = primo(numero); 
		if (primo)
			JOptionPane.showMessageDialog(null,"El numero introducido es primo.");
		else
			JOptionPane.showMessageDialog(null,"El numero introducido no es primo");
	}
	public static boolean primo(int n)
	{
		int i = 2; //i comienza en 2 porque si comprovamos desde 1 todos los numeros nos daran no primos
		while (i < n) //miramos el modulo de n entre i en el intervalo i a n-1
		{
			if ( n % i == 0) 
				return false;
			else 
				i++;
		}
		if (i==n || n==1) //si el numero es 1 o i a acabado de comprovar todos los casos y ningun modulo es 0 quiere decir que el numero es primo
			return true;
		else
			return false; //en caso contrario el numero no sera primo
	}
}
