package personaje;
/**
 * @author adrian
 *
 */
public class Caballero  extends Unidad{
	private static final int SALUD = 200;
	private static final int ENERGIA = 3;
	private static final int ATAQUE = 50;
	private static final int DEFENSA = 1;
	
	public Caballero(int posicion){
		super(SALUD, posicion,ENERGIA);
	}
	
	@Override
	public double getAtaque() {
		return ATAQUE;
	}

	@Override
	public double getDefensa() {
		return DEFENSA;
	}

	@Override
	public boolean puedoAtacar(Unidad u){
		int distancia = Math.abs(this.getPosicion() - u.getPosicion() );
		return super.puedoAtacar(u) && distancia >= 1 && distancia <= 2 ;
	}

	@Override
	public boolean puedeRestauraEnergia() {
		return super.puedeRestauraEnergia();
	}

	@Override
	public void restaurarEnergia() {
		if(!puedeRestauraEnergia())
			return;
		
		int e = super.getEnergia()+3;
		if(e>ENERGIA)
			e= ENERGIA;
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
