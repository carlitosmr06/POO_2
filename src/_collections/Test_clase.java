package _collections;

public class Test_clase {

	public static void main(String[] args) {
		Coche c1 = new Coche(Marca.AM, Color.RO);
		Coche c2 = new Coche(Marca.AM, Color.RO);
		Coche c3 = new Coche(Marca.AM, Color.RO);
		Parking p1 = new Parking("Parking 1 ", 10);
		Parking p2 = new Parking("Parking 2 ", 10);
		Parking p3 = new Parking("Parking 3 ", 10);
		Parking p4 = new Parking("Parking 4", 10);
		Parking p5 = new Parking("Parking 5", 10);

		System.out.println("Parking 1");
		p1.entraCoche(c1);
		p1.entraCoche(c2);
		p1.entraCoche(c3);

		p1.reports();

		p1.saleCoche(c2);
		p1.reports();
		p1.saleCoche(c2);
		p1.reports();
		p1.vaciarParking();
		p1.reports();

		System.out.println("------------------------");
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
		System.out.println("Parking 2");
		p2.entraCoche(c1);
		p2.entraCoche(c2);
		p2.entraCoche(c3);

		p2.reports();

		for (int i = 0; i < 4; i++) {
			p2.saleCocheAleatorio();
		}

		p2.reports();

		System.out.println("------------------------");
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
		System.out.println("Parking 3");
		p3.entraCoche(c1);
		p3.entraCoche(c2);
		p3.entraCoche(c3);
		p3.reports();
		Coche cocheAleatorio = p3.saleCocheAleatorio();
		p3.reports();
		p3.entraCoche(cocheAleatorio);
		p3.reports();

		System.out.println("------------------------");
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
		System.out.println("Parking 4");
		p4.vaciarParking();
		p4.saleCocheAleatorio();
		p4.saleCoche(c1);
		p4.reports();

		System.out.println("------------------------");
		for (int i = 0; i < 10; i++) {
			System.out.println();
		}
		System.out.println("Parking 5");
		for (int i = 0; i < 16; i++) {
			p5.entraCoche(new Coche(Marca.BM, Color.RO));
		}
		p5.reports();
	}
}
