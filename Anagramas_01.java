package Todo2020;
/*
 *1.	Escribe un m�todo para determinar si dos cadenas son o no anagramas.
 */

import java.util.Arrays;

class Anagramas_01 {
	public static void main(String[] args) {
		String[][] cadenas = { { "t e.st", "TEST" }, { "AUTOMATIZADA", "AUtomatizada" },
				};
		for (String[] comparar : cadenas) {
			System.out.println(String.format("'%s' y '%s' son anagramas? %b", comparar[0], comparar[1], esAnagrama(comparar[0], comparar[1])));
		}
	}

	// CADENA
	public static String ordenar(String cadena) {
		char[] caracteres = cadena.toCharArray();
		Arrays.sort(caracteres);
		return new String(caracteres);
	}

	// PASAR LAS LETRAS A MIN�SCULAS Y QUITAR LOS PUNTOS, ESPACIOS Y SIGNOS
	public static boolean esAnagrama(String cadena, String Revisar) {
		
		cadena = cadena.toLowerCase().replace(" ", "").replace(".", "").replace(",", "").replace("�", "a").replace("�", "e")
				.replace("�", "i").replace("�", "o").replace("�", "u");
		Revisar = Revisar.toLowerCase().replace(" ", "").replace(".", "").replace(",", "").replace("�", "a")
				.replace("�", "e").replace("�", "i").replace("�", "o").replace("�", "u");
		// ACOMODAR LA PALABRA
		cadena = ordenar(cadena);
		Revisar = ordenar(Revisar);
		// MOSTRAR EL RESULTADO PARA SABER SI SON O NO ANAGRAMA
		return cadena.equals(Revisar);
	}
}