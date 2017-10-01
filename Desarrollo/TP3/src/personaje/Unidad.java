package personaje;
/**
 * @author adrian
 * <h1>Clase Unidad</h1>
 * <h4>Clase que define a la unidad basica</h4>
 * <h6>Metodos:</h6>
 *<ul>
 *		<li>getPosicion()</li>
 *		<li>conVida()</li>
 *		<li>puedoAtacar(Unidad victima)</li>
 *		<li>mismoPersonaje(Unidad victima)</li>
 *		<li>getNumero()</li>
 *		<li>consumirEnergia()</li>
 *		<li>atacar(Unidad victima)</li>
 *		<li>recibirDanio(double valor)</li>
 *		<li>setSalud(double d)</li>
 *		<li>getGastoEnergetico()</li>
 *		<li>getAtaque()</li>
 *		<li>getDefensa(double valor)</li>
 *		<li>getAtaqueBase()</li>
 *		<li>getDefensaBase()</li>
 *		<li>getEnergiaMaxima()</li>
 *		<li>puedeRestauraEnergia()</li>
 *		<li>restaurarEnergia()</li>
 *		<li>getEnergia()</li>
 *		<li>setEnergia(int d)</li>
 *		<li>getSalud() </li>
 *		<li>retroceder()</li>
 *		<li>avanzar() </li>
 *		<li>toString()</li>
 *</ul>
 *@see item.ItemDecorator
 *@see personaje.Unidad
 */
public abstract class Unidad {

	private static int count = 0;
	
	private int numero;
	
	private int posicion;
	private double salud;
	private int energia;
		
	protected Unidad(int salud, int posicion,int energia){
		this.salud = salud;
		this.posicion = posicion;
		this.energia = energia;
		this.numero = count;
		count++;
	}
	
	protected Unidad(){}
	
	public int getPosicion(){
		return posicion;
	}
	public boolean conVida(){
		return salud > 0;
	}
	
	public boolean puedoAtacar(Unidad victima){
		if(getEnergia()<=0)
			return false;
		if(victima.conVida() == false)
			return false;
		if(this.conVida() == false)
			return false;
		return !mismoPersonaje(victima);
	}
	
	public boolean mismoPersonaje(Unidad victima){
		return this.numero == victima.getNumero();
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void consumirEnergia(){
		energia -= getGastoEnergetico(); 
	}
	
	public final double atacar(Unidad victima){
		if (!puedoAtacar(victima))
			return 0;
		consumirEnergia();
		//setEnergia(getEnergia() - (int)getGastoEnergetico());
		return victima.recibirDanio(getAtaque());
	}
	
	public final double recibirDanio(double valor){
		double valorAtaqueFinal = valor - getDefensa(valor);
		if(valorAtaqueFinal < 0 )
			valorAtaqueFinal = 0;
		
		setSalud(getSalud() - valorAtaqueFinal);
		
		return valorAtaqueFinal;
	}

	public void setSalud(double d) {
		salud = d;		
	}
	public abstract double getGastoEnergetico();
	public abstract double getAtaque();
	public abstract double getDefensa(double valor);	
	public abstract double getAtaqueBase();
	public abstract double getDefensaBase();
	public abstract int getEnergiaMaxima();
	
	public boolean puedeRestauraEnergia(){
		if(energia < getEnergiaMaxima())
			return true;
		return false;
	}
	
	public abstract void restaurarEnergia();
	
	public int getEnergia(){
		return energia;
	}
	
	public void setEnergia(int d) {
		this.energia = d;	
	}

	public double getSalud() {
		return salud;
	}

	public  void retroceder() {
		this.posicion--;
	}
	public void avanzar() {
		this.posicion++;
	}

	@Override
	public String toString() {
		return "Numero=" + getNumero() + ", posicion=" + getPosicion() + ", salud=" + getSalud() + ", energia=" + getEnergia();
	}
	
	
	
	
}
