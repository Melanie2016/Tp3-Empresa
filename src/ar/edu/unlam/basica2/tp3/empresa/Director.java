package ar.edu.unlam.basica2.tp3.empresa;

public class Director extends Gerente {
	
	private Double extra;
	
	public Director(String codigoCochera, Double extra) {
		super(codigoCochera);
		this.extra = extra;
	}

	@Override
	public void brindarDetalle(String nombre, Double salario, String fechaC) {
		this.salario = salario + this.extra;

	}

	public Double getExtra() {
		return extra;
	}

	public void setExtra(Double extra) {
		this.extra = extra;
	}

}
