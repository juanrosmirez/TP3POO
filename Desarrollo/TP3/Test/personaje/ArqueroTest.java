package personaje;

import static org.junit.Assert.*;

import org.junit.Test;

import item.Capa;
import item.Escudo;
import item.Punial;
/**
 * @author adrian
 *
 */
public class ArqueroTest {
	private final double ATAQUE = 5;
	private final double SALUD = 50;
	private final double ENERGIA = 20;
	private final double DEFENSA = 0;

	private Unidad unidad;
	


	@Test
	public void crearNuevoTest(){
		unidad = new Arquero(1);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa(10) , DEFENSA)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}
	
	@Test
	public void equiparEscudoTest(){
		unidad = new Arquero(1);
		unidad = new Escudo(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa(10) , DEFENSA + 10 * 0.4)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparPunialTest(){
		unidad = new Arquero(1);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa(10) , 3)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	

	@Test
	public void equiparCapaTest(){
		unidad = new Arquero(1);
		unidad = new Capa(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(), ATAQUE - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) , 0)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparEscudoCapaTest(){
		unidad = new Arquero(1);
		unidad = new Escudo(unidad);
		unidad = new Capa(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE - ATAQUE * 0.1 )   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) ,10 * 0.4)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparCapaEscudoTest(){
		unidad = new Arquero(1);
		unidad = new Capa(unidad);
		unidad = new Escudo(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE - ATAQUE * .1 )   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) ,10 * .4)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparEscudoPunialTest(){
		unidad = new Arquero(1);
		unidad = new Escudo(unidad);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),   ATAQUE + 3 )   == 0 && 
					Double.compare(unidad.getEnergia(),  ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa(10) , 10*.4 + 3 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	

	@Test
	public void equiparPunialEscudoTest(){
		unidad = new Arquero(1);
		unidad = new Punial(unidad);
		unidad = new Escudo(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),   ATAQUE + 3 )   == 0 && 
					Double.compare(unidad.getEnergia(),  ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa(10) , 10* .4 + 3 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
		
	@Test
	public void equiparPunialCapaTest(){
		unidad = new Arquero(1);
		unidad = new Punial(unidad);
		unidad = new Capa(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE +3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) , 3)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparCapaPunialTest(){
		unidad = new Arquero(1);
		unidad = new Capa(unidad);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE +3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) , 3)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
		
	@Test
	public void equiparEscudoCapaPunialTest(){
		unidad = new Arquero(1);
		unidad = new Escudo(unidad);
		unidad = new Capa(unidad);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) , 3 + 10*0.4 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparCapaEscudoPunialTest(){
		unidad = new Arquero(1);
		unidad = new Capa(unidad);
		unidad = new Escudo(unidad);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) , 3 + 10*0.4 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparCapaPunialEscudoTest(){
		unidad = new Arquero(1);
		unidad = new Capa(unidad);
		unidad = new Escudo(unidad);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) , 3 + 10*.4 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparPunialCapaEscudoTest(){
		unidad = new Arquero(1);
		unidad = new Capa(unidad);
		unidad = new Escudo(unidad);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3 - ATAQUE*.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) , 3 + 10*.4 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	
	@Test
	public void distanciaNoValidaParaCombate(){
		Unidad u1 = new Arquero(0);
		Unidad u2 = new Soldado(6);
		assertFalse(u1.puedoAtacar(u2));
		u1 = new Arquero(0);
		u2 = new Arquero(1);
		assertFalse(u1.puedoAtacar(u2));
		u1 = new Arquero(1);
		u2 = new Arquero(1);
		assertFalse(u1.puedoAtacar(u2));
	}
	
	@Test
	public void distanciaValidaParaCombate(){
		Unidad u1 = new Arquero(5);
		Unidad u2 = new Soldado(7);

		for(int i=0 ; i<4; i++){
			assertTrue(u1.puedoAtacar(u2));
			u2.avanzar();
		}
	}
	
	@Test
	public void puedeRestaurarEnergia(){
		unidad = new Arquero(1);
		unidad.atacar(new Soldado(3));
		assertTrue(unidad.puedeRestauraEnergia());
	}

	@Test
	public void agotarEnergia(){
		unidad = new Arquero(1);
		Unidad victima = new Soldado(3);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
			if(!victima.conVida())
				victima = new Soldado(3);
		}
		assertEquals(unidad.getEnergia(), 0, 0.1);
	}
	
	@Test
	public void restaurarEnergia(){
		unidad = new Arquero(1);
		Unidad victima = new Soldado(3);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
		}
		unidad.restaurarEnergia();
		assertEquals(unidad.getEnergia(), 6, 0.1);
		
	}
	

	@Test
	public void noPoderAtacarMuertos(){
		unidad = new Arquero(1);
		Unidad victima = new Arquero(3);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertFalse(unidad.puedoAtacar(victima));
	
	}
	
	@Test
	public void noAtacarMuertos(){
		unidad = new Arquero(1);
		Unidad victima = new Arquero(3);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertEquals(unidad.atacar(victima), 0, 0.1);
	
	}

	@Test
	public void noSeAutoAtaca(){

		unidad = new Arquero(1);
		assertFalse(unidad.puedoAtacar(unidad));
	}

	@Test
	public void noPoderAtacarEstandoMuerto(){
		unidad = new Arquero(1);
		Unidad victima = new Arquero(3);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertFalse(victima.puedoAtacar(unidad));
	}

	@Test
	public void noAtacarEstandoMuerto(){
		unidad = new Arquero(1);
		Unidad victima = new Arquero(3);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertEquals(victima.atacar(unidad), 0, 0.1);
	
		
	}
	
	@Test
	public void noPoderAtacarAgotado(){
		unidad = new Arquero(1);
		Unidad victima = new Arquero(3);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
			if(!victima.conVida())
				victima = new Soldado(3);
		}
		assertFalse(unidad.puedoAtacar(victima));
	}	
	
	@Test
	public void noAtacarAgotado(){
		unidad = new Arquero(1);
		Unidad victima = new Soldado(3);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
			if(!victima.conVida())
				victima = new Soldado(3);
		}
		assertEquals(unidad.atacar(victima), 0, 0.1);
		
	}
	
	
}
