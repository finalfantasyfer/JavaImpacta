package cap4.lab;

public class Lab2 {

	public static void main(String[] args) {
		String mes = "";
				switch (mes){
				case "Janeiro":
				case "Mar�o":
				case "Maio":
				case "Julho":
				case "Agosto":
				case "Outubro":
				case "Dezembro":	
					System.out.println("O m�s escolhido tem 31 dias" );
					break;
				case "Fevereiro":
					System.out.println("O m�s escolhido tem 28 ou 29 dias" );
					break;
				case "Abril":
				case "Junho":
				case "Setembro":
				case "Novembro":
					System.out.println("O m�s escolhido tem 30 dias" );
					break;
				default :
					System.out.println("Insira um m�s val�do." );
				}
	}

}
