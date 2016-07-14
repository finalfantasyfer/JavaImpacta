/*
 * Baseando-se na tabela a seguir, desenvolver um c�digo que retorne o valor do
 * imposto de renda de um sal�rio de R$ 4.000,00.
 * 
 * Faixa salarial.................Al�quota................Parcela a deduzir
 * 
 * At� 1.903,98 	             - 			- 
 * De 1.903,99 at� 2.826,65........ 7,5% ..................142,80
 * De 2.826,66 at� 3.751,05........  15% ..................354,80 
 * De 3.751,06 at� 4.664,68........  22% ..................636,13 
 * Acima de 4.664,68 .................27,5% ..................869,36
 */

package cap4.lab;

public class ExerciciosExtraCap4_1 {

	public static void main(String[] args) {
		double ir = 0;
		double aliquota = 22;
		double deducao = 0;
		double salario = 4000;
		
		if(salario > 4664.68){
			ir = (salario / 100) * 27.5;
			System.out.println("Dedu��o de " + ir);
		}else if(salario >= 3751.06){
			ir = (salario / 100) * 22;
			System.out.println("Dedu��o de " + ir);
		}else if (salario >=2826.66){
			ir = (salario / 100) * 15;
			System.out.println("Dedu��o de " + ir);
		}else if(salario >=1903.99){
			ir = (salario / 100) * 7.5;
			System.out.println("Dedu��o de " + ir);
		}else{
			System.out.println("Isento");
		}
		

	}

}
