package _ifs;

import java.util.ArrayList;
import java.util.List;

public class Operaciones {

	
	
	public int cuadrado(int n) {
		return n * n;
	}
	
	
	public int cubo(int n) {
		return n * n * n;
	}
	
	public int doble (int n) {
		return n * 2;
	}
	
	public int triple(int n) {
		return n * 3;
	}
	
	public int polinomio(int n) {
		return 5 * n * n * n + 7 * n * n + 9;
	}
	
	public int polinomioVariable (int n, int a, int b, int c) {
		return a * n * n * n + b * n * n + c;
	}
	
	public List<Integer>  filtra (int [] numeros, FiltroEnteros f) {
		List<Integer> listafiltrada = new ArrayList<>();
		for(int num : numeros) {
			if(f.filtrar(num)){
				listafiltrada.add(num);
			}
		}
		
		return listafiltrada;
		
	}
	
	public static void main(String[] args) {
		
		Operaciones operaciones = new Operaciones();
		int x = 6;
		System.out.println("Cuadrado: " + operaciones.cuadrado(x));
		System.out.println("Cubo: " + operaciones.cubo(x));
		System.out.println("Doble: " + operaciones.doble(x));
		System.out.println("Triple: " + operaciones.triple(x));
		System.out.println("polinomio: " + operaciones.polinomio(x));
		System.out.println("PolinomioVariable: " + operaciones.polinomioVariable(x, 4, 8, 2));
		
		
		OperacionEntraEnteroSaleEntero cuadrado = (int s) -> {return s * s;};
		OperacionEntraEnteroSaleEntero cubo = s -> s * s * s;
		OperacionEntraEnteroSaleEntero doble = s -> s * 2;
		OperacionEntraEnteroSaleEntero triple = s -> s * 3;
		OperacionEntraEnteroSaleEntero polinomio = s -> 5 * x * x * x + 7 * x * x + 9;
		OperacionEntran4enterosSaleEntero polinomioVariable = (a, b, c, s) -> a * x * x * x + b * x * x + c;
		
		
	}
	
	
		
	 
	
}
