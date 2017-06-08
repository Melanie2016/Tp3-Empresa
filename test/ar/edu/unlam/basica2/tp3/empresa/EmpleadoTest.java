package ar.edu.unlam.basica2.tp3.empresa;

import org.junit.Assert;
import org.junit.Test;

public class EmpleadoTest {
	
	
	@Test
	public void testQueSeCreeUnGerente(){
		Gerente miG = new Gerente("a25");
		miG.getCodigoCochera();
		
		String esperado = "a25";
		String obtenido = miG.getCodigoCochera();
		
		Assert.assertEquals(esperado, obtenido);
		
	}
	
	@Test
	public void testQueSeCompruebenLosDatosDeUnGerente(){
		
		Gerente miG = new Gerente("b26");
		miG.brindarDetalle("Melanie", 50000.00, "1988-04-11");
		
		String esperado1 = "Melanie";
		String obtenido1 = miG.nombre;
		Assert.assertEquals(esperado1, obtenido1);
		
		Double esperado2 = 50000.00;
		Double obtenido2 = miG.getSalario();
		Assert.assertEquals(esperado2, obtenido2);
		
		String esperado3 = "1988-04-11";
		String obtenido3 = miG.fechaCumpleaños;
		Assert.assertEquals(esperado3, obtenido3);
		
		String esperado4 = "b26";
		String obtenido4 = miG.codigoCochera;
		Assert.assertEquals(esperado4, obtenido4);
	}

	@Test
	public void testQueSeCreeUnDirector(){

	
		Director miD = new Director("c27",200.00);
		String esperado1 = "c27";
		String obtenido1 = miD.getCodigoCochera();
		Assert.assertEquals(esperado1, obtenido1);
		
		
		Double esperado2 = 200.00;
		Double obtenido2 = miD.getExtra();
		Assert.assertEquals(esperado2, obtenido2);
	}
	
	@Test
	public void testQueSeCreeUnaSecretariaConSusRespectivosDatos(){
		Empleado miS = new Secretaria();
		miS.brindarDetalle("Florencia", 80000.00, "1993-01-01");

		String esperado1 = "Florencia";
		String obtenido1 = miS.nombre;
		Assert.assertEquals(esperado1, obtenido1);

		Double esperado2 = 80000.00;
		Double obtenido2 = miS.salario;
		Assert.assertEquals(esperado2, obtenido2);

		String esperado3 = "1993-01-01";
		String obtenido3 = miS.fechaCumpleaños;
		Assert.assertEquals(esperado3, obtenido3);
	}

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
