package cap4;

public class ExemploSwitchCasePaises {
	public static void main(String[] args) {

		String pais = "Fran�a";

		switch (pais) {
		case "Brasil":
		case "Portugal":
			System.out.println("Bom dia!");
			break;
		case "Fran�a":
			System.out.println("Bon jour!");
			break;
		case "Mexico":
		case "Argentina":
		case "Espanha":

			System.out.println("Buenos dias!");
			break;
		default:
			System.out.println("Good morning!");

		}
	}
}
