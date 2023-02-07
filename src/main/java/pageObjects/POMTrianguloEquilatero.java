package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reutilizaveis.Reutilizaveis;

public class POMTrianguloEquilatero extends Reutilizaveis {
	
	WebDriver driver;
	
	public POMTrianguloEquilatero(WebDriver driver) {
		
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "a_lower_input_value")
	WebElement ladoA;
	
	@FindBy(xpath = "//tbody/tr[6]/td[2]/input[5]")
	WebElement botaoCalcular;
	
	@FindBy(xpath = "//b[contains(text(),'P = 24')]")
	WebElement verificarPerimetro;
	
	public void calcularTrianguloEquilatero(String entradaLadoA) {
		
		ladoA.sendKeys(entradaLadoA);
		botaoCalcular.click();
		
	}
	
	public void navegarParaCalculadora() {
		
		driver.get("https://pt.numberempire.com/equilateral_triangle_calculator.php");
		
	}
	
	public String verificarPerimetro() {
		
		return verificarPerimetro.getText();
		
	}
}
