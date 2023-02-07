package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reutilizaveis.Reutilizaveis;

public class POMTrianguloEscaleno extends Reutilizaveis {
	
	WebDriver driver;
	
	public POMTrianguloEscaleno(WebDriver driver) {
		
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id = "a_lower_input_value")
	WebElement ladoA;
	
	@FindBy(id = "b_lower_input_value")
	WebElement ladoB;
	
	@FindBy(id = "c_lower_input_value")
	WebElement ladoC;
	
	@FindBy(xpath = "//tbody/tr[10]/td[2]/input[5]")
	WebElement botaoCalcular;
	
	@FindBy(xpath = "//b[contains(text(),'A = 6')]")
	WebElement verificarArea;
	
	public void calcularTrianguloEscaleno(String entradaLadoA, String entradaLadoB, String entradaLadoC) {
		
		ladoA.sendKeys(entradaLadoA);
		ladoB.sendKeys(entradaLadoB);
		ladoC.sendKeys(entradaLadoC);
		botaoCalcular.click();
		
	}
	
	public void navegarParaCalculadora() {
		
		driver.get("https://pt.numberempire.com/arbitrary_triangle_calculator.php");
		
	}
	
	public void scrollDown() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,300)");
		
	}
	
	public String verificarArea() {
		
		return verificarArea.getText();
		
	}
}
