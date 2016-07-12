package cap2;

public class Escopo { // Cada comando utilizando variavel declarada em escopo interno deve ser utiliazada somente na mesma a não ser escopos maiores(superiores)  
	public static void main(String[] args) {
		String nome = "Ana";
		{
			int idade = 10;
			System.out.println("Nome:" + nome);
			//System.out.println("Idade:" + idade);
			{
				char sexo = 'f';
				System.out.println("Sexo: " + sexo);
				System.out.println("Idade:" + idade);
			}
		
		
		}// Fim do Escopo interno
		
	} // Fim do Escopo do Main
}// Fim do Escopo da Classe
