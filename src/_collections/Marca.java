package _collections;

import java.util.Random;

public enum Marca {

	WV("volskwagen"),AM("aston martin"),BM("bmw"),AU("audi"),PE("peugeot");
	
	private String marca;

	private Marca(String marca) {
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}
	
	public static Marca aleatorio() {
		Random random = new Random();
		Marca [] marcas = Marca.values();
		int indiceAleatorio = random.nextInt(marcas.length);
		System.out.printf("%s%n", marcas[indiceAleatorio].getMarca());
		return marcas[indiceAleatorio];
	}

	public String getNombre() {
		return marca;
	}

	
	
	
}
