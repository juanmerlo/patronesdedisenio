package factoryMethod;

public class CanchaPasto implements ICancha{

	private int largoPastoEnMM;
	
	public CanchaPasto(int largoPastoEnMM){
		
		this.largoPastoEnMM = largoPastoEnMM;
	}
	
	@Override
	public double velocidadCancha() {
		
		return largoPastoEnMM * 0.5;
	}

}
