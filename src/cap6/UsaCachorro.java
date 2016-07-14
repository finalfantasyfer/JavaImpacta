package cap6;

public class UsaCachorro {
	public static void main(String[] args) {
	
		Cachorro c1 = new Cachorro();
		c1.nome = "Totó";
		c1.raca = "Vira";
		c1.idade = 2;
		
		Cachorro c2 = new Cachorro();
		c2.nome = "Fifi";
		c2.raca = "Poodle";
		c2.idade = 3;
		System.out.println("Nome  Raça    idade"  );
		System.out.println("-------------------");
		System.out.println(c1.nome+ "  "+  c1.raca + "     " +  c1.idade);
		System.out.println(c2.nome+ "  "+  c2.raca + "   " +  c2.idade);
		
	}

}
