package cap2;

public class Literais {
	public static void main(String[] args) {

		int a = 44; // decimal
		int b = 054; // octal
		int texto32bit = 0x2c; // hexdecimal
		char texto = 't';
		boolean validacao = false;
		byte texto8bit = 127;
		short texto16bit = 32767;
		long texto64bit = 2147483647;
		float  textopontoflutuante32bit = 1.65f;
		double textopontoflutuante64bit = 1.75698563;

		System.out.println("a: " + a); // concatenação de dados
		System.out.println("b: " + b); // concatenação de dados
		System.out.println("c: " + texto32bit); // concatenação de dados
		System.out.println(a + b + texto32bit);
		System.out.println("a: " + a + " b: " + b + " c: " + texto32bit);
		System.out.println(texto);
		System.out.println(validacao);
		System.out.println(texto8bit);
		System.out.println(texto16bit);
		System.out.println(texto32bit);
		System.out.println(texto64bit);
		System.out.println(textopontoflutuante32bit);
		System.out.println(textopontoflutuante64bit);
		
	}
}
