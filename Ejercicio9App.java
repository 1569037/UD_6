/***
 * Version 1 del Ejercicio9
 * @author evelyn
 * Fecha 08/07/2021
 */
import javax.swing.JOptionPane;
import java.lang.Math;
public class Ejercicio9App {

	public static void main(String[] args) {
		mostrar(rellenar(0,9)); //llamamos al metodo mostrar que a su vez llama al metodo rellanar pasado como parametro

	}
	public static int[] rellenar(int n1, int n2)
	{
		int len = Integer.parseInt(JOptionPane.showInputDialog("De que tamaño quieres que sea el array?")); //preguntamos al ususario el tamaño del array
		int a[]=new int[len]; //declaramos el array
		for (int i=0; i<a.length;i++)
		{
			a[i]=(int)(Math.random()*(n2-n1+1)+n1); //lo rellenamos con numeros aleatorios entre n1 y n2 ambos incluidos
			
		}
		return a;
	}
	public static void mostrar(int a[]) //mostramos los valores que contienen las diferentes posiciones y la suma entre ellos
	{
		int suma =0;
		for (int i=0; i<a.length;i++)
		{
			JOptionPane.showMessageDialog(null,"El valor que corresponde a la posicion "+(i+1)+" es "+a[i]);
			suma+=a[i];
		}
		JOptionPane.showMessageDialog(null,"La suma de los valores del array es: "+suma);
	}

}
