package collectionsymaps;

import java.util.Random;

public class Test {

	
	
	public static void main(String[] args) {
		CuentaCuentos cuentaCuentos = new CuentaCuentos();
		String cuento = cuentaCuentos.cuentoLechera();
		System.out.println("Cuento elegido: " + cuento);
		System.out.println();
		
		String [] palabras = CuentaCuentos.devuelvePalabras(cuento);
		CuentaCuentos.arrayPalabras(palabras);
		System.out.println();
		CuentaCuentos.arrayListPalabras(palabras);
		System.out.println();
		CuentaCuentos.hashSetPalabras(palabras);
		System.out.println();
		CuentaCuentos.treeSetPalabras(palabras);
		System.out.println();
		CuentaCuentos.mapConteoPalabras(palabras);
		System.out.println();
		CuentaCuentos.mapConteoPalabrasOrdenadas(palabras);
		System.out.println();
		CuentaCuentos.treeSetPalabrasOrdenadasInversas(palabras);
		System.out.println();
	}
	
}
