package ar.edu.unlam.basica2.tp3.empresa;

public abstract class Empleado {
	
	protected String nombre;
	protected Double salario;
	protected String fechaCumpleaños;
	

	public abstract void brindarDetalle(String nombre,Double salario,String fechaC);
	

	
	
	
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}

}
