import java.util.*;
public class Batalla {

		Scanner leer = new Scanner(System.in);
		Random r = new Random();
		String nombre;
		int opcion;
		int cont = 0; 
		int conjug1 = 0;
		int conjug2 = 0;
		int elepok;		
		String jugador1;
		String jugador2; 
	public void batalla(){

			System.out.println("Hola. \nJugador 1 ingresa tu nombre");
			jugador1 = leer.next();
			System.out.println("Tu primer pokemon es Charizard");
			System.out.println("Tu segundo pokemon es Lucario");
			System.out.println("\nHola. \nJugador 2 ingresa tu nombre");
			jugador2 = leer.next();
			System.out.println("Tu primer pokemon es Pikachu");
			System.out.println("Tu segundo pokemon es Squirtle");
		do{
		Charizard op = new Charizard();
		Pikachu pk = new Pikachu();
		Lucario lc = new Lucario();
		Squirtle sq = new Squirtle();
		Pokemon pok1 = new Pokemon("Charizard",r.nextInt(50)+10, " vivo " );
		Pokemon pok2 = new Pokemon("Pikachu",r.nextInt(50)+10, " vivo" );
		Pokemon pok3 = new Pokemon("Lucario",r.nextInt(50)+10, " vivo");	
		Pokemon pok4 = new Pokemon("Squirtle",r.nextInt(50)+10, " vivo");


			System.out.println("\nElige una opcion: ");
			System.out.println("1) Empezar una batalla");
			System.out.println("2) Estadisticas");
			System.out.println("3) Salir");
			opcion = leer.nextInt();

			
	switch(opcion){
		case 1:
		if (opcion == 1 ) 

			/*System.out.println("\nElige un pokemon  ");
			System.out.println("1) Charizard");
			System.out.println("2) Pikachu");
			System.out.println("3) Lucario");
			System.out.println("3) Squirtle");
			elepok = leer.nextInt();*/		
			while (pok1.getVida() > 0 && pok2.getVida() > 0) {
			System.out.println("\nBatalla:");
			op.chariz();
			System.out.println(pok1);
			pk.pika();
			System.out.println(pok2);
			System.out.println("\nPRESIONA ENTER PARA CONTINUAR");
			leer.nextLine();
			nombre = leer.nextLine();
			op.chariz();
			System.out.println("Turno de ataque para " + pok1.getNombre());
			pok2.perderVida(pok1.atacar());
			System.out.println("PRESIONA ENTER PARA CONTINUAR");
			nombre = leer.nextLine();
			if (pok2.getVida() <= 0) {
				pk.pika();
				System.out.println(pok2.getNombre() + " ha sido derrotado\n vida = 0 \n Estado muerto");
				System.out.println("\n|~~~~~~~~~~~~~~~Jugador 1: " + jugador1 + " es el ganador~~~~~~~~~~~~~~~|");
				conjug1++;
			}

			else {
				//Turno del segundo pokemon
				op.chariz();
				System.out.println(pok1);
				pk.pika();
				System.out.println(pok2);
				System.out.println("PRESIONA ENTER PARA CONTINUAR");
				nombre = leer.nextLine();
				pk.pika();
				System.out.println("Turno de ataque para " + pok2.getNombre());
				pok1.perderVida(pok2.atacar());
				System.out.println("PRESIONA ENTER PARA CONTINUAR");
				nombre = leer.nextLine();
			
				if (pok1.getVida() <= 0){
					op.chariz();
					System.out.println( pok1.getNombre() + " ha sido derrotado \n vida = 0 \n Estado muerto ");
					System.out.println("\n|~~~~~~~~~~~~~~~Jugador 2: " + jugador2 + " es el ganador~~~~~~~~~~~~~~~|");
					conjug2++;
				}
			}
		}	
				//Empieza la 2da batalla
		if (opcion == 1 )
			while (pok3.getVida() > 0 && pok4.getVida() > 0) {
			System.out.println("\nBatalla 2");
			lc.luca();
			System.out.println(pok3);
			sq.squi();
			System.out.println(pok4);
			System.out.println("\nPRESIONA ENTER PARA CONTINUAR");
			leer.nextLine();
			nombre = leer.nextLine();
			lc.luca();
			System.out.println("Turno de ataque para " + pok3.getNombre());
			pok4.perderVida(pok3.atacar());
			System.out.println("\nPRESIONA ENTER PARA CONTINUAR");
			nombre = leer.nextLine();
			if (pok4.getVida() <= 0) {
				sq.squi();
				System.out.println(pok4.getNombre() + " ha sido derrotado\n vida = 0 \n Estado muerto");
				System.out.println("\n|~~~~~~~~~~~~~~~Jugador 1: " + jugador1 + " es el ganador~~~~~~~~~~~~~~~|");
				conjug1++;
			
			}

			else {
				//Turno del segundo pokemon
				lc.luca();
				System.out.println(pok3);
				sq.squi();
				System.out.println(pok4);
				System.out.println("PRESIONA ENTER PARA CONTINUAR");
				nombre = leer.nextLine();
				sq.squi();
				System.out.println("Turno de ataque para " + pok4.getNombre());
				pok3.perderVida(pok4.atacar());
				System.out.println("PRESIONA ENTER PARA CONTINUAR");
				nombre = leer.nextLine();
			
				if (pok3.getVida() <= 0){
					lc.luca();
					System.out.println( pok3.getNombre() + " ha sido derrotado \n vida = 0 \n Estado muerto ");
					System.out.println("\n|~~~~~~~~~~~~~~~Jugador 2: " + jugador2 + " es el ganador~~~~~~~~~~~~~~~|");
					conjug2++;

				}
			}
		}		cont++;//contador
			
		break; 
		case 2: 
					System.out.println("\nLa cantidad de batallas jugadas son " + cont); 
					System.out.println("\nLas partidas ganadas del jugador 1 son: " + conjug1 ); 
					System.out.println("\nLas partidas ganadas del jugador 2 son: " + conjug2 ); 

		break; 
	}

}while(opcion !=3 );

	}
}
  		
