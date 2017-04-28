package builder;

import state.StateJugador;

public class  JugadorBuilder {
	private Jugador jugador;
	
	public JugadorBuilder(){
		jugador = new Jugador();
	}
	
	public JugadorBuilder setNombre(String nombre){
		
		jugador.setNombre(nombre);
		return this;
	}
	
	public JugadorBuilder setAtacar(int atacar){
		
		jugador.setAtacar(atacar);
		return this;
	}
	
	public JugadorBuilder setAtajar(int atajar){
			
		jugador.setAtajar(atajar);
		return this;
	}

	public JugadorBuilder setDefender(int defender){
		
		jugador.setDefender(defender);
		return this;
	}
	
	public JugadorBuilder setEstado(StateJugador estado){
		
		jugador.setEstado(estado);
		return this;
	}
		
	public Jugador build(){
		
		return jugador;
	}
		

}
