package ejercicios_clase;

import java.util.Random;
import java.util.Scanner;

public class JuegoPPT {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Random random = new Random();
		
		String[] opciones = {"piedra","papel","tijera"};
		
		System.out.println("Bienvenido a Piedra, Papel o Tijera");
		
		while(true) {
			System.out.print("Elige piedra, papel o tijera ( o escribe 'salir' para terminar): ");
			String eleccion = scanner.next().toLowerCase();
			
			if(eleccion.equals("salir")) {
				System.out.println("Gracias por jugar.¡Hasta la proxima!");
				break;
			}
			
			if(!eleccion.equals("piedra") && !eleccion.equals("papel") && !eleccion.equals("tijera")) {
				System.out.println("Entrada no valida. Intentalo de nuevo.");
				continue;
			}
			
			String ordenador = opciones[random.nextInt(3)];
			System.out.println("El ordenador eligio: "+ ordenador);
			
			if(eleccion.equals(ordenador)) {
				System.out.println("Es un empate!");
			}else if((eleccion.equals("piedra") && ordenador.equals("tijera")) ||
					(eleccion.equals("papel") && ordenador.equals("piedra")) ||
					(eleccion.equals("tijera") && ordenador.equals("papel"))) {
				System.out.println("¡Ganaste!");
				break;
			} else {
				System.out.println("Perdiste.¡Sigue intentandolo!");
				
			}			
		}
		
		scanner.close();
		
	}
	
}
