package colecciones;

import java.util.Arrays;

public class Frase {

	private String [] palabras;
	
	public Frase(String frase) {
	 
		palabras = frase.split(" ");
		
	}

	@Override
	public String toString() {
		String resultado = "";
		for (String palabra : palabras) {
			resultado = resultado + palabra + " ";
		}
		
		return resultado;
	}
	
	public void addPalabra (String palabra) {
	String [] arrayNuevo = new String [palabras.length + 1];
	String [] arrayViejo = palabras;
	for (int i = 0; i < arrayViejo.length; i++) {
		arrayNuevo[i] = arrayViejo [i];
	}
	
		arrayNuevo[arrayNuevo.length - 1] = palabra;
		// arrayNuevo[arrayViejo] = palabra;
		palabras = arrayNuevo;
	
	}
	
	public static void main(String[] args) {
		Frase f1 = new Frase("Hola soy yo");
		System.out.println(f1);
		f1.addPalabra("ole");
		System.out.println(f1);

	}
	
}
