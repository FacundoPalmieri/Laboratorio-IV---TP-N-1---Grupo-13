package Ejercicio1;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Empleado emp = new Empleado();
			
		Empleado emp1 = new Empleado("Ernesto",45);	
		
		Empleado emp2 = new Empleado();
		
		Empleado emp3 = new Empleado("Juan",35);
	
		Empleado emp4 = new Empleado();
		
		Empleado emp5 = new Empleado();
	
		
		System.out.println(emp.toString());
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		System.out.println(emp4.toString());
		System.out.println(emp5.toString());
	
		
		Empleado.devuelveProximoID();

	}



	
}
