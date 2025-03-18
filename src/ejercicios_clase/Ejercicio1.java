package ejercicios_clase;

import java.util.ArrayList;

	public class Ejercicio1 {
		public static void main(String[] args) {
			ArrayList<Integer> al = new ArrayList<>();
			
			for(int i = 1; i <= 10;i++) {
				al.add(i * 2);
			}
			System.out.println(al);
		}
	
}
