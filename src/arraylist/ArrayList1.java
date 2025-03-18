package arraylist;

import java.util.ArrayList;



public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> al1 = new ArrayList<>();

		al1.add("Cien años de soledad");

		al1.add("1984");

		al1.add("El alquimista");

		al1.add("El principito");

		al1.add("El retrato de Dorian Grey");

		

		

		System.out.println("Usando un blucle for:");

		for(int i = 0; i < al1.size();i++) {

			System.out.println(al1.get(i));

		}

		System.out.println();

		

		System.out.println("Usando un bucle for each:");

		for(String libros : al1) {

			System.out.println(libros);

		}



		

	}



}

