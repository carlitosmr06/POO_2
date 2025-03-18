package examen;

import java.util.Random;

public enum Continente {

	EUROPA("Europa"),AMERICA("America"),ASIA("Asia"),AFRICA("Africa"),OCEANIA("Oceania"),ANTARTIDA("Antartida");
	
	private String continente;

	private Continente(String continente) {
		this.continente = continente;
	}

	public String getContinente() {
		return continente;
	}
	
	public static Continente aleatorio() {
		
		Random random = new Random();
		Continente [] continentes = Continente.values();
		int indiceAleatorio = random.nextInt(continentes.length);
		System.out.printf("%s%n" , continentes[indiceAleatorio].getContinente());
		return continentes[indiceAleatorio];
		
	}
	
	public String getNombre() {
		return continente;
	}
	
}
