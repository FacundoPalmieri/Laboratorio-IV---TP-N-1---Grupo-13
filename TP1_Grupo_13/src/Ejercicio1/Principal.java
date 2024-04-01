package Ejercicio1;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Empleado emp = new Empleado();
		
		emp.setNombre("Carlos");
		emp.setEdad(25);
		
		Empleado emp1 = new Empleado("Ernesto",45);	
		
		Empleado emp2 = new Empleado();
		
		emp2.setNombre("Lucas");
		emp2.setEdad(20);
		
		Empleado emp3 = new Empleado();
		
		emp3.setNombre("Juan");
		emp3.setEdad(35);
		
		Empleado emp4 = new Empleado("Pedro",29);
		
		System.out.println(emp.toString());
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		System.out.println(emp4.toString());

	}



	
}
