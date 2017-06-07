package ar.edu.unlam.basica2.tp3.empresa;

import org.junit.Assert;
import org.junit.Test;

public class EmpleadoTest {
	
	@Test
	public void testQueSeCreeUnIngenieroConSusRespectivosDatos(){
		
		Empleado miI = new Ingeniero();
		miI.brindarDetalle("Matias", 24000.00, "1994-03-22");

		String esperado1 = "Matias";
		String obtenido1 = miI.nombre;
		Assert.assertEquals(esperado1, obtenido1);

		Double esperado2 = 24000.00;
		Double obtenido2 = miI.salario;
		Assert.assertEquals(esperado2, obtenido2);

		String esperado3 = "1994-03-22";
		String obtenido3 = miI.fechaCumpleaños;
		Assert.assertEquals(esperado3, obtenido3);
	}
}
