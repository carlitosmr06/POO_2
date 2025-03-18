package examen;

import java.security.DomainCombiner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Edificio {

	private int aforo;
	private double pesoMaximo;
	private String persona;
	
	ArrayList<Persona> listaPersonas = new ArrayList <>();
	
	HashSet <Persona> setPersonasEntraronAlgunaVez = new HashSet<>();
	
	HashMap<Continente,Integer> PersonaContinente = new HashMap<>();
	HashMap<ColorPelo,Integer> PersonaColorPelo = new HashMap<>();
	 
	
	
	
	
	
	public Edificio(int aforo, double pesoMaximo) {
		super();
		this.aforo = aforo;
		this.pesoMaximo = 60;
		this.persona = persona;
		this.listaPersonas = new ArrayList();
		this.setPersonasEntraronAlgunaVez = new HashSet<>();
		PersonaContinente = new HashMap<>();
		PersonaColorPelo = new HashMap<>();
	}

	public boolean entrarPersona(Persona p) {
		
		ColorPelo colorPelo = p.getColorPelo();
		Continente continente = p.getContinenteProcedencia();
		
		if(listaPersonas.size() >= aforo) {
			System.out.println("No puede entrar persona");
			return false;
		}
		
		listaPersonas.add(p);
		setPersonasEntraronAlgunaVez.add(p);
		PersonaColorPelo.put(colorPelo, PersonaColorPelo.getOrDefault(colorPelo, 0) + 1);
		PersonaContinente.put(continente, PersonaContinente.getOrDefault(continente, 0) + 1);
		System.out.println("Entra persona");
		return true;
		
	}
	
	public void peso(Persona p) {
		if(p.getPeso() > pesoMaximo) {
			System.out.println("la persona no puede entrar"); 
			
		}
		
		if(p.getPeso() < pesoMaximo) {
			System.out.println("la persona a entrado");
		}
		
	}
	
	
	public static void main(String[] args) {
		Edificio e1 = new Edificio(10, 60);
		Persona p1 = new Persona("Juan", 30, ColorPelo.RUBIO, Continente.EUROPA);
		Persona p2 = new Persona("Pablo",65,ColorPelo.PELIRROJO,Continente.ASIA);
		e1.entrarPersona(p1);
		System.out.println(p1);
		e1.peso(p1);
		
		System.out.println();
		
		e1.entrarPersona(p2);
		System.out.println(p2);
		e1.peso(p2);
		
		
		
		
	}
	
}
