package _collections;

import java.util.Random;

public enum Color {

	RO("rojo"),NA("naranja"),AM("amarillo"),VE("verde"),AZ("azul"),IN("indigo"),VI("violeta");
	
	private String color;

	private Color(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	public static Color aleatorio() {
		Random random = new Random ();
		Color[] colores = Color.values(); // obtienes todos los colores del enum
		int indiceAleatorio = random.nextInt(colores.length); // obtienes un indice aleatorio
		System.out.printf("%s%n", colores[indiceAleatorio].getColor());
		return colores[indiceAleatorio];
	}
	
}
