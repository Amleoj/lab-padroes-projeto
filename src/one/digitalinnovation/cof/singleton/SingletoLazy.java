package one.digitalinnovation.cof.singleton;

/**
 * Singleton "preguiçoso".
 * 
 * @author JoelmaAlexandre
 *
 */

public class SingletoLazy {
	
	private static SingletoLazy instancia;
	
	private  SingletoLazy() {
		super();
		
	}
    
	public static SingletoLazy getIntancia() {
		if (instancia == null) {
			instancia = new SingletoLazy();
			
		}
		
		return instancia;
	}

	public static SingletoLazy getInstancia() {
		// TODO Auto-generated method stub
		return null;
	}
}
	
	
