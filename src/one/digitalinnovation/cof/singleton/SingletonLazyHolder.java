package one.digitalinnovation.cof.singleton;

/**
 * Singleton "apressado"
 * 
 * @author JoelmaAlexandre
 */
public class SingletonLazyHolder {

	private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	
	private SingletonLazyHolder() {
		super();
		
	}
	
	public static SingletonLazyHolder getInstancia() {
		return instancia;
		
	}
}
