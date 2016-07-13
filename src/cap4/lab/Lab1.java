package cap4.lab;

public class Lab1 {

	public static void main(String[] args) {
		int numero = 338;
		int divisoes = 0;
		int i = 1;

		for (; i < numero; i++) {
			divisoes = numero % i;	
		}
		if (divisoes < 2){
			System.out.println(numero + " Primo");
		}else{
			System.out.println(numero + " Nautual");
		}
	}
}
