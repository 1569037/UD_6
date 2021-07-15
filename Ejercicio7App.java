/***
 * Version 1 del Ejercicio7
 * @author evelyn
 * Fecha 08/07/2021
 */
import javax.swing.JOptionPane;
public class Ejercicio7App {

	public static void main(String[] args) {
		
		//pedimos al usuario que introduzca cantidad de euros y moneda a la que esta interesado en cambiar
		
		double euros = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de euros a cambiar"));
		String d = JOptionPane.showInputDialog("Introduce la divisa a la que te interesa convertir la cantidad anterior");
		
		//le mostramos el resultado gracias al metodo divisa
		
		divisa(euros,d);

	}
	public static void divisa(double euros, String moneda )
	{
		final double LIBRA = 0.86;
		final double DOLAR = 1.28611;
		final double YEN = 129.852;
		
		//calculamos el valor segun la moneda seleccionada
		switch (moneda.toUpperCase())
		{
		case "LIBRAS":
			JOptionPane.showMessageDialog(null, euros+ " euros son "+(euros*LIBRA)+" libras");
			break;
		case "DOLARES":
			JOptionPane.showMessageDialog(null, euros+ " euros son "+(euros*DOLAR)+" dolares");
			break;
		case "YENES":
			JOptionPane.showMessageDialog(null, euros+ " euros son "+(euros*YEN)+" yenes");
			break;
		default:
			JOptionPane.showMessageDialog(null, "El sistema no reconoce la divisa indicada");
			break;
		}
		
	}

}
