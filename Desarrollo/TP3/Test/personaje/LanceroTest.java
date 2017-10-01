package personaje;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import item.Capa;
import item.Escudo;
import item.Punial;
/**
 * @author adrian
 *
 */
public class LanceroTest {

	private final double ATAQUE = 25;
	private final double SALUD = 150;
	private final double ENERGIA = 1;
	private final double DEFENSA = 0;
	private final double ENERGIA_CONSUMIDA = 0;
	private final int POS1=0;
	private final int POS2=1;

	private Unidad unidad;

	
	@Test
	public void crearNuevoTest() throws Exception{
		unidad = new Lancero(1);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa(10) , DEFENSA)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}
	
	@Test
	public void equiparEscudoTest() throws Exception{
		unidad = new Lancero(1);
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
	public void equiparPunialTest() throws Exception{
		unidad = new Lancero(1);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa(10) ,- 3)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	

	@Test
	public void equiparCapaTest() throws Exception{
		unidad = new Lancero(1);
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
	public void equiparEscudoCapaTest() throws Exception{
		unidad = new Lancero(1);
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
	public void equiparCapaEscudoTest() throws Exception{
		unidad = new Lancero(1);
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
	public void equiparEscudoPunialTest() throws Exception{
		unidad = new Lancero(1);
		unidad = new Escudo(unidad);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),   ATAQUE + 3 )   == 0 && 
					Double.compare(unidad.getEnergia(),  ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa(10) , 10*.4 - 3 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	

	@Test
	public void equiparPunialEscudoTest() throws Exception{
		unidad = new Lancero(1);
		unidad = new Punial(unidad);
		unidad = new Escudo(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),   ATAQUE + 3 )   == 0 && 
					Double.compare(unidad.getEnergia(),  ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa(10) , 10* .4 - 3 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
		
	@Test
	public void equiparPunialCapaTest() throws Exception{
		unidad = new Lancero(1);
		unidad = new Punial(unidad);
		unidad = new Capa(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE +3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) , -3)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparCapaPunialTest() throws Exception{
		unidad = new Lancero(1);
		unidad = new Capa(unidad);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE +3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) ,- 3)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
		
	@Test
	public void equiparEscudoCapaPunialTest() throws Exception{
		unidad = new Lancero(1);
		unidad = new Escudo(unidad);
		unidad = new Capa(unidad);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) , -3 + 10*0.4 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparCapaEscudoPunialTest() throws Exception{
		unidad = new Lancero(1);
		unidad = new Capa(unidad);
		unidad = new Escudo(unidad);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) , -3 + 10*0.4 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparCapaPunialEscudoTest() throws Exception{
		unidad = new Lancero(1);
		unidad = new Capa(unidad);
		unidad = new Escudo(unidad);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) , -3 + 10*.4 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
	
	@Test
	public void equiparPunialCapaEscudoTest() throws Exception{
		unidad = new Lancero(1);
		unidad = new Capa(unidad);
		unidad = new Escudo(unidad);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3 - ATAQUE*.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) , -3 + 10*.4 )   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	

	
	
	@Test
	public void distanciaNoValidaParaCombate() throws Exception{
		Unidad u1 = new Lancero(0);
		Unidad u2 = new Soldado(4);
		assertFalse(u1.puedoAtacar(u2));
		u1 = new Caballero(0);
		u2 = new Arquero(0);
		assertFalse(u1.puedoAtacar(u2));
	}
	
	@Test
	public void distanciaValidaParaCombate() throws Exception{
		Unidad u1 = new Lancero(5);
		Unidad u2 = new Soldado(6);

		for(int i=0 ; i<3; i++){
			assertTrue(u1.puedoAtacar(u2));
			u2.avanzar();
		}
	}
	
	@Test
	public void puedeRestaurarEnergia() throws Exception{
		unidad = new Lancero(1);
		assertFalse(unidad.puedeRestauraEnergia());
	}

	@Test
	public void agotarEnergia() throws Exception{
		unidad = new Lancero(1);
		Unidad victima = new Soldado(2);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			if(!victima.conVida())
				victima = new Soldado(3);
		}
		assertEquals(unidad.getEnergia(), ENERGIA, 0.1);
	}
	
	@Test
	public void restaurarEnergia() throws Exception{
		unidad = new Lancero(1);
		Unidad victima = new Soldado(2);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
		}
		double e = unidad.getEnergia();
		unidad.restaurarEnergia();
		assertEquals(unidad.getEnergia(), e, 0.1);
		
	}

	@Test
	public void noPoderAtacarMuertos() throws Exception{
		unidad = new Lancero(1);
		Unidad victima = new Lancero(2);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertFalse(unidad.puedoAtacar(victima));
	
	}
	
	@Test
	public void noAtacarMuertos() throws Exception{
		unidad = new Lancero(1);
		Unidad victima = new Lancero(2);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertEquals(unidad.atacar(victima), 0, 0.1);
	
	}

	@Test
	public void noSeAutoAtaca() throws Exception{

		unidad = new Lancero(1);
		assertFalse(unidad.puedoAtacar(unidad));
	}

	@Test
	public void noPoderAtacarEstandoMuerto() throws Exception{
		unidad = new Lancero(1);
		Unidad victima = new Lancero(2);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertFalse(victima.puedoAtacar(unidad));
	}

	@Test
	public void noAtacarEstandoMuerto() throws Exception{
		unidad = new Lancero(1);
		Unidad victima = new Lancero(2);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertEquals(victima.atacar(unidad), 0, 0.1);
	
		
	}

	@Test
	public void noPermiteMutipleEscudo() throws Exception{
		unidad = new Lancero(1);
		unidad = new Escudo(unidad);
		unidad = new Punial(unidad);
		try{
			unidad = new Escudo(unidad);
			assertTrue(false);
		}
		catch(Exception ex){
			unidad = new Capa(unidad);
			assertTrue(true);
		}
	}
	@Test
	public void noPermiteMutiplePunial() throws Exception{
		unidad = new Lancero(1);
		unidad = new Escudo(unidad);
		unidad = new Punial(unidad);
		try{
			unidad = new Punial(unidad);
			assertTrue(false);
		}
		catch(Exception ex){
			unidad = new Capa(unidad);
			assertTrue(true);
		}
	}
	@Test
	public void noPermiteMutipleCapa() throws Exception{
		unidad = new Lancero(1);
		unidad = new Capa(unidad);
		unidad = new Punial(unidad);
		try{
			unidad = new Capa(unidad);
			assertTrue(false);
		}
		catch(Exception ex){
			unidad = new Escudo(unidad);
			assertTrue(true);
		}
	}


	/////////////LUCHO MIRAR DESDE ACA PARA ABAJO PARA BASARTE PARA LOS OTROS TEST
	@Test
	public void baseAtacadoPorLanceroBase() throws Exception{
		unidad = new Lancero(POS1);
		Unidad atacante = new Lancero(POS2);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - ATAQUE);
	}
	@Test
	public void baseAtacadoPorLanceroConEscudo() throws Exception{
		unidad = new Lancero(POS1);
		Unidad atacante = new Lancero(POS2);
		atacante = new Escudo(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - ATAQUE);
	}
	@Test
	public void baseAtacadoPorLanceroConPunial() throws Exception{
		unidad = new Lancero(POS1);
		Unidad atacante = new Lancero(POS2);
		atacante = new Punial(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE +3));
	}
	@Test
	public void baseAtacadoPorLanceroConCapa() throws Exception{
		unidad = new Lancero(POS1);
		Unidad atacante = new Lancero(POS2);
		atacante = new Capa(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE - ATAQUE*.1));
	}
	@Test
	public void baseAtacadoPorLanceroConEscudoYPunial() throws Exception{
		unidad = new Lancero(POS1);
		Unidad atacante = new Lancero(POS2);
		atacante = new Escudo(atacante);
		atacante = new Punial(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE + 3));
	}
	@Test
	public void baseAtacadoPorLanceroConEscudoYCapa() throws Exception{
		unidad = new Lancero(POS1);
		Unidad atacante = new Lancero(POS2);
		atacante = new Escudo(atacante);
		atacante = new Capa(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE - ATAQUE*.1));
	}
	@Test
	public void baseAtacadoPorLanceroConCapaYPunial() throws Exception{
		unidad = new Lancero(POS1);
		Unidad atacante = new Lancero(POS2);
		atacante = new Capa(atacante);
		atacante = new Punial(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE - ATAQUE*0.1 + 3));
	}
	
	//////
	@Test
	public void conEscudoAtacadoPorLanceroBase() throws Exception{
		unidad = new Escudo(new Lancero(POS1));
		Unidad atacante = new Lancero(POS2);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - (ATAQUE-ATAQUE*0.4)));
	}
	
	@Test
	public void conEscudoAtacadoPorLanceroConEscudo() throws Exception{
		unidad = new Escudo(new Lancero(POS1));
		Unidad atacante =  new Escudo(new Lancero(POS2));
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - (ATAQUE-ATAQUE*0.4)));
	}
	
	@Test
	public void conEscudoAtacadoPorLanceroConPunial() throws Exception{
		unidad = new Escudo(new Lancero(POS1));
		Unidad atacante =  new Punial(new Lancero(POS2));
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - ((ATAQUE+3)-(ATAQUE+3)*.4)));
	}
	
	@Test
	public void conEscudoAtacadoPorLanceroConCapa() throws Exception{
		unidad = new Escudo(new Lancero(POS1));
		Unidad atacante =  new Capa(new Lancero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1; 
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	@Test
	public void conEscudoAtacadoPorLanceroConEscudoYPunial() throws Exception{
		unidad = new Escudo(new Lancero(POS1));
		Unidad atacante =  new Escudo(new Punial(new Lancero(POS2)));
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - ((ATAQUE+3)-(ATAQUE+3)*.4)));
	}
	
	@Test
	public void conEscudoAtacadoPorLanceroConEscudoYCapa() throws Exception{
		unidad = new Escudo(new Lancero(POS1));
		Unidad atacante =  new Escudo(new Capa(new Lancero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1; 
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	@Test
	public void conEscudoAtacadoPorLanceroConCapaYPunial() throws Exception{
		unidad = new Escudo(new Lancero(POS1));
		Unidad atacante =  new Capa(new Punial(new Lancero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1; 
		valorAtaque+=3;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	

	//////
	@Test
	public void conPunialAtacadoPorLanceroBase() throws Exception{
		unidad = new Punial(new Lancero(POS1));
		Unidad atacante =  new Lancero(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorLanceroConEscudo() throws Exception{
		unidad = new Punial(new Lancero(POS1));
		Unidad atacante =  new Escudo(new Lancero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorLanceroConPunial() throws Exception{
		unidad = new Punial(new Lancero(POS1));
		Unidad atacante =  new Punial(new Lancero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorLanceroConCapa() throws Exception{
		unidad = new Punial(new Lancero(POS1));
		Unidad atacante =  new Capa(new Lancero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * 0.1;
		valorAtaque += 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorLanceroConEscudoYPunial() throws Exception{
		unidad = new Punial(new Lancero(POS1));
		Unidad atacante =  new Escudo( new Punial(new Lancero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE+3+3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorLanceroConEscudoYCapa() throws Exception{
		unidad = new Punial(new Lancero(POS1));
		Unidad atacante =  new Capa( new Escudo(new Lancero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * 0.1;
		valorAtaque += 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorLanceroConCapaYPunial() throws Exception{
		unidad = new Punial(new Lancero(0));
		Unidad atacante =  new Capa( new Punial(new Lancero(0)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * 0.1;
		valorAtaque += 3+3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	

	//////
	@Test
	public void conCapaAtacadoPorLanceroBase() throws Exception{
		unidad = new Capa(new Lancero(POS1));
		Unidad atacante =  new Lancero(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE ;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorLanceroConEscudo() throws Exception{
		unidad = new Capa(new Lancero(POS1));
		Unidad atacante = new Escudo( new Lancero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE ;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorLanceroConPunial() throws Exception{
		unidad = new Capa(new Lancero(POS1));
		Unidad atacante = new Punial( new Lancero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorLanceroConCapa() throws Exception{
		unidad = new Capa(new Lancero(POS1));
		Unidad atacante = new Capa( new Lancero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorLanceroConEscudoYPunial() throws Exception{
		unidad = new Capa(new Lancero(POS1));
		Unidad atacante = new Escudo(new Punial( new Lancero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorLanceroConEscudoYCapa() throws Exception{
		unidad = new Capa(new Lancero(POS1));
		Unidad atacante = new Escudo(new Capa( new Lancero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaAtacadoPorLanceroConCapaYPunial() throws Exception{
		unidad = new Capa(new Lancero(POS1));
		Unidad atacante = new Punial(new Capa( new Lancero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	
	//////
	@Test
	public void conCapaYEscudoAtacadoPorLanceroBase() throws Exception{
		unidad = new Escudo(new Capa(new Lancero(POS1)));
		Unidad atacante = new Lancero(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.4;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorLanceroConEscudo() throws Exception{
		unidad = new Escudo(new Capa(new Lancero(POS1)));
		Unidad atacante = new Escudo(new Lancero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.4;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorLanceroConPunial() throws Exception{
		unidad = new Escudo(new Capa(new Lancero(POS1)));
		Unidad atacante = new Punial(new Lancero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorLanceroConCapa() throws Exception{
		unidad = new Escudo(new Capa(new Lancero(POS1)));
		Unidad atacante = new Capa(new Lancero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorLanceroConEscudoYPunial() throws Exception{
		unidad = new Escudo(new Capa(new Lancero(POS1)));
		Unidad atacante = new Escudo( new Punial(new Lancero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorLanceroConEscudoYCapa() throws Exception{
		unidad = new Escudo(new Capa(new Lancero(POS1)));
		Unidad atacante =new Escudo( new Capa(new Lancero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conCapaYEscudoAtacadoPorLanceroConCapaYPunial() throws Exception{
		unidad = new Escudo(new Capa(new Lancero(POS1)));
		Unidad atacante = new Punial( new Capa(new Lancero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1 + 3;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
//////
	@Test
	public void conPunialYEscudoAtacadoPorLanceroBase() throws Exception{
		unidad = new Escudo(new Punial(new Lancero(POS1)));
		Unidad atacante = new Lancero(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorLanceroConEscudo() throws Exception{
		unidad = new Escudo(new Punial(new Lancero(POS1)));
		Unidad atacante = new Escudo(new Lancero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorLanceroConPunial() throws Exception{
		unidad = new Escudo(new Punial(new Lancero(POS1)));
		Unidad atacante =new Punial( new Lancero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorLanceroConCapa() throws Exception{
		unidad = new Escudo(new Punial(new Lancero(POS1)));
		Unidad atacante =new Capa( new Lancero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * 0.1;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorLanceroConEscudoYPunial() throws Exception{
		unidad = new Escudo(new Punial(new Lancero(POS1)));
		Unidad atacante =new Escudo(new Punial( new Lancero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorLanceroConEscudoYCapa() throws Exception{
		unidad = new Escudo(new Punial(new Lancero(POS1)));
		Unidad atacante =new Escudo(new Capa( new Lancero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE -ATAQUE * 0.1;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYEscudoAtacadoPorLanceroConCapaYPunial() throws Exception{
		unidad = new Escudo(new Punial(new Lancero(POS1)));
		Unidad atacante =new Punial(new Capa( new Lancero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE -ATAQUE * 0.1 +3;
		valorAtaque = valorAtaque - valorAtaque*.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	//////
	@Test
	public void conPunialYCapaAtacadoPorLanceroBase() throws Exception{
		unidad = new Capa(new Punial(new Lancero(POS1)));
		Unidad atacante =new Lancero(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorLanceroConEscudo() throws Exception{
		unidad = new Capa(new Punial(new Lancero(POS1)));
		Unidad atacante = new Escudo(new Lancero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorLanceroConPunial() throws Exception{
		unidad = new Capa(new Punial(new Lancero(POS1)));
		Unidad atacante = new Punial(new Lancero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE+3;
		valorAtaque = valorAtaque  + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorLanceroConCapa() throws Exception{
		unidad = new Capa(new Punial(new Lancero(POS1)));
		Unidad atacante = new Capa(new Lancero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorLanceroConEscudoYPunial() throws Exception{
		unidad = new Capa(new Punial(new Lancero(POS1)));
		Unidad atacante = new Escudo(new Punial(new Lancero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE +3;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorLanceroConEscudoYCapa() throws Exception{
		unidad = new Capa(new Punial(new Lancero(POS1)));
		Unidad atacante = new Escudo(new Capa(new Lancero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialYCapaAtacadoPorLanceroConCapaYPunial() throws Exception{
		unidad = new Capa(new Punial(new Lancero(POS2)));
		Unidad atacante = new Punial(new Capa(new Lancero(POS1)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE *0.1 + 3;
		valorAtaque = valorAtaque + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	
	//////
	@Test
	public void conPunialCapaYEscudoAtacadoPorLanceroBase() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Lancero(POS1))));
		Unidad atacante = new Lancero(POS2);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorLanceroConEscudo() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Lancero(POS1))));
		Unidad atacante = new Escudo( new Lancero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorLanceroConPunial() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Lancero(POS1))));
		Unidad atacante = new Punial( new Lancero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorLanceroConCapa() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Lancero(POS1))));
		Unidad atacante = new Capa( new Lancero(POS2));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*0.1;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorLanceroConEscudoYPunial() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Lancero(POS1))));
		Unidad atacante = new Escudo(new Punial( new Lancero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorLanceroConEscudoYCapa() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Lancero(POS1))));
		Unidad atacante = new Escudo(new Capa( new Lancero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * .1;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorLanceroConCapaYPunial() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Lancero(POS1))));
		Unidad atacante = new Punial(new Capa( new Lancero(POS2)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * .1 + 3;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialCapaYEscudoAtacadoPorLanceroConCapaPunialYEscudo() throws Exception{
		unidad = new Capa(new Escudo(new Punial(new Lancero(POS1))));
		Unidad atacante = new Escudo(new Punial(new Capa( new Lancero(POS2))));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * .1 + 3;
		valorAtaque = valorAtaque - valorAtaque*0.4 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	
	///DESPUES ABRIA QUE REPETIR TODO LO MISMO PERO AHORA UN Lancero ATACADO POR UN ARQUERO LUEGO POR UN CABALLERO Y LUEGO POR UN Soldado
}

	

