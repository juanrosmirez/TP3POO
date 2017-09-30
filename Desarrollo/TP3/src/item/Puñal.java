package item;

public class Puñal extends EquipoDecorator {
	
	public Puñal(Peleable peleable){
		super(peleable);
	}
	public double getAtaque(){
		return getPeleable().getAtaque()+3;
	}
	public int getEnergia(){
		return getPeleable().getEnergia();
	}
	public double getDefensa(){
		return getPeleable().getDefensa()-3;
	}
}
