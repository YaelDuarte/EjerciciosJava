package practicaBorrador;

import java.util.Random;
import java.util.Scanner;

public class tirarDado {
	public static void main(String[] args) {
		Random tiro = new Random();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("---TIRO DE DADO,ADIVINA EL NUMERO---");
		System.out.print("Ingresa el numero que crees que saldra: ");
		int adivina = teclado.nextInt();
		
		if(adivina < 1 || adivina > 6) {
			System.out.println("Número inválido. Debe ser entre 1 y 6.");
			return;
		}
		
		int resultado = tiro.nextInt(6)+1;
		
		if(adivina == resultado) {
			System.out.println("ADIVINASTE GANASTE!!!!!");
			System.out.println("El numero del dado es: "+resultado);
		}
		else {
			System.out.println("PERDISTE,vuelve a intentar");
			System.out.println("El numero del dado es: "+resultado);
		}
	}
}
