/*
 * Usando a instrução for, desenvolva uma rotina
 * que mostre na tela as tabuadas do 1 ao 10.
 */
package cap4.lab;

public class ExercicioExtraCap4_2 {

	public static void main(String[] args) {
		int tabuada = 0;
		int i = 0;
		int resultado = 0;

		instrucao1: for (tabuada = 1; tabuada <= 10; tabuada++) {
			System.out.println("------------Tabuada do "+tabuada+"---------------");
			instrucao2: for (i = 1; i <= 10; i++) {
				resultado = tabuada * i;
				System.out.println(tabuada + " X " + i + " = " + resultado);
				if (i == 10) {
					break;
				}
			}
		
		}
	}
}

// resultado = tabuada * i;
// System.out.println(tabuada + " X " + i + " = " + resultado);		