/*
 * Baseando-se na tabela a seguir, desenvolver um código que retorne o valor do
 * imposto de renda de um salário de R$ 4.000,00.
 * 
 * Faixa salarial.................Alíquota................Parcela a deduzir
 * 
 * Até 1.903,98 	             - 			- 
 * De 1.903,99 até 2.826,65........ 7,5% ..................142,80
 * De 2.826,66 até 3.751,05........  15% ..................354,80 
 * De 3.751,06 até 4.664,68........  22% ..................636,13 
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
			System.out.println("Dedução de " + ir);
		}else if(salario >= 3751.06){
			ir = (salario / 100) * 22;
			System.out.println("Dedução de " + ir);
		}else if (salario >=2826.66){
			ir = (salario / 100) * 15;
			System.out.println("Dedução de " + ir);
		}else if(salario >=1903.99){
			ir = (salario / 100) * 7.5;
			System.out.println("Dedução de " + ir);
		}else{
			System.out.println("Isento");
		}
		

	}

}
