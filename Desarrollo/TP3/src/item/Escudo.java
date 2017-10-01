package item;

import personaje.Unidad;

/**
 * @author adrian
 * <h1>Clase Escudo</h1>
 * <h4>Clase que permite agregar las funcionalidades que implica el poseer una escudo</h4>
 * <h5>DEFENSA: 40% mas </h5>
 * <h6>Metodos:</h6>
 *<ul>
 *		<li>getDefensa()</li>
 *		<li>toString()</li>
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
	 * Devuelve la nueva defensa que se adquiere por portar un escudo
	 * */
	public double getDefensa(double valor){
		return getUnidad().getDefensa(valor) +  valor*0.4;
	}

	/**
	 * Imprime el estado del personaje con sus item
	 * */
	public String toString() {
		return getUnidad() + ", Escudo";
	}
	

}
