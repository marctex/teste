
public class MediaConsumo {

	public static void main(String[] args) {		
		
		// vegetariano
		Pessoa p1 = new Pessoa();	
		p1.nome = "Juca";
		p1.sexo = "Masculino";
		p1.idade = 15;
		p1.vegetariana = true;
		// idade ate 3 anos		
		Pessoa p2 = new Pessoa();	
		p2.nome = "Nina";
		p2.sexo = "Feminino";
		p2.idade = 3;
		p2.vegetariana = false;
		// idade de 4 a ate 12 anos
		Pessoa p3 = new Pessoa();	
		p3.nome = "Tim";
		p3.sexo = "Masculino";
		p3.idade = 12;
		p3.vegetariana = true;
		// idade de 13 anos em diante
		Pessoa p4 = new Pessoa();	
		p4.nome = "Nana";
		p4.sexo = "Feminino";
		p4.idade = 13;
		p4.vegetariana = false;		
		
		Churrasco c = new Churrasco();
		c.verificarConsumo(p1);
		c.verificarConsumo(p2);
		c.verificarConsumo(p3);
		c.verificarConsumo(p4);
		c.mediaConsumo();
		
		}
}
