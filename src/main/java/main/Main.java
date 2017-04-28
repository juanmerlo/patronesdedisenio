package main;

import java.util.ArrayList;
import java.util.List;

import builder.Jugador;
import builder.JugadorBuilder;
import factoryMethod.CreadorCancha;
import factoryMethod.CreadorCanchaAbstracto;
import factoryMethod.ICancha;
import singleton.Balon;
import state.*;
import strategy.*;
import templateMethod.EquipoA;

public class Main {

	public static void main(String[] args){

		Jugador jugador1 = new JugadorBuilder()
				.setNombre("Roberto Carlos")
				.setEstado(new Arquero())
				.setDefender(9)
				.setAtacar(9)
				.setAtajar(1)
				.build();
		
		Jugador jugador2 = new JugadorBuilder()
				.setNombre("Ronaldo")
				.setEstado(new Defensor())
				.setDefender(2)
				.setAtacar(8)
				.setAtajar(1)
				.build();
		
		Jugador jugador3 = new JugadorBuilder()
				.setNombre("Messi")
				.setEstado(new Defensor())
				.setDefender(2)
				.setAtacar(10)
				.setAtajar(2)
				.build();
		
		Jugador jugador4 = new JugadorBuilder()
				.setNombre("Batistuta")
				.setEstado(new Delantero())
				.setDefender(2)
				.setAtacar(9)
				.setAtajar(1)
				.build();
		
		Jugador jugador5 = new JugadorBuilder()
			.setNombre("Juan Merlo")
			.setEstado(new Delantero())
			.setDefender(9)
			.setAtacar(8)
			.setAtajar(9)
			.build();
				
		List<Jugador> jugadores = new ArrayList<Jugador>();
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		jugadores.add(jugador3);
		jugadores.add(jugador4);
		jugadores.add(jugador5);

		EquipoA fantasia = new EquipoA(jugadores);
		
		fantasia.setEstrategiaEquipo(new Zonal());
		fantasia.getEstrategiaEquipo().marca();

		
		System.out.print(jugador1.getNombre() + ": ");
		jugador1.getEstado().jugar();
		
		System.out.print(jugador2.getNombre() + ": ");
		jugador2.getEstado().jugar();
		
		System.out.print(jugador3.getNombre() + ": ");
		jugador3.getEstado().jugar();
		
		System.out.print(jugador4.getNombre() + ": ");
		jugador4.getEstado().jugar();
		
		System.out.print(jugador5.getNombre() + ": ");
		jugador5.getEstado().jugar();

		
		jugador2.setEstado(new Arquero());
		System.out.print(jugador2.getNombre() + ": ");
		jugador2.getEstado().jugar();
		
		
		System.out.print(jugador5.getNombre() + ": ");
		jugador5.patearAfuera();
		System.out.print(jugador4.getNombre() + ": ");
		jugador4.hacerUnPase(jugador3);
		System.out.print(jugador3.getNombre() + ": ");
		jugador3.pegarleAlArco(5);
		
		CreadorCanchaAbstracto creador = new CreadorCancha();
		
		ICancha pasto = creador.crear(CreadorCancha.PASTO, 30);
		System.out.println("Cancha pasto:" + pasto.velocidadCancha());
		
		ICancha cemento = creador.crear(CreadorCancha.CEMENTO,20);
		System.out.println("Cancha cemento:" + cemento.velocidadCancha());
		
		
		Balon balon = Balon.getInstancia();
		balon = Balon.getInstancia();
		Balon balon2 = Balon.getInstancia();
		balon2 = Balon.getInstancia();
		
		balon.agregarObservador(jugador1);
		balon.agregarObservador(jugador2);
		balon.agregarObservador(jugador3);
		balon.agregarObservador(jugador4);
		balon.agregarObservador(jugador5);

		balon.posesionBalon(jugador5);
		jugador5.pegarleAlArco(6);
		
		balon.posesionBalon(jugador1);
		jugador5.pegarleAlArco(6);

	}

}
