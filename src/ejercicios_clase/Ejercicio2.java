package ejercicios_clase;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		int chico = 6; // multiplos de este numero 
		int grande = 10; // cantidad de numeros en el array 
		int inicio = 2; // numero por el que se inicia 
		
		for(int i = inicio; al.size() < grande;i++) {
			if(i % chico == 0) {
				al.add(i);
			}
		}
		System.out.println(al);
	}

}