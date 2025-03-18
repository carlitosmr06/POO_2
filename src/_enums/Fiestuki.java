package _enums;

public class Fiestuki {
	
	private String sitio;
	private MesesDelAño mes;
	
	
	

	public Fiestuki(String sitio, MesesDelAño mes) {
		this.sitio = sitio;
		this.mes = mes;
	}




	@Override
	public String toString() {
		return "Fiestuki [sitio=" + sitio + ", mes=" + mes + "]";
	}




	public static void main(String[] args) {
		
		Fiestuki tuki = new Fiestuki("Bali",MesesDelAño.JUL);
		System.out.println(tuki);
		for (MesesDelAño m : MesesDelAño.values()) {
			System.out.println(m.presentMeses());
		}
		
		
		
	}
	
}
