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
public class SoldadoTest {
	private final double ATAQUE = 10;
	private final double SALUD = 200;
	private final double ENERGIA = 100;
	private final double DEFENSA = 0;
	private final double ENERGIA_CONSUMIDA = 10;

	private Unidad unidad;
	
	@Test
	public void crearNuevoTest(){
		unidad = new Soldado(1);
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
		unidad = new Soldado(1);
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
		unidad = new Soldado(1);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE + 3)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA)  == 0 &&
					Double.compare(unidad.getDefensa(10) , -3)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	

	@Test
	public void equiparCapaTest(){
		unidad = new Soldado(1);
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
		unidad = new Soldado(1);
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
		unidad = new Soldado(1);
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
		unidad = new Soldado(1);
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
	public void equiparPunialEscudoTest(){
		unidad = new Soldado(1);
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
	public void equiparPunialCapaTest(){
		unidad = new Soldado(1);
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
	public void equiparCapaPunialTest(){
		unidad = new Soldado(1);
		unidad = new Capa(unidad);
		unidad = new Punial(unidad);
		assertTrue(
					Double.compare(unidad.getPosicion(), 1)   == 0 &&
					Double.compare(unidad.getAtaque(),  ATAQUE +3 - ATAQUE*0.1)   == 0 && 
					Double.compare(unidad.getEnergia(), ENERGIA * 2)  == 0 &&
					Double.compare(unidad.getDefensa(10) , -3)   == 0 && 
					Double.compare(unidad.getSalud(),    SALUD) == 0
				  );
	}	
		
	@Test
	public void equiparEscudoCapaPunialTest(){
		unidad = new Soldado(1);
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
	public void equiparCapaEscudoPunialTest(){
		unidad = new Soldado(1);
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
	public void equiparCapaPunialEscudoTest(){
		unidad = new Soldado(1);
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
	public void equiparPunialCapaEscudoTest(){
		unidad = new Soldado(1);
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
	public void distanciaNoValidaParaCombate(){
		Unidad u1 = new Soldado(4);
		Unidad u2 = new Soldado(100);
		assertFalse(u1.puedoAtacar(u2));
	}
	
	@Test
	public void distanciaValidaParaCombate(){
		Unidad u1 = new Soldado(2);
		Unidad u2 = new Soldado(2);
		assertTrue(u1.puedoAtacar(u2));
	}

	@Test
	public void puedeRestaurarEnergia(){
		unidad = new Soldado(1);
		unidad.atacar(new Soldado(1));
		assertTrue(unidad.puedeRestauraEnergia());
	}

	@Test
	public void agotarEnergia(){
		unidad = new Soldado(1);
		Unidad victima = new Soldado(1);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
			if(!victima.conVida())
				victima = new Soldado(3);
		}
		assertEquals(unidad.getEnergia(), 0, 0.1);
	}
	
	@Test
	public void restaurarEnergia(){
		unidad = new Soldado(1);
		Unidad victima = new Soldado(1);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
		}
		unidad.restaurarEnergia();
		assertEquals(unidad.getEnergia(), ENERGIA, 0.1);
		
	}

	@Test
	public void noPoderAtacarMuertos(){
		unidad = new Soldado(1);
		Unidad victima = new Soldado(1);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertFalse(unidad.puedoAtacar(victima));
	
	}
	
	@Test
	public void noAtacarMuertos(){
		unidad = new Soldado(1);
		Unidad victima = new Soldado(1);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertEquals(unidad.atacar(victima), 0, 0.1);
	
	}

	@Test
	public void noSeAutoAtaca(){

		unidad = new Soldado(1);
		assertFalse(unidad.puedoAtacar(unidad));
	}

	@Test
	public void noPoderAtacarEstandoMuerto(){
		unidad = new Soldado(1);
		Unidad victima = new Soldado(1);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertFalse(victima.puedoAtacar(unidad));
	}

	@Test
	public void noAtacarEstandoMuerto(){
		unidad = new Soldado(1);
		Unidad victima = new Soldado(1);
		while(victima.conVida()){
			unidad.atacar(victima);
			unidad.restaurarEnergia();
		}
		assertEquals(victima.atacar(unidad), 0, 0.1);
	
		
	}
	
	@Test
	public void noPoderAtacarAgotado(){
		unidad = new Soldado(1);
		Unidad victima = new Soldado(1);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
			if(!victima.conVida())
				victima = new Soldado(3);
		}
		assertTrue(victima.puedoAtacar(unidad));
	}	
	
	@Test
	public void noAtacarAgotado(){
		unidad = new Soldado(1);
		Unidad victima = new Soldado(1);
		for(double i = ENERGIA ; i>0 ; i-= 1){
			unidad.atacar(victima);
			if(!victima.conVida())
				victima = new Soldado(3);
		}
		assertEquals(unidad.atacar(victima), 0, 0.1);
		
	}

	@Test
	public void noReponerEnergiaSiEstaAlPalo(){
		unidad = new Soldado(1);
		assertFalse(unidad.puedeRestauraEnergia());
		
	}

	/////////////LUCHO MIRAR DESDE ACA PARA ABAJO
	@Test
	public void baseAtacadoPorSoldadoBase(){
		unidad = new Soldado(0);
		Unidad atacante = new Soldado(0);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - ATAQUE);
	}
	@Test
	public void baseAtacadoPorSoldadoConEscudo(){
		unidad = new Soldado(0);
		Unidad atacante = new Soldado(0);
		atacante = new Escudo(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - ATAQUE);
	}
	@Test
	public void baseAtacadoPorSoldadoConPunial(){
		unidad = new Soldado(0);
		Unidad atacante = new Soldado(0);
		atacante = new Punial(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE +3));
	}
	@Test
	public void baseAtacadoPorSoldadoConCapa(){
		unidad = new Soldado(0);
		Unidad atacante = new Soldado(0);
		atacante = new Capa(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE - ATAQUE*.1));
	}
	@Test
	public void baseAtacadoPorSoldadoConEscudoYPunial(){
		unidad = new Soldado(0);
		Unidad atacante = new Soldado(0);
		atacante = new Escudo(atacante);
		atacante = new Punial(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE + 3));
	}
	@Test
	public void baseAtacadoPorSoldadoConEscudoYCapa(){
		unidad = new Soldado(0);
		Unidad atacante = new Soldado(0);
		atacante = new Escudo(atacante);
		atacante = new Capa(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE - ATAQUE*.1));
	}
	@Test
	public void baseAtacadoPorSoldadoConCapaYPunial(){
		unidad = new Soldado(0);
		Unidad atacante = new Soldado(0);
		atacante = new Capa(atacante);
		atacante = new Punial(atacante);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == SALUD - (ATAQUE - ATAQUE*0.1 + 3));
	}
	
	//////
	@Test
	public void conEscudoAtacadoPorSoldadoBase(){
		unidad = new Escudo(new Soldado(0));
		Unidad atacante = new Soldado(0);
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - (ATAQUE-ATAQUE*0.4)));
	}
	
	@Test
	public void conEscudoAtacadoPorSoldadoConEscudo(){
		unidad = new Escudo(new Soldado(0));
		Unidad atacante =  new Escudo(new Soldado(0));
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - (ATAQUE-ATAQUE*0.4)));
	}
	
	@Test
	public void conEscudoAtacadoPorSoldadoConPunial(){
		unidad = new Escudo(new Soldado(0));
		Unidad atacante =  new Punial(new Soldado(0));
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - ((ATAQUE+3)-(ATAQUE+3)*.4)));
	}
	
	@Test
	public void conEscudoAtacadoPorSoldadoConCapa(){
		unidad = new Escudo(new Soldado(0));
		Unidad atacante =  new Capa(new Soldado(0));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1; 
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	@Test
	public void conEscudoAtacadoPorSoldadoConEscudoYPunial(){
		unidad = new Escudo(new Soldado(0));
		Unidad atacante =  new Escudo(new Punial(new Soldado(0)));
		atacante.atacar(unidad);
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - ((ATAQUE+3)-(ATAQUE+3)*.4)));
	}
	
	@Test
	public void conEscudoAtacadoPorSoldadoConEscudoYCapa(){
		unidad = new Escudo(new Soldado(0));
		Unidad atacante =  new Escudo(new Capa(new Soldado(0)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1; 
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	
	@Test
	public void conEscudoAtacadoPorSoldadoConCapaYPunial(){
		unidad = new Escudo(new Soldado(0));
		Unidad atacante =  new Capa(new Punial(new Soldado(0)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE*.1; 
		valorAtaque+=3;
		valorAtaque = valorAtaque - valorAtaque*.4;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	

	//////
	@Test
	public void conPunialAtacadoPorSoldadoBase(){
		unidad = new Punial(new Soldado(0));
		Unidad atacante =  new Soldado(0);
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorSoldadoConEscudo(){
		unidad = new Punial(new Soldado(0));
		Unidad atacante =  new Escudo(new Soldado(0));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorSoldadoConPunial(){
		unidad = new Punial(new Soldado(0));
		Unidad atacante =  new Punial(new Soldado(0));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE + 3 + 3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorSoldadoConCapa(){
		unidad = new Punial(new Soldado(0));
		Unidad atacante =  new Capa(new Soldado(0));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * 0.1;
		valorAtaque += 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorSoldadoConEscudoYPunial(){
		unidad = new Punial(new Soldado(0));
		Unidad atacante =  new Escudo( new Punial(new Soldado(0)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE+3+3;
		assertTrue(atacante.getEnergia() == ENERGIA - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorSoldadoConEscudoYCapa(){
		unidad = new Punial(new Soldado(0));
		Unidad atacante =  new Capa( new Escudo(new Soldado(0)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * 0.1;
		valorAtaque += 3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	@Test
	public void conPunialAtacadoPorSoldadoConCapaYPunial(){
		unidad = new Punial(new Soldado(0));
		Unidad atacante =  new Capa( new Punial(new Soldado(0)));
		atacante.atacar(unidad);
		double valorAtaque = ATAQUE - ATAQUE * 0.1;
		valorAtaque += 3+3;
		assertTrue(atacante.getEnergia() == ENERGIA*2 - ENERGIA_CONSUMIDA && unidad.getSalud() == (SALUD - valorAtaque));
	}
	

	//////
	@Test
	public void conCapaAtacadoPorSoldadoBase(){
	}
	@Test
	public void conCapaAtacadoPorSoldadoConEscudo(){
	}
	@Test
	public void conCapaAtacadoPorSoldadoConPunial(){
	}
	@Test
	public void conCapaAtacadoPorSoldadoConCapa(){
	}
	@Test
	public void conCapaAtacadoPorSoldadoConEscudoYPunial(){
	}
	@Test
	public void conCapaAtacadoPorSoldadoConEscudoYCapa(){
	}
	@Test
	public void conCapaAtacadoPorSoldadoConCapaYPunial(){
	}
	
	
	//////
	@Test
	public void conCapaYEscudoAtacadoPorSoldadoBase(){
	}
	@Test
	public void conCapaYEscudoAtacadoPorSoldadoConEscudo(){
	}
	@Test
	public void conCapaYEscudoAtacadoPorSoldadoConPunial(){
	}
	@Test
	public void conCapaYEscudoAtacadoPorSoldadoConCapa(){
	}
	@Test
	public void conCapaYEscudoAtacadoPorSoldadoConEscudoYPunial(){
	}
	@Test
	public void conCapaYEscudoAtacadoPorSoldadoConEscudoYCapa(){
	}
	@Test
	public void conCapaYEscudoAtacadoPorSoldadoConCapaYPunial(){
	}
	
//////
	@Test
	public void conPunialYEscudoAtacadoPorSoldadoBase(){
	}
	@Test
	public void conPunialYEscudoAtacadoPorSoldadoConEscudo(){
	}
	@Test
	public void conPunialYEscudoAtacadoPorSoldadoConPunial(){
	}
	@Test
	public void conPunialYEscudoAtacadoPorSoldadoConCapa(){
	}
	@Test
	public void conPunialYEscudoAtacadoPorSoldadoConEscudoYPunial(){
	}
	@Test
	public void conPunialYEscudoAtacadoPorSoldadoConEscudoYCapa(){
	}
	@Test
	public void conPunialYEscudoAtacadoPorSoldadoConCapaYPunial(){
	}
	
	//////
	@Test
	public void conPunialYCapaAtacadoPorSoldadoBase(){
	}
	@Test
	public void conPunialYCapaAtacadoPorSoldadoConEscudo(){
	}
	@Test
	public void conPunialYCapaAtacadoPorSoldadoConPunial(){
	}
	@Test
	public void conPunialYCapaAtacadoPorSoldadoConCapa(){
	}
	@Test
	public void conPunialYCapaAtacadoPorSoldadoConEscudoYPunial(){
	}
	@Test
	public void conPunialYCapaAtacadoPorSoldadoConEscudoYCapa(){
	}
	@Test
	public void conPunialYCapaAtacadoPorSoldadoConCapaYPunial(){
	}
	
	///DESPUES ABRIA QUE REPETIR TODO LO MISMO PERO AHORA UN SOLDADO ATACADO POR UN ARQUERO LUEGO POR UN CABALLERO Y LUEGO POR UN LANCERO
}
