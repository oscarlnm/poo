package herencia;

public class Empleados {

	public static void main(String[] args) {
		Empleado Empleado1 = new Programador("Alex", 26, 1100, 100);
		Empleado Empleado2 = new Tecnico("Ramón", 22, 1000, "zona 2");
		
		Empleado1.plus();
		Empleado2.plus();
		
		System.out.println(Empleado1);
		System.out.println(Empleado2);

	}

}
