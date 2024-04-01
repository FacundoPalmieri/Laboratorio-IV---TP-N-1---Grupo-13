package Ejercicio1;

public class Empleado {

	private static int cont = 1000;
	private final int id;
	private String nombre;
	private int edad;
	
	

	//constructor
	
	public Empleado() {
		id = cont;
		nombre= "sin nombre";
		edad=99;
		cont ++;
	}
	
	public Empleado(String Nombre, int Edad) {
		id = cont;
		nombre = Nombre;
		edad = Edad;
		cont ++;
	}
	
	//getters y setters
	public int getId() {
		return id;
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
	
	public static int devuelveProximoID() {
		return cont;
	}
}


