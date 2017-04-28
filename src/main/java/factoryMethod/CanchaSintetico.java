package factoryMethod;

public class CanchaSintetico implements ICancha{

	private int claseSintetico;
	
	public CanchaSintetico(int claseSintetico) {
		
		this.claseSintetico =  claseSintetico;
	}
	
	@Override
	public double velocidadCancha() {
		return claseSintetico * 0.3;
	}

}
