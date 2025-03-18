package collectionsymaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CuentaCuentos {

	public static String cuentoZorro(){
        StringBuilder sb = new StringBuilder();
        sb.append("El zorro y las uvas");
        sb.append("\nHabÃ­a una vez un zorro que caminaba, sediento, por el bosque. "
                + "Mientras lo hacÃ­a vio en lo alto de la rama de un Ã¡rbol un racimo "
                + "de uvas, las cuales deseÃ³ al instante al servirle para refrescarse "
                + "y apagar su sed. El zorro se acercÃ³ al Ã¡rbol e intentÃ³ alcanzar las "
                + "uvas, pero estaban demasiado altas. Tras intentarlo una y otra vez "
                + "sin conseguirlo, el zorro finalmente se rindiÃ³ y se alejÃ³. Viendo "
                + "que un pÃ¡jaro habÃ­a visto todo el proceso se dijo en voz alta que "
                + "en realidad no querÃ­a las uvas, dado aÃºn no estaban maduras, y que "
                + "en realidad habÃ­a cesado el intento de alcanzarlas al comprobarlo.");
        sb.append("\nOtra interesante historia corta en forma de fÃ¡bula que nos "
                + "enseÃ±a que a menudo nos intentamos convencer a nosotros mismos "
                + "de no querer algo e incluso llegamos a despreciar dicho algo por "
                + "el hecho de que encontramos difÃ­cil llegar a alcanzarlo.");
        return sb.toString();
    }        
    

public static String cuentoLechera(){
        StringBuilder sb = new StringBuilder();
        sb.append("El cuento de la lechera");
        sb.append("\nÃ‰rase una vez una joven lechera que llevaba un cubo de leche "
                + "en la cabeza, camino al mercado para venderla. Durante el camino, "
                + "la soÃ±adora joven iba imaginando lo que podrÃ­a lograr conseguir "
                + "con la leche. PensÃ³ que en primer lugar y con el dinero de la venta "
                + "comprarÃ­a un canasto de huevos, los cuales una vez eclosionaran le "
                + "permitirÃ­a montar una pequeÃ±a granja de pollos. Una vez estos "
                + "crecieran podr0Ã­a venderlos, lo que le darÃ­a dinero para "
                + "comprarse un lechÃ³n.");
        sb.append("\nUna vez este creciera la venta del animal bastarÃ­a para comprarse "
                + "una ternera, con la leche de la cual seguirÃ­a obteniendo beneficios "
                + "y a su vez podrÃ­a tener terneros. Sin embargo, mientras iba pensando "
                + "todas estas cosas la joven tropezÃ³, lo que provocÃ³ que el cÃ¡ntaro "
                + "cayera el suelo y se rompiera. Y con Ã©l, sus expectativas hacia lo "
                + "que podrÃ­a haber hecho con ella.");  
        return sb.toString();
    }     

		public static String[] devuelvePalabras(String cuento) {
			cuento = cuento.replaceAll("[.,\n]", "");
		return cuento.split(" ");
		}
		
		public static void arrayPalabras(String [] palabras) {
		System.out.println("Array de palabras");
		System.out.println();
		System.out.println("=================");
		System.out.println();
		
		for(String palabra : palabras) {
			System.out.print("[" + palabra + "]");
		}
		System.out.println();
		System.out.println("\nLista original tiene: " + palabras.length + " palabras.");
		}

	
		public static  void arrayListPalabras(String [] palabras2) {
			ArrayList <String> listaDePalabras = new ArrayList <>();
			System.out.println("ArrayList de palabras");
			System.out.println();
			System.out.println("=================");
			System.out.println();
			
			for(String palabraArray : palabras2) {
				System.out.print("[" + palabraArray + "]");
			}
			System.out.println();
			System.out.println("\nLista de ArrayList tiene: " + palabras2.length + " palabras.");
			
		}
		
		public static void hashSetPalabras(String [] palabras3) {
			HashSet <String> hashPalabras = new HashSet <>();
			System.out.println("HashSet de palabras");
			System.out.println();
			System.out.println("=================");
			System.out.println();
			
			for(String palabraHashSet : palabras3) {
				System.out.print(" [" + palabraHashSet + "] ");
			}
			System.out.println();
			System.out.println("\nLista en HashSet tiene: " + palabras3.length + " palabras.");
		}
		
		public static void treeSetPalabras(String [] palabras4) {
			TreeSet <String> treePalabras = new TreeSet <>();
			System.out.println("TreeSet de palabras");
			System.out.println();
			System.out.println("=================");
			System.out.println();
			
			for(String palabrasTreeSet : palabras4) {
				System.out.print(" [" + palabrasTreeSet + "] ");
			}
			System.out.println();
			System.out.println("\nLista en HashSet tiene: " + palabras4.length + " palabras.");
		}
		
		public static void mapConteoPalabras(String [] palabras5) {
			HashMap <String, Integer> contarPalabras = new HashMap <>();
			System.out.println("Conteo de repeticiones de palabras");
			System.out.println();
			System.out.println("=================");
			System.out.println();
			
			for(String conteoPalaMap : palabras5) {
				contarPalabras.put(conteoPalaMap, contarPalabras.getOrDefault(conteoPalaMap, 0) + 1);
			}
			
			for(var contador : contarPalabras.entrySet()) {
				System.out.println("[" + contador.getKey() + "(" + contador.getValue() + ")]");
			}
			
			System.out.println();
		}
		
		public static void mapConteoPalabrasOrdenadas (String [] palabras6) {
			Map <String, Integer> palabrasOrdenadas = new TreeMap <>();
			System.out.println("Conteo de repeticiones de palabras ordenadas");
			System.out.println();
			System.out.println("=================");
			System.out.println();
			
			for(String conteoPalOrd : palabras6) {
				palabrasOrdenadas.put(conteoPalOrd, palabrasOrdenadas.getOrDefault(conteoPalOrd, 0) + 1);
			}
			
			for ( Map.Entry<String, Integer> conteo : palabrasOrdenadas.entrySet()) {
				System.out.println("[" + conteo.getKey() + "(" + conteo.getValue() + ")]");
			}
			System.out.println();
		}
		
		public static void treeSetPalabrasOrdenadasInversas (String [] palabras7) {
			Set<String> palabrasInversas = new TreeSet<>(Collections.reverseOrder());
			palabrasInversas.addAll(Arrays.asList(palabras7));
			System.out.println("Listado de palabras unicas en orden inverso:");
			System.out.println();
			System.out.println("=================");
			
			for(String invertirPalabra : palabras7) {
				System.out.println("[" + invertirPalabra + "]");
			}
			System.out.println();
			System.out.println("Lista en TreeSet tiene: ");
		}
		
}
