package personaje;

public abstract class Unidad {

	private int posicion;
	private double salud;
	private int energia;
		
	protected Unidad(int salud, int posicion,int energia){
		this.salud = salud;
		this.posicion = posicion;
		this.energia = energia;
	}
	
	protected Unidad(Unidad unidad) {
		this.salud = unidad.salud;
		this.posicion = unidad.posicion;
		this.energia = unidad.energia;
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
		return true;
	}
	
	public final double atacar(Unidad victima){
		if (!puedoAtacar(victima))
			return 0;
		return victima.recibirDanio(getAtaque());
	}
	protected final double recibirDanio(double valor){
		double valorAtaqueFinal = valor - getDefensa();
		if(valorAtaqueFinal < 0 )
			valorAtaqueFinal = 0;
		
		salud = salud - valorAtaqueFinal;
		
		return valorAtaqueFinal;
	}
	
	public abstract double getAtaque();
	public abstract double getDefensa();	
	public abstract boolean puedeRestauraEnergia();
	
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
