package templateMethod;

import java.util.List;

import builder.Jugador;

public class EquipoB extends Equipo {

	public EquipoB(List<Jugador> jugadores) {
		super(jugadores);
	}

	@Override
	public int getPuntosVariables() {
		return puntos * 3 - 1100;
	}
	
}
