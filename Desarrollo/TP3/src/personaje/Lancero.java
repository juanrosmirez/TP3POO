package personaje;

import item.equipamiento;

public class Lancero  extends Unidad{

	public Lancero(int posicion){
		super(150,posicion,new equipamiento(25,0,1));
	}
	
	@Override
	public boolean puedoAtacar(Unidad u){
		int distancia = Math.abs(this.getPosicion() - u.getPosicion() );
		return super.puedoAtacar(u) && distancia >= 1 && distancia <= 3 ;
	}

	@Override
	public boolean puedeRestauraEnergia() {
		return false;
	}


	
}
