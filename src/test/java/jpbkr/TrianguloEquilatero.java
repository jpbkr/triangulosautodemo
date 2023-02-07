package jpbkr;

import org.testng.Assert;
import org.testng.annotations.Test;
import componentesTeste.TesteBase;
import pageObjects.POMTrianguloEquilatero;

public class TrianguloEquilatero extends TesteBase {
	
		@Test
		public void testeTrianguloEquilatero() {
		
		POMTrianguloEquilatero pomTrianguloEquilatero = new POMTrianguloEquilatero(driver);
		pomTrianguloEquilatero.navegarParaCalculadora();
		pomTrianguloEquilatero.calcularTrianguloEquilatero("8");
		String perimetro = pomTrianguloEquilatero.verificarPerimetro();
		Assert.assertTrue(perimetro.contains("24"));
		
	}

}


