import java.util.*;

public class Pokemon {
	
	
	Random r = new Random();
	private String nombre;
	private	int vida ;
	private String estado = "vivo"; 

	public Pokemon(String nombrePok, int vidaPok, String estadoPok) {
		nombre = nombrePok;
		vida = vidaPok;
		estado = estadoPok;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getVida() {
		return vida;
	}
	public String getEstado() {
		return estado; 
	}
	public int atacar() {
		
		int ataque = r.nextInt(20) + 5;
				
		System.out.println("Ataque conseguido: " + ataque + " puntos");
		return ataque;
	}
	
	public void perderVida(int ataque) {
		vida -= ataque;
	}
	
	public String toString() {
		return " \n Nombre: " +  nombre + "\n Vida: " +  vida + "\n Estado:" + estado; 
	}

}