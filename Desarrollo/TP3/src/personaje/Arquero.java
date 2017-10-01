package personaje;

/**
 * @author adrian
 *
 */
public class Arquero extends Unidad {
	private static final int SALUD = 50;
	private static final int ENERGIA = 20;
	private static final int ATAQUE = 5;
	private static final int DEFENSA = 0;
	
	public Arquero(int posicion) {
		super(SALUD, posicion,ENERGIA);
	}

	@Override
	public double getAtaque() {
		return ATAQUE;
	}

	@Override
	public double getDefensa(double valor) {
		return DEFENSA;
	}
	
	@Override
	public boolean puedoAtacar(Unidad u) {
		int distancia = Math.abs(this.getPosicion() - u.getPosicion() );
		return super.puedoAtacar(u) && distancia >= 2 && distancia <= 5 ;
	}

	@Override
	public boolean puedeRestauraEnergia() {
		return super.puedeRestauraEnergia();
	}

	@Override
	public void restaurarEnergia() {
		if(!puedeRestauraEnergia())
			return;
		
		double e = super.getEnergia() + 6;
		if(e > ENERGIA)
			e = ENERGIA;
		super.setEnergia(e);
		
	}
	
	@Override
	public double getAtaqueBase() {
		return ATAQUE;
	}

	@Override
	public double getDefensaBase() {
		return DEFENSA;
	}

	@Override
	public double getGastoEnergetico() {
		return 1;
	}
	@Override
	public int getEnergiaMaxima() {
		// TODO Auto-generated method stub
		return ENERGIA;
	}
	
}
