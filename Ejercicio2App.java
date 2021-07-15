/***
 * Version 1 del Ejercicio2
 * @author evelyn
 * Fecha 08/07/2021
 */
import javax.swing.JOptionPane;
import java.lang.Math;
public class Ejercicio2App {
	public static void main(String[] args) {
			int num = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numeros aleatorios quieres generar?")); //preguntamos al usuario cuantos numeros desea generar
			int n1 = Integer.parseInt(JOptionPane.showInputDialog("Numero minimo que puede generarse?")); //Preguntamos al usuario el numero minimo que se puede generar
			int n2 = Integer.parseInt(JOptionPane.showInputDialog("Numero maximo que puede generarse?")); //Preguntamos al usuario el numero maximo que se puede generar
			
			//Mostramos por pantalla tantos numeros aleatorios como se han solicitado, entre el intervalo indicado, gracias al metodo "aletorio"
			
			for (int i=0; i<num; i++) 
			{
				JOptionPane.showMessageDialog(null,aleatorio(n1,n2)); 
			}
	}
	
	//Metedo encargado de generar un numero aleatorio que se encuentre entre n1 y n2 ambos incluidos
	
	public static int aleatorio(int n1, int n2)
	{
		return (int) (Math.random()*(n2-n1+1)+n1);
	}
}
	