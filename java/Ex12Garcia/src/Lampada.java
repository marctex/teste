
public class Lampada {

	boolean estadoLampada = true;
	int limiteClique;
	int contClique;
	
	void verificaLampada() {
		if (contClique == limiteClique) {
			System.out.println("Lampada queimada");
			estadoLampada = false;
		}
	}
	
	void interruptorOn() {
		verificaLampada();
		if (estadoLampada == true) {
			System.out.println("Acendeu lampada");
			contClique++;
		}
	}
	
	void interruptorOff() {
		if (estadoLampada == true) {
			System.out.println("Apagou lampada");
		}
	}
}
