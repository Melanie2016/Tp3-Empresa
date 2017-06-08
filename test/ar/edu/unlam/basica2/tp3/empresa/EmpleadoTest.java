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
	public void testQueSeCompruebenLosDatosDeUnDirector(){
		
		Director miD = new Director("d28",3000.00);
		miD.brindarDetalle("Pablo", 34000.00, "1995-07-16");
		
		String esperado1 = "Pablo";
		String obtenido1 = miD.nombre;
		Assert.assertEquals(esperado1, obtenido1);
		
		String esperado3 = "1995-07-16";
		String obtenido3 = miD.fechaCumpleaños;
		Assert.assertEquals(esperado3, obtenido3);
		
		String esperado4 = "d28";
		String obtenido4 = miD.codigoCochera;
		Assert.assertEquals(esperado4, obtenido4);
		
	}
	
	@Test
	public void crearUnDirectorYComprobarQueRecibaSuExtra() {

		Director miD = new Director("e29",1200.00);
		miD.brindarDetalle("Gonzalo", 45000.00, "1999-01-21");

		Double esperado = 46200.00;
		Double obtenido = miD.salario;

		Assert.assertEquals(esperado, obtenido);

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
	
	@Test
	public void testQueSeCobreImpuestoSiElSalarioSuperaElTope(){
		
		DonBarriga miBarriga = new DonBarriga();
		Empleado miG =  new Gerente("f30");
		miG.brindarDetalle("Maria", 40000.00, "1993-11-03");
		
		Double esperado = 39000.00;
		Double obtenido = miBarriga.obtenerImpuesto(miG);

		Assert.assertEquals(esperado,obtenido);
	}
	
	@Test
	public void testQueNoSeCobreImpuestoSiNoSeSuperaElTope(){
		
		DonBarriga miBarriga = new DonBarriga();
		Empleado miD = new Director("g31",5000.00);
		miD.brindarDetalle("Mani", 25000.00,"1999-10-05");
		
		Double esperado = 30000.00;
		Double obtenido = miBarriga.obtenerImpuesto(miD);
		
		Assert.assertEquals(esperado,obtenido);

	}
	
	
}
