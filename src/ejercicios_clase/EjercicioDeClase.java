package ejercicios_clase;

import java.util.Iterator;

public class EjercicioDeClase {
	
public static void main(String[] args) {
	System.out.println("Bucle for del 1 al 10:");
	for(int i = 1;i <= 10;i++) {
		System.out.print(i + " ");
	}
	System.out.println();
	System.out.println();
	
	System.out.println("While del 1 al 10:");
	int contador = 1;
	while(contador <= 10) {
		System.out.print(contador +" ");
		contador++;
	}
	
	System.out.println();
	System.out.println();
	
	System.out.println("Do while del 1 al 10:");
	int contador2 = 1;
	do {
		System.out.print(contador2 + " ");
		contador2++;
	}while (contador2 <= 10);
	
}
	
}
