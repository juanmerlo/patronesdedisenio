package factoryMethod;

public abstract class CreadorCanchaAbstracto {
	
	public static final int PASTO = 1;
	public static final int CEMENTO = 2;
	public static final int SINTETICO = 3;
	
	public abstract ICancha crear(int tipo, int variable);
	

}
