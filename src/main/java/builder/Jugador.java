package builder;

import adapter.HabilidadesExtras;
import observer.IObservador;
import state.StateJugador;

public class Jugador extends HabilidadesExtras implements IObservador{

	private String nombre;
	
	private int atajar, defender, atacar;
	
	private StateJugador estado;

	private boolean posesionBalon = false;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getAtajar() {
		return atajar;
	}

	public void setAtajar(int atajar) {
		this.atajar = atajar;
	}

	public int getDefender() {
		return defender;
	}

	public void setDefender(int defender) {
		this.defender = defender;
	}

	public int getAtacar() {
		return atacar;
	}

	public void setAtacar(int atacar) {
		this.atacar = atacar;
	}

	public StateJugador getEstado() {
		return estado;
	}

	public void setEstado(StateJugador estado) {
		this.estado = estado;
	}

	@Override
	public void patearAfuera() {
		if(posesionBalon){
			System.out.println("Patear afuera");

		}else{
			System.out.println("No la tengo yo");
		}
	}

	@Override
	public void pegarleAlArco(int direccion) {
		if(posesionBalon){
			System.out.println("Pegarle al arco en direccion a " + direccion);
		}else{
			System.out.println("No la tengo yo");

		}
	}


	@Override
	public void hacerUnPase(Jugador jugador) {
		System.out.println("Se la paso a " + jugador.getNombre());
		jugador.recibirPelota(this);
	}

	@Override
	public void recibirPelota(Jugador jugador) {
		System.out.println("Tengo la pelota! Me la pasó " + jugador.getNombre());
	}

	@Override
	public void observadoActualizado(boolean posesion) {
		
		this.posesionBalon = posesion;

		if(posesion) {
			System.out.println(this.getNombre() + ": " + "Tengo el balon!");
		}
		
	}
	
}
