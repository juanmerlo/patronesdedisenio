package templateMethod;

import java.util.List;

import builder.Jugador;
import strategy.EstrategiaEquipo;

public abstract class Equipo {
	protected List<Jugador> jugadores;
	protected int puntos;
	protected EstrategiaEquipo estrategiaEquipo;
	
	public Equipo(List<Jugador> jugadores){
		
		this.jugadores = jugadores;
	}
	
	//Metodo plantilla
	public int obtenerPuntuacionRanking(){
		
		int puntosFijos = 3000;
		
		int puntosTotales = puntosFijos + this.getPuntosVariables();
		
		return puntosTotales;
	}
	
	
	public void setEstrategiaEquipo(EstrategiaEquipo estrategia){
		this.estrategiaEquipo = estrategia;
	};
	
	public EstrategiaEquipo getEstrategiaEquipo(){
		
		return this.estrategiaEquipo;
	}
	
	
	public abstract int getPuntosVariables();

}
