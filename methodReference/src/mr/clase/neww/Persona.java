package mr.clase.neww;

public class Persona {
	
	int id;
	String nombre;
	
	Persona(){
		nombre = "Sin nombre";
		System.out.println("Constructor 0 Parámetros");
	}
	
	public Persona(int id) {
		this.id = id;
		nombre = "Sin nombre";
		System.out.println("Constructor 1 Parámetro");
	}

	
	public Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		System.out.println("Constructor 2 Parámetros");
	}

	public Persona(StringBuilder sb, int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		System.out.println("Constructor 3 Parámetros");
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
