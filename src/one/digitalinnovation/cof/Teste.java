package one.digitalinnovation.cof;

import one.digitalinnovation.cof.singleton.SingletoLazy;
import one.digitalinnovation.cof.singleton.SingletonEager;
import one.digitalinnovation.cof.singleton.SingletonLazyHolder;
import one.digitalinnovation.cof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.cof.strategy.Robo;

public class Teste {

	public static void main(String[] args) {
		
        // Singleton
		
		SingletoLazy lazy = SingletoLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletoLazy.getInstancia();
		System.out.println(lazy);
		
	
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
	
	
	
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
	
	    // Strategy
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
	     Robo robo = new Robo();
	     robo.setcomportamento(normal);
	     robo.mover();
	     robo.mover();
	     robo.setcomportamento(defensivo);
	
	}
	
	
	

}
