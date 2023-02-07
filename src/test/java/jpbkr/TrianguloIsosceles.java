package jpbkr;

import org.testng.Assert;
import org.testng.annotations.Test;
import componentesTeste.TesteBase;
import pageObjects.POMTrianguloIsosceles;

public class TrianguloIsosceles extends TesteBase {

	@Test
	public void testeTrianguloIsosceles() {
		
		POMTrianguloIsosceles pomTrianguloIsosceles = new POMTrianguloIsosceles(driver);
		pomTrianguloIsosceles.navegarParaCalculadora();
		pomTrianguloIsosceles.calcularTrianguloIsosceles("10", "12");
		String area = pomTrianguloIsosceles.verificarArea();
		Assert.assertTrue(area.contains("48"));
		
	}

}

