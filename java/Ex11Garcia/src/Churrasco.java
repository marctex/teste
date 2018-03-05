
public class Churrasco {

	double qtdCarne = 0;
	int contador = 0;		
		
	void verificarConsumo(Pessoa p){
			
		if(p.idade < 4 || p.vegetariana == true) {
			System.out.println(p.nome + " não consome carne");
		}else if (p.idade < 13){
			System.out.println(p.nome + " consome 1 quilo de carne");
			qtdCarne= qtdCarne + 1;
		}else{
			System.out.println(p.nome +" consome 2 quilos de carne");
			qtdCarne= qtdCarne +2 ;			
		}
		contador++;
	}
	
	void mediaConsumo(){
		double media = qtdCarne/contador;
		System.out.println("A média de consumo de carne para " + contador + " pessoas é: " + media + " kgs ");	
	}
}
