
public class ControleLampada {

	public static void main(String[] args) {

		Lampada L1 = new Lampada();
		L1.limiteClique = 4;
		L1.interruptorOn();
		L1.interruptorOff();
		L1.interruptorOn();
		L1.interruptorOff();
		L1.interruptorOn();
		L1.interruptorOff();
		L1.interruptorOn();
		L1.interruptorOff();
		L1.interruptorOn();
		L1.interruptorOff();

	}

}
