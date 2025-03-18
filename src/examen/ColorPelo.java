package examen;

import java.util.Random;

public enum ColorPelo {

	RUBIO("Rubio"),PELIRROJO("Pelirrojo"),NEGRO("Negro"),CANOSO("Canoso");
	
	private String colorPelo;

	private ColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	public String getColorPelo() {
		return colorPelo;
	}
	
	public static ColorPelo aleatorio() {
		
		Random random = new Random();
		ColorPelo [] coloresPelo = ColorPelo.values();
		int indiceAleatorio = random.nextInt(coloresPelo.length);
		System.out.printf("%s%n" , coloresPelo[indiceAleatorio].getColorPelo());
		return coloresPelo[indiceAleatorio];
		
	}
	
	public String getNombre() {
		return colorPelo;
	}
	
}
