import item.Capa;
import item.Peleable;
import item.Personaje;
import personaje.Soldado;
import personaje.Unidad;

public class juego {

	public static void main(String[] args) {
		
		Peleable u1 = new Soldado(200);
		u1 = new Capa(u1);
		Peleable u2 = new Soldado(200);
		u1 = new Capa(u1);
		
		
		System.out.println(u1.puedoAtacar(u2));
		System.out.println(u2.conVida());
		for(int i = 1 ; i <= 20 ; i++ )
			u1.atacar(u2);
		System.out.println(u2.conVida());
		
	}

}
