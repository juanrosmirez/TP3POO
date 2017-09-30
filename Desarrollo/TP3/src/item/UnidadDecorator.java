package item;

public class UnidadDecorator implements Peleable {
	private Peleable peleable;
	
	public UnidadDecorator(Peleable peleable) {
		this.peleable = peleable;
	}

	public Peleable getPeleable() {
		return peleable;
	}

	public void setPeleable(Peleable peleable) {
		this.peleable = peleable;
	}

	@Override
	public double getAtaque() {
		return 0;
	}

	@Override
	public int getEnergia() {
		return 0;
	}

	@Override
	public double getDefensa() {
		return 0;
	}
	

}