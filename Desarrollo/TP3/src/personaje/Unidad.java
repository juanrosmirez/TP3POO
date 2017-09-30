package personaje;


public abstract class Unidad {

	private int posicion;
	
	private double salud;
	private int energia;
	
	
	public Unidad(int salud, int posicion,int energia){
		this.salud = salud;
		this.posicion = posicion;
		this.energia = energia;
	}
	
	public Unidad(Unidad unidad) {
		this.salud = unidad.salud;
		this.posicion = unidad.posicion;
		this.energia = unidad.energia;
	}

	public final double atacar(Unidad u2){
		if (!puedoAtacar(u2))
			return 0;
		
		return ((Unidad) u2).recibirDanio(getAtaque());
	}
	
	public final double recibirDanio(double valor){
		double valorAtaqueFinal = valor - getDefensa();
		if(valorAtaqueFinal < 0 )
			valorAtaqueFinal = 0;
		
		salud = salud - valorAtaqueFinal;
		
		return valorAtaqueFinal;
	}
	
	public abstract double getAtaque();
	public abstract double getDefensa();	
	
	public int getEnergia(){
		return energia;
	}
	
	
	public final int getPosicion(){
		return posicion;
	}

	public boolean puedoAtacar(Unidad u){
		if(getEnergia()<=0)
			return false;
		return true;
	}

	public abstract boolean puedeRestauraEnergia();
	
	
	public void restaurarEnergia(){}

	public boolean conVida()
	{
		return salud > 0;
	}

	public void setEnergia(int i) {
		this.energia = i;
		
	}
	
}
