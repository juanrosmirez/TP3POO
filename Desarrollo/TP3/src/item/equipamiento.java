package item;
public class equipamiento implements Peleable{

	private double ataque;
	private double defensa;
	private int energia;
	
	public equipamiento(double ataque, double defensa, int energia){
		this.ataque = ataque;
		this.defensa = defensa; 
		this.energia = energia;
	}
	
	@Override
	public double getAtaque() {
		// TODO Auto-generated method stub
		return ataque;
	}

	@Override
	public int getEnergia() {
		// TODO Auto-generated method stub
		return energia;
	}
	public void setEnergia(int valor) {
		// TODO Auto-generated method stub
		energia = valor;
	}

	@Override
	public double getDefensa() {
		// TODO Auto-generated method stub
		return defensa;
	}
	
}