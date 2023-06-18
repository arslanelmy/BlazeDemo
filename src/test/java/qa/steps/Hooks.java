package qa.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import qa.utils.Constants;

public class Hooks {
	
	
	@Before
	public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Constants.driver = new ChromeDriver();
		Constants.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		Constants.driver.manage().window().maximize();
	}

	
	
	@After
	public void tearDown() throws InterruptedException {
	
		Thread.sleep(3000);
		Constants.driver.quit();
	}
}