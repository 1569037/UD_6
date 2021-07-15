/***
 * Version 1 del Ejercicio1
 * @author evelyn
 * Fecha 08/07/2021
 */
import javax.swing.JOptionPane;
import java.lang.Math;
public class Ejercicio1App {

	public static void main(String[] args) {
		
		//Pedimos que el usuario introduzca una figura
		
		String figura = JOptionPane.showInputDialog("Selecciona una figura entre las siguientes: circulo, triangulo y cuadrado."); 
		
		//segun la figura introducida ejecutamos unas instrucciones o otras
		
		switch (figura.toUpperCase())
		{
		case "CIRCULO": //si la figura es un circulo el usuario debe introducir su radio y nosotros mostrar su area calculada con el metodo circulo
			float radio = Float.parseFloat(JOptionPane.showInputDialog("Introduce el radio del circulo:"));
			JOptionPane.showMessageDialog(null, "El area del circulo es: "+circulo(radio));
			break;
		case "TRIANGULO": //si la figura es un triangulo el usuario debe introducir su base y altura y nosotros mostrar su area calculada con el metodo triangulo
			float base = Float.parseFloat(JOptionPane.showInputDialog("Introduce la base del triangulo"));
			float altura = Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura del triangulo"));
			JOptionPane.showMessageDialog(null, "El area del triangulo es: "+triangulo(base,altura));
			break;
		case "CUADRADO": //si la figura es un cuadrado el usuario debe introducir su lado y nosotros mostrar su area calculada con el metodo cuadrado
			float lado = Float.parseFloat(JOptionPane.showInputDialog("Introduce el lado del cuadrado"));
			JOptionPane.showMessageDialog(null, "El area del cuadrado es: "+cuadrado(lado));
			break;
		default: //si la figura introducida no es correcta informamos al usuario
			JOptionPane.showMessageDialog(null, "La figura introducida no es correcta");
			break;
		}

	}
	public static float circulo(float radio) //metodo que calcula el area del circulo a partir de su radio pasado por parametro
	{
		return (float)(Math.pow(radio, 2)*Math.PI);
	}
	public static float triangulo(float base, float altura) //metodo que calcula el area del triangulo a partir de su base y altura pasadas por parametro
	{
		return ((base*altura)/2);
	}
	public static float cuadrado(float lado) //metodo que calcula el area del cuadrado a partir de su lado pasado por paramtro
	{
		return (lado*lado);
	}

}
