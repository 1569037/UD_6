/***
 * Version 1 del Ejercicio5
 * @author evelyn
 * Fecha 08/07/2021
 */
import javax.swing.JOptionPane;
public class Ejercicio5App {
	public static void main(String[] args) {
		
		//Pedimos al usuario que introduzca el numero que desea pasar a binario
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para pasarlo a binario"));
		
		//Le mostramos al usuario el numero anterior en formato binario gracias al metodo "binario"
		
		JOptionPane.showMessageDialog(null,"El numero binario que corresponde a "+num+" es "+binario(num));
	}
	public static String binario(int n) {
		String binari = ""; //inicializamos un string vacio que rellenaremos con 1 y 0 segun corresponda
		if (n==0)
			return "0"; //si el numero introducido es un 0 no hace falta calcular nada podemos asumir que el binario sera 0
		while (n>0)
		{
			binari = binari+Integer.toString(n%2); //en cada iteracion añadimos un 1 o un 0 al string que representa el binario
			n = n/2;
		}
		StringBuilder dest = new StringBuilder(binari); //creamos un objeto stringbuilder para poder usar su metodo reverse y darle la vuelta a nuestra cadena
		return dest.reverse().toString(); //damos la vuelta a la cadena y volvemos a convertir el objeto a string para devolverlo
	}
}
