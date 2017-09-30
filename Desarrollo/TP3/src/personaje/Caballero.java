package personaje;

import item.Equipo;

public class Caballero  extends Unidad{
	public Caballero(int posicion){
		super(200, posicion,new Equipo(50,0,3));
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
		super.equipamiento().setEnergia(super.equipamiento().getEnergia()+3);
		
	}

}
