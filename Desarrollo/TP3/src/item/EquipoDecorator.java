package item;

import personaje.Unidad;

public abstract class EquipoDecorator extends Unidad {
	private Unidad peleable;

	public EquipoDecorator(Unidad peleable) {
		super(peleable);
		this.peleable = peleable;
	}

	public Unidad getPeleable() {
		return peleable;
	}

	public void setPeleable(Unidad peleable) {
		this.peleable = peleable;
	}
	
	public double getAtaque() {
		return 0;
	}

	public int getEnergia() {
		return 0;
	}

	public double getDefensa() {
		return 0;
	}

	

}
