package personaje;

import item.Capa;
import item.Escudo;
import item.Puñal;

public class Juego {

	public static void main(String[] args) {
		Unidad unidad = new Soldado(0);
		Unidad victima = new Soldado(0);
	
		unidad = new Capa(unidad);
		victima = new Puñal(victima);
		victima = new Escudo(victima);
		
		System.out.println(unidad);
		System.out.println(victima);

		unidad.atacar(victima);
		victima.atacar(unidad);

		System.out.println("resultado ataque");
		System.out.println(unidad);
		System.out.println(victima);
		

		System.out.println("resultado recarga");
		unidad.restaurarEnergia();
		System.out.println(unidad);
		

		System.out.println("resultado mover");
		unidad.avanzar();
		unidad.avanzar();
		unidad.avanzar();
		System.out.println(unidad);
		

		System.out.println("resultado mover");
		unidad.retroceder();
		System.out.println(unidad);
		
	}
}
