package item;

import personaje.Unidad;
/**
 * @author adrian
 *
 */
public class Puñal extends ItemDecorator {
	
	public Puñal(Unidad peleable){
		super(peleable);
	}
	public double getAtaque(){
		return getUnidad().getAtaque()+3;
	}
	public double getDefensa(double valor){
		return getUnidad().getDefensa(valor)+3;
	}
	@Override
	public String toString() {
		return getUnidad() + ", Punial";
	}
	
	
	
}
