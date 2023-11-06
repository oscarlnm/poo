package herencia;

public class Tecnico extends Empleado{

	public Tecnico(String n, int e, double s, String z) {
		super(n, e, s);
		zona=z;
	}
	
	
	
	public String getZona() {
		return zona;
	}



	public void setZona(String zona) {
		this.zona = zona;
	}

	
	@Override
	public String toString() {
		return super.toString() + " ," + "Tecnico [zona=" + zona + "]";
	}


	@Override
	public boolean plus() {
		if(super.getEdad()<25 && this.zona.equalsIgnoreCase("zona 2")){
			double nuevoSalario = super.getSalario() + super.plus;
			super.setSalario(nuevoSalario);
			System.out.println("Se le añade un plus al técnico");
			return true;
		}
		return false;
	}
	
	private String zona;



	
	
}
