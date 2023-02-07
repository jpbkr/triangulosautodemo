package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reutilizaveis.Reutilizaveis;

public class POMTrianguloIsosceles extends Reutilizaveis {
	
	WebDriver driver;
	
	public POMTrianguloIsosceles(WebDriver driver) {
		
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "a_lower_input_value")
	WebElement ladoA;
	
	@FindBy(id = "b_lower_input_value")
	WebElement ladoB;
	
	@FindBy(xpath = "//tbody/tr[9]/td[2]/input[5]")
	WebElement botaoCalcular;
	
	@FindBy(xpath = "//b[contains(text(),'A = 48')]")
	WebElement verificarArea;
	
	public void calcularTrianguloIsosceles(String entradaLadoA, String entradaLadoB) {
		
		ladoA.sendKeys(entradaLadoA);
		ladoB.sendKeys(entradaLadoB);
		botaoCalcular.click();
		
	}
	
	public void navegarParaCalculadora() {
		
		driver.get("https://pt.numberempire.com/isosceles_triangle_calculator.php");
		
	}
	
	public String verificarArea() {
		
		return verificarArea.getText();
		
	}
}
