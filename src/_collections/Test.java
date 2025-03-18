package _collections;

import _collections.Color;
import _collections.Marca;

public class Test {
	
	private Color color;
	private Marca marca;
	
	public static void main(String[] args) {
		
		
		
		Parking p = new Parking("Aparcamiento Chiclana",10);
		
		for(int i =0;i < 7 ;i++) {
			p.entraCoche(new Coche());
		}
		
		System.out.println();
		p.reportParking();
		System.out.println();
		p.reportColores();
		System.out.println();
		p.reports();
		System.out.println();
		p.reportCochesIguales();
		System.out.println();
		p.reportSetCoches();
	}
	
}
