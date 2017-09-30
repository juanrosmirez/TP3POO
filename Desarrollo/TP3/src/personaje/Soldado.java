package personaje;

import item.Escudo;
import item.Peleable;
import item.Puñal;
import item.Equipo;

public class Soldado extends Unidad{

	public Soldado(int posicion){
		super(200,posicion, new Equipo(10,1,10));
	}
	

	@Override
	public boolean puedoAtacar(Unidad u){
		int distancia = Math.abs(this.getPosicion() - u.getPosicion() );
		return super.puedoAtacar(u) && distancia ==0;
	}

	@Override
	public boolean puedeRestauraEnergia() {
		return true;
	}

	@Override
	public void restaurarEnergia() {
		super.equipamiento().setEnergia(100);
	}

	
	
}
