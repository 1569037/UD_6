/***
 * Version 1 del Ejercicio11
 * @author evelyn
 * Fecha 08/07/2021
 */
import java.lang.Math;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Ejercicio11App {

	public static void main(String[] args) {
		
		//introducir dimension del array por teclado
		
		int dim = Integer.parseInt(JOptionPane.showInputDialog("Introduce la dimension del array:"));
		//declarar array y rellenarla con el metodo ran
		int a[] = new int[dim];
		ran(a); 
		//declarar array y igualarla a la array anterior para posteriormete cambiar sus valores con el metodo ran
		int b[] = Arrays.copyOf(a,a.length);
		ran(b);
		//calcular la multiplicacion de las dos arrays con el metodo mul y mostrr las posiciones de los tres arrays con el metodo mostrar
		mostrar(a,b,mul(a,b));
		}
	public static int[] mul(int a[],int b[]) //metodo que calcula la multiplicacion de los dos arrays
	{
		int c[]= new int[a.length];
		for(int i=0; i<a.length;i++)
		{
			c[i]=a[i]*b[i];
		}
		return c;
	}
	public static void ran(int a[]) //metodo que rellena un array con numeros aleatorios
	{
		for (int i=0; i< a.length; i++)
		{
			a[i] = (int)(Math.random()*1000);
		}
	}
	public static void mostrar(int a[], int b[], int c[]) //metodo que muestra los 3 arrays
	{
		for (int i=0; i< a.length; i++)
			JOptionPane.showMessageDialog(null, "a["+(i+1)+"] = "+a[i]+" b["+(i+1)+"] = "+b[i]+", a["+(i+1)+"] * b["+(i+1)+"] = "+c[i]);
	}
}
