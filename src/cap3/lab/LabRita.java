package cap3.lab;

/*
 * Desenvolva um código que retorne o valor a pagar der uma compra, de acordo
 * com o seguinte cenário:
 * 
 *  Faixa............................ Desconto (em %)
 *  0 a 1000 ........................     0 %
 *  1001 a 3000 .....................     5 %
 *  Acima de 3000 ...................    10 %
 * 
 */

public class LabRita {
	public static void main(String[] args) {
		double vcompra = 1100;
		double vapagar;
		String d10 = "10 %";  	
		String d5 = "5 %";
		
		vapagar = vcompra > 3000 ? (vcompra * 0.90)
				: (vapagar = vcompra >= 1001 ? (vcompra * 0.95) : (vcompra));

		
		// Pior Jeito ;) - vapagar = vcompra > 3000 ?
		// (vcompra-((vcompra/100)*10)) : (vapagar = vcompra >= 1001 ?
		// (vcompra-((vcompra/100)*5)) : (vcompra));

		System.out.println("Valor a apagar:" + " R$ " + (vapagar));

	}
}
