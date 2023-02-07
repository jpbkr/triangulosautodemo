package jpbkr;

import org.testng.Assert;
import org.testng.annotations.Test;
import componentesTeste.TesteBase;
import pageObjects.POMTrianguloEscaleno;

public class TrianguloEscaleno extends TesteBase {

	@Test
	public void testeTrianguloEscaleno() {
		
		POMTrianguloEscaleno pomTrianguloEscaleno = new POMTrianguloEscaleno(driver);
		pomTrianguloEscaleno.navegarParaCalculadora();
		pomTrianguloEscaleno.scrollDown();
		pomTrianguloEscaleno.calcularTrianguloEscaleno("3", "4", "5");
		String area = pomTrianguloEscaleno.verificarArea();
		Assert.assertTrue(area.contains("6"));
	
	}

}
