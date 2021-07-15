/***
 * Version 1 del Ejercicio8
 * @author evelyn
 * Fecha 08/07/2021
 */
import javax.swing.JOptionPane;
public class Ejercicio8App {
	public static void main(String[] args) {
		mostrar(rellenar()); //llamamos al metodo mostrar que a su vez invoca al metodo rellenar pasado como parametro
	}
	public static int[] rellenar() //metrodo que rellena un array a partir de numeros introducidos por el usuario
	{
		int n[] = new int[10]; 
		for (int i=0; i < n.length; i++)
		{
			n[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion "+(i+1)+" del array"));
		}
		return n;
	}
	public static void mostrar(int n[]) //metrodo que muestra cada posicion de un array y su valor correspondiente
	{
		for (int i=0; i < n.length; i++)
		{
			JOptionPane.showMessageDialog(null, "La posicion "+(i+1)+" del array, contiene el numero "+n[i]);
		}
	}

}
