package ar.edu.unlam.basica2.tp3.empresa;

public class DonBarriga {
	
	
	private static final Double RECARGO = 1000.00;
	private static final Double TOPE = 30000.00;
	private Empleado empleado;                  
	
	
	
	public Double obtenerImpuesto(Empleado empleado){
		this.empleado = empleado;
		
		if(this.empleado.getSalario()>TOPE){
			this.empleado.salario = this.empleado.getSalario() - RECARGO;
		}
		return this.empleado.salario;
		
	}
}
