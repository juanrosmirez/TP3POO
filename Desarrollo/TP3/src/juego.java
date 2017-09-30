import item.Personaje;
import personaje.Soldado;
import personaje.Unidad;

public class juego {

	public static void main(String[] args) {
		
		Personaje u1 = new Personaje(new Soldado(200));
		Personaje u2 = new Personaje(new Soldado(200));
		
		
		
		System.out.println(u1.puedoAtacar(u2));
		System.out.println(u2.conVida());
		for(int i = 1 ; i <= 20 ; i++ )
			u1.atacar(u2);
		System.out.println(u2.conVida());
		
	}

}
