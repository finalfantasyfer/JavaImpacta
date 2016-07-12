package cap3;

public class OperadoresLogicos {
	public static void main(String[] args) {
		int a = 20;
		int b = 30;
		int c = 1;
		int d = 20;

		System.out.println("b < a || c ==1 =  " + (b < a || c == 1)); // Operador
																		// logico
																		// "E"
		System.out.println("a == d && d != a: " + (a == d && d != a)); // Operador
																		// logico
																		// "OU"
		System.out.println("!(c > b): " + (!(c > b))); // Operador logico
														// "NEGAÇÃO"

	}
}
