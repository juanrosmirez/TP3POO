import item.Capa;
import item.Escudo;
import item.Puñal;
import personaje.Arquero;
import personaje.Soldado;
import personaje.Unidad;

public class juego {

	public static void main(String[] args) {
		
		Unidad u1 = new Soldado(200);
		Unidad u2 = new Arquero(200);

		u2 = new Puñal(u2);
		System.out.println(u2.getAtaque());
		System.out.println(u1.puedoAtacar(u2));
		System.out.println(u2.conVida());
		for(int i = 1 ; i <= 23 ; i++ )
			u1.atacar( u2);
		System.out.println( u2.conVida());
		
	}

}
