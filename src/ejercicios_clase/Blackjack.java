package ejercicios_clase;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		Random random = new Random ();
		
		ArrayList <Integer> manoJugador = new ArrayList <>();
		ArrayList <Integer> manoCrupier = new ArrayList <>();
		
		// al iniciar el juego se le dan dos cartas a el jugador y al crupier
		
		manoJugador.add(pedirCarta(random));
		manoJugador.add(pedirCarta(random));
		manoCrupier.add(pedirCarta(random));
		manoCrupier.add(pedirCarta(random));
		
		System.out.println("¡Bienvenido al Blackjack!");
		
		boolean jugadorPierde = false;
		
		while (true) {
			System.out.println("Tu mano: " + manoJugador + " (Total: " + valorMano(manoJugador) + ")");
			
			if (valorMano(manoJugador) > 21) {
				System.out.println("Te has pasado de 21. ¡Perdiste!");
				jugadorPierde = true;
				break;
			}
			
			System.out.println("¿Quieres otra carta? (si/no): ");
			String elige = scanner.next();
			if(elige.equalsIgnoreCase("si")) {
				manoJugador.add(pedirCarta(random));
			}else {
				break;
			}
			
		}
		
		if(!jugadorPierde) {
			System.out.println("Mano del crupier: " + manoCrupier + "(Total: " + valorMano(manoCrupier) + ")");
			while(valorMano(manoCrupier) < 17) {
				manoCrupier.add(pedirCarta(random));
				System.out.println("El crupier toma una carta: " + manoCrupier + "(Total: " + valorMano(manoCrupier) + ")");
			}
			
			int totalDelJugador = valorMano(manoJugador);
			int totalDelCrupier = valorMano(manoCrupier);
			
			if(totalDelCrupier > 21 || totalDelJugador > totalDelCrupier) {
				System.out.println("¡Ganaste!");
			}else if (totalDelCrupier == totalDelJugador) {
				System.out.println("Empate.");
			}else {
				System.out.println("El crupier gana.");
			}
			
		}
		
		scanner.close();	
		
	}

	public static int pedirCarta(Random random) {
		return random.nextInt(11) + 1; // cartas del 1 al 11
	}
	
	public static int valorMano ( ArrayList<Integer> mano) {
		int total = 0;
		for ( int carta : mano) {
			total += carta;
		}
		return total;
	}
	
}
