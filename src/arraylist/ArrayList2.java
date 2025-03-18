package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class ArrayList2 {

	private static void muestraYSubraya(String texto) {
		System.out.println(texto);
		for(int i = 0; i < texto.length();i++) {
			System.out.print("-");
		}	
		System.out.println();
	}
	
	
	private static void muestraTodosLosDatos(ArrayList<Integer> lista) {
System.out.println(lista);
		
		Integer suma = 0;
		Integer maximo = lista.get(0);
		Integer minimo = lista.get(0);
		for (Integer num : lista) {
			suma += num;
			maximo = num > maximo ? num : maximo;
			minimo = num < minimo ? num : minimo;
		}
		muestraYSubraya("Sumar");
		System.out.println(suma);
		
		muestraYSubraya("Media");
		System.out.println(suma/lista.size());
		
		muestraYSubraya("Maximo");
		System.out.println(maximo);
		
		muestraYSubraya("Minimo");
		System.out.println(minimo);
	}
	
	
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		Random random = new Random();
		muestraYSubraya("Mostrar lista de numeros aleatorios");
		
		for (int i = 0; i < 20; i++) {
			al.add(random.nextInt(100) + 1);
		}
		
		muestraTodosLosDatos(al);
		
		muestraYSubraya("eliminar los menores de 50");
		
		for(int i = al.size() - 1; i >= 0;i--) {
			if(al.get(i) < 50 ) {
				al.remove(i);
			}
			System.out.println(al);
		} 
		
		muestraYSubraya("Mostrar lista de numeros aleatorios");
		muestraTodosLosDatos(al);
		
		
	// al.removeIf(s -> s < 50);
	//System.out.println(al);
		// asi se hace igual pero con removeif
	}
	
}
