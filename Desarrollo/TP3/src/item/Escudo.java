package item;

public class Escudo extends UnidadDecorator {
	
	public Escudo(Peleable peleable){
		super(peleable);
	}
	public double getAtaque(){
		return getPeleable().getAtaque();
	}
	public int getEnergia(){
		return getPeleable().getEnergia();
	}
	public double getDefensa(){
		return getPeleable().getDefensa() +  getPeleable().getDefensa()*0.4;
	}

}
