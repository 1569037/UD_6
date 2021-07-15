import javax.swing.JOptionPane;
/***
 * Version 1 del Ejercicio12
 * @author evelyn
 * Fecha 08/07/2021
 */
public class Ejercicio12App {

	public static void main(String[] args) {
		
		int dim = Integer.parseInt(JOptionPane.showInputDialog("Introduce la dimension del array:")); //pedimos una dimension por teclado
		int a[] = new int[dim]; //declaramos un array
		ran(a); //lo rellenamos con el metodo ran
		mostrar(a,num()); //pedimos un numero al usuario con el metodo num y le mostramos los valores del array que acaban con ese numero
	}
	public static void ran(int a[]) //metodo que rellena un array con numeros aleatorios
	{
		for (int i=0; i< a.length; i++)
		{
			a[i] = (int)(Math.random()*300);
		}
	}
	public static void mostrar(int a[], int n) //metodo que muestra los valores de un array que contienen como ultimo digito el numero pasado por parametro
	{
		boolean encontrado = false;
		for (int i=0; i<a.length;i++)
			if(a[i]%10 == n) {
				JOptionPane.showMessageDialog(null, a[i]);
				encontrado=true;
			}
		if (!encontrado) //si ningun valor tiene ese numero como ultimo digito informamos al usuario
			JOptionPane.showMessageDialog(null, "No hay ningun numero acabado en ese digito");
	}
	public static int num() //metodo que pide un numero por pantalla y comprueba que cumple los requisitos
	{
		int a;
		String c = JOptionPane.showInputDialog("Introduce un numero de un solo digito");
		if(Character.isDigit(c.charAt(0))) //miramos si lo introducido es un numero y si no es negativo
		{
			a = Integer.parseInt(c);
			if(a>=10) { //miramos si el usuario a introducido un solo digito y en caso contrario le informamos
				JOptionPane.showMessageDialog(null, "Introduce un solo digito");
				return -1;
			}
			else
				return a; //si todo es correcto devolvemos a
		}
		else {
			JOptionPane.showMessageDialog(null, "El numero introducido no es correcto"); //caso contrario informamos al usuario
			return -1;	
		}
	}
	

}
