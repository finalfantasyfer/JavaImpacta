package cap4.lab;

public class Lab3 {

	public static void main(String[] args) {
		int ano = 1930;

		for (int i = 1930; ano <= 2014; i++) {
			ano += 4;
			if (ano == 1942) {
				continue;
			} else if (ano == 1946) {
				continue;
			}
			System.out.println("Copa do mundo de " + ano + "!");
		}

	}

}
