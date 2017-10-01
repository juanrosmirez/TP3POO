package item;

import personaje.Unidad;
/**
 * @author adrian
 *
 */
public abstract class ItemDecorator extends Unidad {
	private Unidad unidad;

	public ItemDecorator(Unidad peleable) {
		this.unidad = peleable;
	}

	public Unidad getUnidad() {
		return this.unidad;
	}

	public boolean conVida(){
		return this.unidad.conVida();
	}

	public boolean mismoPersonaje(Unidad victima){
		return this.unidad.mismoPersonaje(victima);
	}

	public int getNumero() {
		return this.unidad.getNumero();
	}

	public double getSalud(){
		return this.unidad.getSalud();
	}

	public int getPosicion(){
		return this.unidad.getPosicion();
	}
	
	public void setSalud(double d) {
		this.unidad.setSalud(d);		
	}

	public void setEnergia(int d) {
		this.unidad.setEnergia(d);		
	}
	
	public boolean puedeRestauraEnergia() {
		return  this.unidad.puedeRestauraEnergia();
	}

	public double getAtaqueBase() {
		return  this.unidad.getAtaqueBase();
	}

	public double getDefensaBase() {
		return  this.unidad.getDefensaBase();
	}

	@Override
	public double getGastoEnergetico() {
		return  this.unidad.getGastoEnergetico()/2;
	}

	public int getEnergiaMaxima() {
		return  this.unidad.getEnergiaMaxima()*2;
	}
	
	//no se si pueden ser abstract
	public double getAtaque(){
		return this.unidad.getAtaque();
	}
	public int getEnergia() {

		return this.unidad.getEnergia();
	}
	public double getDefensa() {
		return this.unidad.getDefensa();
	}

	

}
