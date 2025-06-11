package practicaBorrador;
import java.util.Scanner;

public class conversorDivPes {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int Seleccion;
		double KG;
		double Libra = 0.45;
		double pesos;
		final double dolar = 0.052;
		
		do {
			System.out.println("----Ingresa la conversion que deseas realizar----");
			System.out.println("1.Libras a KG\n2.KG a Libras\n3.Peso a Dolar\n4.Salir");
			Seleccion = teclado.nextInt();
			
			switch(Seleccion) {
			case 1:
				System.out.print("Ingresa las libras: ");
				KG = teclado.nextDouble();
				KG*=Libra;
				System.out.println("Los kilos: "+ KG);
				break;
			case 2:
				System.out.print("Ingrese los Kilos: ");
				KG = teclado.nextDouble();
				KG*=2.20;
				System.out.println("Las libras son: "+KG);
				break;
			case 3:
				System.out.println("Ingrea el monto de pesos: "+"$");
				pesos = teclado.nextDouble();
				pesos *= dolar;
				System.out.println("El total de dolares es: "+"$"+pesos);
				break;
			}
		}while(Seleccion != 4);
	}
}
