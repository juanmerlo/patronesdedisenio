package factoryMethod;

public class CanchaCemento implements ICancha {
	
	private int aniosCancha;
	
	public CanchaCemento(int aniosCancha){
		this.aniosCancha = aniosCancha;
	}
	
	@Override
	public double velocidadCancha() {
		return this.aniosCancha * 0.4;
	}

}
