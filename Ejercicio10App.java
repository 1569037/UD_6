/***
 * Version 1 del Ejercicio10
 * @author evelyn
 * Fecha 08/07/2021
 */
import javax.swing.JOptionPane;
import java.lang.Math;
public class Ejercicio10App {
	public static void main(String[] args) {
		int len = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del array")); //pedimos al usuario el tamaño del array
		mayor(array(len)); //mostramos al usuario el valor mayor de nuestro array
	}
	public static int[] array(int mida) //metodo que genera la array de numeros random primos
	{
		int a[]= new int[mida];
		int n1=Integer.parseInt(JOptionPane.showInputDialog("Primer valor del intervalo a generar?"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ultimo valor del intervalo a generar?"));
		for (int i=0; i<mida;i++)
		{
			a[i]=random(n1,n2); 
		}
		return a;
	}
	public static int random(int n1, int n2) //metodo que crea numeros random hasta devolver uno que sea primo
	{
		while(true)
		{
			int ran = (int)(Math.random()*(n2-n1+1)+n1);
			if (primo(ran))
				return ran;
		}
	}
	public static void mayor(int n1[]) //metodo que busca el numero mas alto del array y lo muestra
	{
		int mayor = n1[0];
		for (int i=0; i< n1.length; i++)
		{
			if (n1[i]>mayor)
				mayor=n1[i];
		}
		JOptionPane.showMessageDialog(null, "El numero mas grande del array, es "+mayor);
	}
	
	
	public static boolean primo(int n) //metodo reutilizado de ejercicios anteriores que comprueba si un numero es primo
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

