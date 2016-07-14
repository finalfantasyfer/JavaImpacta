package cap6;

public class UsaPessoa {
	public static void main(String[] args) {
		int x = 10; // X e uma variavel local de metodo que guarda um tipo
					// primitivo

		String s = "Texto;"; // S e uma variavel local de metodo que guarda um
								// tipo construido

		int y;
		System.out.println("x: " + x);
		// System.out.println("y: " + y); // variveis locais de metodo devem ser
		// inicializadas para serem utilizadas

		// Instancia a classe Pessoa
		Pessoa p; // p e uma variavel local de metodo que guarda um
		// tipo construido e ela e conhecida como variavel de referencia
		// System.out.println(p); // S e uma variavel local de metodo que guarda
		// um
		// tipo construido Pessoa p = null, deve ser inicializada

		p = new Pessoa();
		System.out.println(p);

		// Pessoa p1 = new Pessoa();
		// System.out.println(p1);

		System.out.println("Nome: " + p.nome);
		System.out.println("Idade: " + p.idade);
		System.out.println("Sexo: " + p.sexo);
		System.out.println("Estado Civíl: " + p.estadoCivil);
		
		// Inicializando valores para os atributos de p
		p.nome = "João";
		p.idade = 22;
		p.sexo = 'm';
		p.estadoCivil = true;
		
		System.out.println("Nome: " + p.nome);
		System.out.println("Idade: " + p.idade);
		System.out.println("Sexo: " + p.sexo);
if (p.estadoCivil == false){
		System.out.println("Estado Civíl: Solteiro ");
}else 
	System.out.println("Estado Civíl: Morto ");
	}

}
