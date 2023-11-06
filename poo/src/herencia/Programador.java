package herencia;

public class Programador extends Empleado {

	
	
	public Programador(String n, int e, double s, double comision) {
		super(n, e, s);
		this.comision=comision;
	}
	
	
	
	public double getComision() {
		return comision;
	}



	public void setComision(double comision) {
		this.comision = comision;
	}

	

	@Override
	public String toString() {
		return super.toString() + " ," + "Programador [comision=" + comision + "]";
	}



	@Override
	public boolean plus() {
		if(super.getEdad()>25 && this.comision>=100) {
			double nuevoSalario = super.getSalario() + super.plus;
			super.setSalario(nuevoSalario);
			System.out.println("Se le ha añadido el plus");
			return true;
		}
		return false;
	}
	
	private double comision;

}
