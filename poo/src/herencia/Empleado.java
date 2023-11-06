package herencia;

public abstract class Empleado {
	
	public Empleado(String n, int e, double s) {
		nombre=n;
		edad=e;
		salario=s;
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + "]";
	}

	public abstract boolean plus();
	
	
	
	private String nombre;
	private int edad;
	private double salario;
	public final double plus = 300;
}
