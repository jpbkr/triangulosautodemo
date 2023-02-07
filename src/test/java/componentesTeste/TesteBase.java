package componentesTeste;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TesteBase {

public WebDriver driver;
	
public WebDriver iniciarDriver() throws IOException {
		
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//recursos//GlobalData.properties");
		properties.load(fis);
		String nomeBrowser = properties.getProperty("browser");
		
		if(nomeBrowser.equalsIgnoreCase("chrome")) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		return driver;
}
	@BeforeMethod
	public void iniciarAplicacao() throws IOException{
	
	driver = iniciarDriver();

	}
	
	@AfterMethod
	public void fecharAplicacao() {
		
	driver.close();
	
	}
}
