package _enums;

public enum MesesDelAño {

	EN(1,"enero","january"),FE(2,"febrero","february"),MA(3,"marzo","march"),AP(4,"abril","april"),
	MAY(5,"mayo","may"),JUN(6,"junio","julio"),JUL(7,"julio","july"),AG(8,"agosto","agugust"),
	SE(9,"septiembre","september"),OC(10,"octubre","october"),NO(11,"noviembre","november"),
	DI(12,"diciembre","december");
	
	private int numeroMes;
	private String nombreES;
	private String nombreEN;
	
	private MesesDelAño(int numeroMes, String nombreES, String nombreEN) {
		this.numeroMes = numeroMes;
		this.nombreES = nombreES;
		this.nombreEN = nombreEN;
	}
	public int getNumeroMes() {
		return numeroMes;
	}
	public String getNombreES() {
		return nombreES;
	}
	public String getNombreEN() {
		return nombreEN;
	}
	
	public static MesesDelAño obtenerPorNumero(int numero) {
		for(MesesDelAño mes : MesesDelAño.values()) {
			if(mes.getNumeroMes() == numero) {
				return mes;
			}
		}
		return null;
	}
	
	public String presentMeses() {
		return String.format("el mes %d del año es %s (%s)", numeroMes, nombreES, nombreEN);
	}
	
}
