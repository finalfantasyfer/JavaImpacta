package cap4.lab;

public class Lab1 {

	public static void main(String[] args) {
		int numero = 336;
		int divisoes = 0;
		int i = 1;

		for (; i < numero; i++) {
			if ((i % numero) == 0) {
				divisoes = i % numero;
			}
		}
		System.out.println(i);
		System.out.println(divisoes);
		if (divisoes <= 2){
			System.out.println("Primo");
		}else{
			System.out.println("Não Primo");
		}
	}
}
