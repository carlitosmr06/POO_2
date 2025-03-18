package colecciones;

public class CuentaAtras {

	private int [] valores;
	
	public CuentaAtras(int numeroInicial, int numeroFinal) {
		// si inicial 5 y final 2
		// guarda en el array 5, 4, 3, 2
		
		valores = new int [numeroInicial - numeroFinal +1];
		for(int i = 0; i < valores.length;i++) {
			valores[i] = numeroInicial --;
		}
	
	}
	
	@Override
	public String toString() {
		// Si en el array 5, 4, 3, 2
		// devuelve 5... 4... 3... 2
		
		String resultado = "";
		
		for (int valor : valores) {
			resultado = resultado + valor + " ... ";
		}
		
		return resultado;
	}
	
	public void quitaUno() {
		// Si en el array 5, 4, 3, 2
		// debe dejar 5, 4, 3
		
		int[] arrayViejo = valores;
		int [] arrayNuevo = new int [arrayViejo.length - 1];
		
		for (int i = 0; i < arrayNuevo.length; i++) {
			arrayNuevo [i] = arrayViejo[i];
			
		}
		valores = arrayNuevo;
		
	}
	
	public static void main(String[] args) {
		CuentaAtras ca1 = new CuentaAtras(5,2);
		System.out.println(ca1);
		ca1.quitaUno();
		ca1.quitaUno();
		System.out.println(ca1);
	}
	
}
