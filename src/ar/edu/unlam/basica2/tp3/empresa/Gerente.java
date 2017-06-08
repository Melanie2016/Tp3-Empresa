package ar.edu.unlam.basica2.tp3.empresa;

public class Gerente extends Empleado{
	protected String codigoCochera;
	
	public Gerente(String codigoCochera) {
		this.codigoCochera = codigoCochera;
	}
	
	@Override
	public void brindarDetalle(String nombre, Double salario, String fechaC) {
		this.nombre = nombre;
		this.salario = salario;
		this.fechaCumpleaños = fechaC;
		this.getCodigoCochera();
		
	}

	public String getCodigoCochera() {
		return codigoCochera;
	}

	public void setCodigoCochera(String codigoCochera) {
		this.codigoCochera = codigoCochera;
	}
	
	
	
	

}
