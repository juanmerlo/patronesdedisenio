package factoryMethod;

public class CreadorCancha extends CreadorCanchaAbstracto {

	@Override
	public ICancha crear(int tipo, int variable) {
		
		ICancha cancha;
		
		switch(tipo){
		
			case PASTO:
				cancha = new CanchaPasto(variable);
				break;
			case CEMENTO:
				cancha = new CanchaCemento(variable);
				break;
			case SINTETICO:
				cancha = new CanchaSintetico(variable);
				break;
			default:
				cancha = null;
		}
		
		return cancha;

	}

}
