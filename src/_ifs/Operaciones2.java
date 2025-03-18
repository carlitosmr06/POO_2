package _ifs;

public class Operaciones2 {

	public int mitad(int n) {
		return n / 2;
	}
	
	public int cuartaParte(int n) {
		return n / 4;
	}
	
	public int decimaParte (int n) {
		return n / 10;
	}
	
	public int enesimaParte (int n){
		return n / 9;
	}
	
	public static void main(String[] args) {
		Operaciones2 o2 = new Operaciones2();
		int x = 90;
		
		System.out.println("Mitad: " + o2.mitad(x));
		System.out.println("CuartaParte: " + o2.cuartaParte(x));
		System.out.println("DecimaParte: " + o2.decimaParte(x));
		System.out.println("EnesimaParte: " + o2.enesimaParte(x));
		
	}
	
}
