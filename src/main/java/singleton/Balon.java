package singleton;

import observer.Observado;

public class Balon extends Observado{
	
	private static Balon instancia;
	
	private Balon(){
		
	}
	
	public static Balon getInstancia(){
		
		if(instancia == null){
			instancia = new Balon();
			System.out.println("El balon está creado");
		}else{
			
			System.out.println("El balon ya esta creado");
		}
		
		return instancia;
	}

}
