package observer;

import java.util.ArrayList;

import builder.Jugador;

public abstract class Observado {

	private ArrayList<IObservador> observadores = new ArrayList<IObservador>();	
	
	public void agregarObservador(IObservador observador){
		
		observadores.add(observador);
	}
	
	public void eliminarObservador(IObservador observador){
		
		observadores.remove(observador);
	}
	
	public void posesionBalon(IObservador observador){
		
		for(IObservador obj: observadores){
						
			
			if(((Jugador)obj).getNombre().equals(((Jugador)observador).getNombre())){
				
				obj.observadoActualizado(true);
			}else{
				obj.observadoActualizado(false);
			}
			
		}
		
	}
	
}
