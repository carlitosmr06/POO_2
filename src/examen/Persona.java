package examen;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Persona {

	private enum colorPelo{
		RUBIO,PELIRROJO,NEGRO,CANOSO;

		
	}
	
	private enum continente {
		EUROPA,AMERICA,ASIA,AFRICA,OCEANIA,ANTARTIDA;

		
	}
	
	
	
	
	private String nombre;
	private double peso;
	
	private ColorPelo colorPelo;
	private Continente continenteProcedencia;
	
	ArrayList<String> listaNombres = new ArrayList<>();
	
	
	
	
	public Persona(String nombre, double peso, ColorPelo colorPelo, Continente continenteProcedencia) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.colorPelo = colorPelo;
		this.continenteProcedencia = continenteProcedencia;
	}
	
	
	
	public Persona () {
		super();
		this.colorPelo = ColorPelo.aleatorio();
		this.continenteProcedencia = Continente.aleatorio();
	}

	
	public String listaNombres() {
		
		
		
		listaNombres.add("Pedro");
		listaNombres.add("Maria");
		listaNombres.add("Juan");
		listaNombres.add("Jairo");
		listaNombres.add("Lucas");
		listaNombres.add("Daniel");
		listaNombres.add("Javier");
		listaNombres.add("Carlos");
		listaNombres.add("Pablo");
		listaNombres.add("Alvaro");

		return nombre;
	}



	public ColorPelo getColorPelo() {
		return colorPelo;
	}



	public Continente getContinenteProcedencia() {
		return continenteProcedencia;
	}



	public double getPeso() {
		return peso;
	}



	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", peso=" + peso + ", colorPelo=" + colorPelo + ", continenteProcedencia="
				+ continenteProcedencia + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(colorPelo, continenteProcedencia, nombre, peso);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return colorPelo == other.colorPelo && continenteProcedencia == other.continenteProcedencia
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso);
	}
	
	
	
}
