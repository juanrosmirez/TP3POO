package item;

import personaje.Unidad;

/**
 * @author adrian
 * <h1>Clse Escudo</h1>
 * <h4>Clase que permite agregar las funcionalidades que implica el poseer una escudo</h4>
 * <h5>DEFENSA: 40% mas </h5>
 * <h6>Metodos:</h6>
 *<ul>
 *		<li>getAtaque()</li>
 *		<li>getEnergia()</li>
 *		<li>getDefensa()</li>
 *		<li>puedeRestauraEnergia()</li>
 *		<li>getAtaqueBase()</li>
 *		<li>getDefensaBase()</li>
 *		<li>getGastoEnergetico()</li>
 *		<li>getEnergiaMaxima()</li>
 *</ul>
 *@see item.ItemDecorator
 *@see personaje.Unidad
 */
public class Escudo extends ItemDecorator {

	/**
	 * CONSTRUCTOR REQUERIDO POR EL PATRON
	 */
	public Escudo(Unidad peleable){
		super(peleable);
	}
	/**
	 * Devuelve el danio producido por el ataque portando un escudo
	 * */
	public double getAtaque(){
		return getPeleable().getAtaque();
	}
	/**
	 * Devuelve la energia que se tiene portando un escudo
	 * */
	public int getEnergia(){
		return getPeleable().getEnergia();
	}
	/**
	 * Devuelve la nueva defensa que se adquiere por portar un escudo
	 * */
	public double getDefensa(){
		return getPeleable().getDefensa() +  getPeleable().getDefensaBase()*0.4;
	}
	/**
	 * Devuelve la posibilidad de restaurar la energia. El escudo no afecta esta caracteristica
	 * */
	public boolean puedeRestauraEnergia() {
		return getPeleable().puedeRestauraEnergia();
	}

	/**
	 * Devuelve el valor del ataque sin portar items
	 * */
	public double getAtaqueBase() {
		return getPeleable().getAtaqueBase();
	}

	/**
	 * Devuelve el valor de la defensa sin portar items
	 * */
	public double getDefensaBase() {
		// TODO Auto-generated method stub
		return getPeleable().getDefensaBase();
	}
	/**
	 * Devuelve el gasto que implica  atacar sin portar items
	 * */
	public double getGastoEnergetico() {
		return getPeleable().getGastoEnergetico();
	}

	/**
	 * Devuelve la energia maxima que se puede adquirir
	 * */
	public int getEnergiaMaxima() {
		// TODO Auto-generated method stub
		return getPeleable().getEnergiaMaxima();
	}
}
