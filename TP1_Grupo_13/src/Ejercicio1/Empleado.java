package Ejercicio1;

public class Empleado {
	private int id;
	private String nombre;
	private int edad;
	
	//constructor
	
	public Empleado() {
		id=1000;
		nombre= "sin nombre";
		edad=0;
	}
	
	//getters y setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}


