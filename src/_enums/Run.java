package _enums;

public class Run {

	public static void main(String[] args) {
		
		// buscar mes por su nombre
		System.out.println("Busca el mes por su nombre:");
		
		MesesDelAño mes = MesesDelAño.FE;
		System.out.println("Mes: "+ mes.getNombreES());
		System.out.println("Ingles: "+ mes.getNombreEN());
		System.out.println("Numero: "+ mes.getNumeroMes());
		
		// buscar mes por su numero
		System.out.println();
		System.out.println("Busca el mes por su numero:");
		
		int num = 9;
		MesesDelAño mesPorNum = MesesDelAño.obtenerPorNumero(num);
		if(mesPorNum != null) {
			System.out.println("Numero: " + num);
			System.out.println("Español: "+ mesPorNum.getNombreES());
			System.out.println("Ingles: "+ mesPorNum.getNombreEN());
		}else {
			System.out.println("Numero no valido.");
		}
		
	}
	
	
}
