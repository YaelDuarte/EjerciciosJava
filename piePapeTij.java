package Juego;

import java.util.Random;
import java.util.Scanner;

public class piePapeTij {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random maquina = new Random();
		
		//ARRAY DE OPCIONES
		String seleccion[] = {"PIEDRA","PAPEL","TIJERA"};
		
		System.out.println("***** JUEGO DE PIEDRA PAPEL O TIJERA *****");
		System.out.print("Ingresa tu selección: ");
		String jugador = teclado.next().toUpperCase();
		
		// SELECCION DE LA MAQUINA DE MANERA ALEATORIA DE LA ARRAY
		String eleccionMaquina = seleccion[maquina.nextInt(seleccion.length)];
		
		if(jugador.equals(eleccionMaquina)) {
			System.out.println("EMPATE");
		}
		else if (
				(jugador.equals("PIEDRA") && eleccionMaquina.equals("TIJERA")) ||
				(jugador.equals("PAPEL") && eleccionMaquina.equals("PIEDRA")) ||
				(jugador.equals("TIJERA") && eleccionMaquina.equals("PAPEL"))
				) {
			System.out.println("Maquina: "+ eleccionMaquina);
			System.out.println("Tu:" +jugador);
			System.out.println("GANASTE");
		}else {
			System.out.println("Maquina: "+ eleccionMaquina);
			System.out.println("Tu: "+jugador);
			System.out.println("PERDISTE");
		}
		
		teclado.close();
	}
}
