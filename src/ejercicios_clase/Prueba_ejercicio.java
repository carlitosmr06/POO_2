package ejercicios_clase;

import java.util.Iterator;

public class Prueba_ejercicio {

	public static void main(String[] args) {
		
		int [][] array1d = new int [4][3];
		int [][] array2d = {{3, 2, 5},{1, 7}};
 		
		for (int i = 0; i < array1d.length; i++) {
			for (int j = 0; j < array1d[i].length; j++) {
				array1d[i][j] = 1;
			}
		}
		
		for (int i = 0; i < array1d.length;i++) {
			for (int j = 0; j < array1d[i].length;j++) {
				System.out.print(array1d[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}
