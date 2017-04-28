package templateMethod;

import java.util.List;

import builder.Jugador;

public class EquipoA extends Equipo{


	public EquipoA(List<Jugador> jugadores) {
		super(jugadores);
	}

	@Override
	public int getPuntosVariables() {
		return puntos * 3 + 2000;
	}


}
