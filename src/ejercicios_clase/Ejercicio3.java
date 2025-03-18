package ejercicios_clase;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio3 {

	 public static void main(String[] args) {
	        ArrayList<String> palabras = new ArrayList<>();
	        ArrayList<String> filtradas = new ArrayList<>();
	        Random random = new Random();
	        String letras = "abcdefghijklmnopqrstuvwxyz";
	        
	        // Generar 1000 palabras de 4 letras aleatorias
	        for (int i = 0; i < 1000; i++) {
	            StringBuilder palabra = new StringBuilder();
	            for (int j = 0; j < 4; j++) {
	                palabra.append(letras.charAt(random.nextInt(letras.length())));
	            }
	            palabras.add(palabra.toString());
	        }
	        
	        // Filtrar palabras que terminan en 'a' o 'c'
	        for (String palabra : palabras) {
	            if (palabra.endsWith("a") || palabra.endsWith("c")) {
	                filtradas.add(palabra);
	            }
	        }
	        
	        // Mostrar el resultado
	        System.out.println("Palabras filtradas:");
	        for (String palabra : filtradas) {
	            System.out.println(palabra);
	        }
	        
	        // Mostrar la cantidad de palabras filtradas
	        System.out.println("Cantidad de palabras que terminan en 'a' o 'c': " + filtradas.size());
	    }
	   
	}


