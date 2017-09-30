package personaje;

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
	
	protected Unidad(Unidad unidad) {
		this.salud = unidad.salud;
		this.posicion = unidad.posicion;
		this.energia = unidad.energia;
		this.numero = count;
		count++;
	}

	protected final int getPosicion(){
		return posicion;
	}
	public final boolean conVida()
	{
		return salud > 0;
	}
	public boolean puedoAtacar(Unidad victima){
		if(getEnergia()<=0)
			return false;
		if(victima.conVida() == false)
			return false;
		if(this.conVida() == false)
			return false;
		if(this.numero == victima.getNumero())
			return false;
		return true;
	}
	
	private int getNumero() {
		// TODO Auto-generated method stub
		return numero;
	}

	public final double atacar(Unidad victima){
		if (!puedoAtacar(victima))
			return 0;
		energia -= getGastoEnergetico();
		return victima.recibirDanio(getAtaque());
	}
	protected final double recibirDanio(double valor){
		double valorAtaqueFinal = valor - getDefensa();
		if(valorAtaqueFinal < 0 )
			valorAtaqueFinal = 0;
		
		salud = salud - valorAtaqueFinal;
		
		return valorAtaqueFinal;
	}

	public abstract double getGastoEnergetico();
	public abstract double getAtaque();
	public abstract double getDefensa();	
	public boolean puedeRestauraEnergia(){
		if(energia < getEnergiaMaxima())
			return true;
		return false;
	}
	
	public abstract int getEnergiaMaxima();
	
	public void restaurarEnergia(){}
	
	public int getEnergia(){
		return energia;
	}
	public void setEnergia(int i) {
		this.energia = i;	
	}

	public double getSalud() {
		return salud;
	}
	
	public abstract double getAtaqueBase();
	public abstract double getDefensaBase();

	public final void retroceder() {
		this.posicion--;
	}
	public final void avanzar() {
		this.posicion++;
	}
	
}
