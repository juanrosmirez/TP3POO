package personaje;

public class Caballero  extends Unidad{
	public Caballero(int posicion){
		super(200, posicion,3);
	}
	
	@Override
	public double getAtaque() {
		return 50;
	}

	@Override
	public double getDefensa() {
		return 0;
	}

	@Override
	public boolean puedoAtacar(Unidad u){
		int distancia = Math.abs(this.getPosicion() - u.getPosicion() );
		return super.puedoAtacar(u) && distancia >= 1 && distancia <= 2 ;
	}

	@Override
	public boolean puedeRestauraEnergia() {
		return true;
	}

	@Override
	public void restaurarEnergia() {
		super.setEnergia(super.getEnergia()+3);
		
	}
	@Override
	public double getAtaqueBase() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public double getDefensaBase() {
		// TODO Auto-generated method stub
		return 0;
	}

}
