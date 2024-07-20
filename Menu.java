
import java.util.*;
public class Menu{
		Scanner leer = new Scanner(System.in);
		Random r = new Random();
		int opcion;
	public void menupok(){
//menu
		Charizard op = new Charizard();
		Pikachu pk = new Pikachu();
		Lucario lc = new Lucario();
		Squirtle sq = new Squirtle();
		Pokemon pok1 = new Pokemon("Charizard",r.nextInt(50)+10, " vivo " );
		Pokemon pok2 = new Pokemon("Pikachu",r.nextInt(50)+10, " vivo" );
		Pokemon pok3 = new Pokemon("Lucario",r.nextInt(50)+10, " vivo");	
		Pokemon pok4 = new Pokemon("Squirtle",r.nextInt(50)+10, " vivo");
//ELECCION DEL PRIMER JUAGADRO
			System.out.println("Jugador 1 elije tu primer pokemon ");
			System.out.println("1) Charizard ");
			System.out.println("2) Pikachu ");
			System.out.println("3) Lucario ");
			System.out.println("4) Squirtle ");
			opcion = leer.nextInt();
		switch(opcion){
		case 1:

			System.out.println("Tu pokemon primer pokemon es Charizard");
					
			System.out.println(pok1);


		break;
	case 2:
		System.out.println("Tu pokemon primer pokemon es Pikachu");
		
			System.out.println(pok2);

		break;
	case 3:
		System.out.println("Tu pokemon primer pokemon es Lucario");
		
			System.out.println(pok3);

		break;
	case 4:
		System.out.println("Tu pokemon primer pokemon es Squirtle");
		
			System.out.println(pok4);

		}
		System.out.println("Jugador 1 elije tu segundo pokemon ");
			System.out.println("1) Charizard ");
			System.out.println("2) Pikachu ");
			System.out.println("3) Lucario ");
			System.out.println("4) Squirtle ");
			opcion = leer.nextInt();
		switch(opcion){
		case 1:

			System.out.println("Tu pokemon segundo pokemon es Charizard");
						
			System.out.println(pok1);

		break;
	case 2:
		System.out.println("Tu pokemon segundo pokemon es Pikachu");
		
			System.out.println(pok2);

		break;
	case 3:
		System.out.println("Tu pokemon segundo pokemon es Lucario");
		
			System.out.println(pok3);

		break;
	case 4:
		System.out.println("Tu pokemon segundo pokemon es Squirtle");
		
			System.out.println(pok4);

	}
	//ELECCION DEL SEGUNDO JUGADOR
	System.out.println("Jugador 2 elije tu primer pokemon ");
			System.out.println("1) Charizard ");
			System.out.println("2) Pikachu ");
			System.out.println("3) Lucario ");
			System.out.println("4) Squirtle ");
			opcion = leer.nextInt();
		switch(opcion){
		case 1:

			System.out.println("Tu pokemon primer pokemon es Charizard");
						
			System.out.println(pok1);

		break;
	case 2:
		System.out.println("Tu pokemon primer pokemon es Pikachu");
		
			System.out.println(pok2);

		break;
	case 3:
		System.out.println("Tu pokemon primer pokemon es Lucario");
		
			System.out.println(pok3);

		break;
	case 4:
		System.out.println("Tu pokemon primer pokemon es Squirtle");
		 
			System.out.println(pok4);

		}
		System.out.println("Jugador 2 elije tu segundo pokemon ");
			System.out.println("1) Charizard ");
			System.out.println("2) Pikachu ");
			System.out.println("3) Lucario ");
			System.out.println("4) Squirtle ");
			opcion = leer.nextInt();
		switch(opcion){
		case 1:

			System.out.println("Tu pokemon segundo pokemon es Charizard");
						
			System.out.println(pok1);

		break;
	case 2:
		System.out.println("Tu pokemon segundo pokemon es Pikachu");
		
			System.out.println(pok2);

		break;
	case 3:
		System.out.println("Tu pokemon segundo pokemon es Lucario");
		
			System.out.println(pok3);

		break;
	case 4:
		System.out.println("Tu pokemon segundo pokemon es Squirtle");
		 
			System.out.println(pok4);

	}
}
}