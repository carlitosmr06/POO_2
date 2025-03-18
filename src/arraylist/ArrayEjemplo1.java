package arraylist;

import java.util.ArrayList;

public class ArrayEjemplo1 {

	private static void muestraYSubraya(String texto) {
		System.out.println(texto);
		for(int i = 0; i < texto.length();i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList<>();
		
		al.add("rojo");
		al.add("amarillo");
		al.add("verde");
		al.add("rojo");
		al.add("amarillo");
		al.add("azul");
		al.add("naranja");
		al.add("marron");
		al.add("verde");
		
		
		muestraYSubraya("Usando bucle for: ");
		for(int i = 0; i < al.size();i++) {
			System.out.print(al.get(i) + " ");
		}
		
		System.out.println();
		System.out.println();
		
		muestraYSubraya("Usando un bucle for each: ");
		for(String colores : al) {
			System.out.print(colores + " ");
		}
		
		System.out.println();
		System.out.println();
		
		
		muestraYSubraya("segundo rojo borrado: ");
		al.get(3);
		al.remove(3);
		System.out.println(al);
		
		System.out.println();
		
		
		muestraYSubraya("Lista despues de borrado de todos los amarillos: ");
		al.remove(3);
		al.remove(1);
		System.out.println(al);
		
	}
	
}
