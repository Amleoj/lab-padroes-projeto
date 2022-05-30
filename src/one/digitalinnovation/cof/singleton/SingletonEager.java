package one.digitalinnovation.cof.singleton;

/**
 * Singleton "apressado"
 * 
 * @author JoelmaAlexandreT
 *
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	 
	private SingletonEager() {
		super();
		
	}
	
	
public static SingletonEager getInstancia() {  
	return instancia;
	
	}

}
