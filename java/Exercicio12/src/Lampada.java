
public class Lampada {
	
	boolean estadoLampada;
	boolean estadoInterruptor = false;
	int contClique= 0;
	int limClique = 5;
	
	boolean checarEstadoLampada() {
		
		if (contClique == limClique)
			estadoLampada = false;
		else
			estadoLampada = true;		
		return estadoLampada;
	}
	
	void ligarInterruptor() {
		
		if (checarEstadoLampada() == true && estadoInterruptor == false) {
			System.out.println("Lampada ON");
			contClique++;
		}else {
			System.out.println("Lampada queimada ou interruptor na posição ligado");
		}
		estadoInterruptor = true;
		System.out.println(contClique);
	}
	
	void desligarInterruptor() {
		
		if (checarEstadoLampada() == true && estadoInterruptor == true) {
			System.out.println("Lampada OFF");
		}else {
			System.out.println("Lampada queimada ou interruptor na posição desligado");
		}
		
		
	}
	
	
}
