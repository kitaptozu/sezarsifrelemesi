package tr.org.linux.kamp.sezersifreleme;

import java.util.Scanner;

public class SezerSifrelemesi {

	public static void main(String[] args) {
		// String deneme = "IBCKZFGQHGQKQBE";
		String deneme = "Mustafazzz";
		String deneme2;
		// int oteleme =1;
		Scanner input = new Scanner(System.in);
		for (int i = 1; i < 27; i++) {
			System.out.println();
			int oteleme = i;
			System.out.println(i + ".");
			System.out.println(deneme);
			deneme2 = sezarSifresi(deneme, oteleme);
			System.out.println(sezarSifresi(deneme, oteleme));
			System.out.println(sezarSifresi(deneme2, -oteleme));

		}

		// System.out.println(deneme);
		// System.out.println(sezarSifresi(deneme, oteleme));
	}

	private static String sezarSifresi(String key, int oteleme) {
		String result = "";
		if(oteleme < 0) oteleme= 26-(-oteleme%26);
		for (int i = 0; i < key.length(); i++) {

			if (Character.isLetter(key.charAt(i))) {
				if (Character.isUpperCase(key.charAt(i))) {

					result += (char) ('A' + ((key.charAt(i) + oteleme - 'A') % 26));
				}

				else {
					result += (char) ('a' + ((key.charAt(i) + oteleme - 'a') % 26));
				}

			} else {
				result += key.charAt(i);
			}

		}

		return result;

	}

}
