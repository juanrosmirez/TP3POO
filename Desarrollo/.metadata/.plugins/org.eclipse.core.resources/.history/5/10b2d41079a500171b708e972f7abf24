package personaje;

import item.Capa;
import item.Escudo;
import item.Peleable;
import item.Puñal;
import item.equipamiento;

public abstract class Unidad{

	private double salud;
	private int posicion;
	
	private Peleable equipo;
	
	public void equiparEscudo(){
		equipo = new Escudo(equipo);
	}
	public void equiparPunial(){
		equipo = new Puñal(equipo);
	}
	public void equiparCapa(){
		equipo = new Capa(equipo);
	}
	
	public Unidad(int salud, int posicion, equipamiento equipo){
		this.salud = salud;
		this.posicion = posicion;
		this.equipo = equipo;
	}
	
	public final double atacar(Unidad u){
		if (!puedoAtacar(u))
			return 0;
		
		return u.recibirDanio(this.equipo.getAtaque());
	}
	
	public final double recibirDanio(double valor){
		double valorAtaqueFinal = valor - equipo.getDefensa();
		if(valorAtaqueFinal < 0 )
			valorAtaqueFinal = 0;
		
		salud = salud - valorAtaqueFinal;
		
		return valorAtaqueFinal;
	}
	

	public final int getPosicion(){
		return posicion;
	}

	public boolean puedoAtacar(Unidad u){
		if(equipo.getEnergia()<=0)
			return false;
		return true;
	}

	public abstract boolean puedeRestauraEnergia();
	
	
	public void restaurarEnergia(){}

	public boolean conVida()
	{
		return salud > 0;
	}
	public equipamiento equipamiento() {
		return (item.equipamiento) equipo;
	}


		
}
