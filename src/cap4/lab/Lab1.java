/*
 * VERIFICANDO SE UM NUMERO E PRIMO
 * VAMOS CRIAR UM PROGRAMA QUE VERIFICA SE UM NUMERO E PRIMO. LEMBRE-SE DE QUE UM NUMERO PRIMO SO E DIVISIVEL POR 1 E POR ELE MESMO.
 */

/* Etapa 1 
 * Crie uma clase e insira a estrutura basica de um programa
 */
package cap4.lab;

public class Lab1 {
	public static void main(String[] args) {
		/*
		 * Etapa 2 Declare duas variaveis do tipo int com os nomes numero e
		 * divisoes atribua um valor para numero e 0 para divisoes
		 */
		int numero = 347; //Informe um numero para verificar se é primo ou não
		int divisoes = 0;

		/*
		 * Etapa 3 Crie um laço de repetição for com uma variavel declarada e
		 * iniciada em 1 e que rode enquanto ela for menor que a variavel
		 * numero, incrementando a varival a cada interação
		 */

		for (int i = 1; i <= numero; i++) {

			/*
			 * Etapa 4 Dentro do for, verifique se o módulo entrea a variavel i
			 * e a variavel numero é igual a 0 Caso seja verdadeiro, incremente
			 * a variavel divisoes
			 */
			if ((numero % i) == 0) {
				divisoes++;
			}
		}

		/*
		 * Etapa 5 Logo após a estrutura de repetição for, verifique se a
		 * variavel divisoes e menor ou igual a 2. CAso seja verdadeiro, impra
		 * que o numero e primo, caso contrario, imprima que não e primo
		 */

		if (divisoes <= 2) {
			System.out.println(numero + " é número primo!");
		} else {
			System.out.println(numero + " não é número primo!");
		}
	}
}
