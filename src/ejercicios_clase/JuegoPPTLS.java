package ejercicios_clase;

import java.util.Random;
import java.util.Scanner;

public class JuegoPPTLS {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String [] opciones = {"piedra","papel","tijera","lagarto","spock"};
		System.out.println("Bienvenido a piedra, papel, tijera, lagarto, spock");
		
		while(true) {
			System.out.print("Elige piedra, papel, tijera, lagarto o spock ( o escribe 'salir' para terminar): ");
			String eleccion = scanner.next().toLowerCase();
			
			if(eleccion.equals("salir")) {
				System.out.println("Gracias por jugar.¡Hasta la proxima!");
				break;
			}
			
			if(!eleccion.equals("piedra") && !eleccion.equals("papel") && !eleccion.equals("tijera") && !eleccion.equals("lagarto") && !eleccion.equals("spock")) {
				System.out.println("Entrada no valida. Intentalo de nuevo.");
				continue;
			}
			
			String ordenador = opciones[random.nextInt(3)];
			System.out.println("El ordenador eligio: "+ ordenador);
			
			if(eleccion.equals(ordenador)) {
				System.out.println("Es un empate!");
			}else if((eleccion.equals("piedra") && ordenador.equals("tijera")) ||
					(eleccion.equals("piedra") && ordenador.equals("lagarto")) ||
					(eleccion.equals("papel") && ordenador.equals("piedra")) ||
					(eleccion.equals("papel") && ordenador.equals("spock")) ||
					(eleccion.equals("tijera") && ordenador.equals("lagarto")) ||
					(eleccion.equals("tijera") && ordenador.equals("papel")) ||
					(eleccion.equals("lagarto") && ordenador.equals("papel")) ||
					(eleccion.equals("lagarto") && ordenador.equals("spock")) ||
					(eleccion.equals("spock") && ordenador.equals("piedra")) ||
					(eleccion.equals("spock") && ordenador.equals("tijera")))
					{
				System.out.println("¡Ganaste!");
				break;
			} else {
				System.out.println("Perdiste.¡Sigue intentandolo!");
				
			}			
		}
		
		scanner.close();
		
		
	}
	
}
