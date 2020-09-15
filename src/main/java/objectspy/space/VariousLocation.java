package objectspy.space;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class VariousLocation {
WebDriver driver;

    @Before
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("http://objectspy.space/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
	}
	@Test
	public void LearnLoctore() {
		driver.findElement(By.name("firstname")).sendKeys("abc");
		driver.findElement(By.id("sex-0")).click();
		//driver.findElement(By.className("input-file")).click();
		
		
		//driver.findElement(By.partialLinkText("Producy Backend")).click();
		
		//driver.findElement(By.cssSelector("input"))
		
		driver.findElement(By.cssSelector("input#exp-2")).click();
		driver.findElement(By.cssSelector("input[value='Selenium Webdriver']")).click();
		
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("Selenium is fun");
		driver.findElement(By.xpath("//input[@name='profession'and @id='profession-0']")).click();
		//driver.findElement(By.xpath("//strong[text()='Link Test : Page Change']")).click();
		
		
	}
	@After
	public void tearDown() {
		//driver.close();
		//driver.quit();
	}

}
