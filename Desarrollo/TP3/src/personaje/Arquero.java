package personaje;


public class Arquero extends Unidad {
	public Arquero(int posicion) {
		super(50, posicion,20);
	}

	@Override
	public double getAtaque() {
		return 5;
	}

	@Override
	public double getDefensa() {
		return 1;
	}
	
	@Override
	public boolean puedoAtacar(Unidad u) {
		int distancia = Math.abs(this.getPosicion() - u.getPosicion() );
		return super.puedoAtacar(u) && distancia >= 2 && distancia <= 5 ;
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
		return 5;
	}

	@Override
	public double getDefensaBase() {
		// TODO Auto-generated method stub
		return 1;
	}
	
}
