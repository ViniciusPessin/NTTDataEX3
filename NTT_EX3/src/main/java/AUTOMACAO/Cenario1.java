package AUTOMACAO;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Cenario1 {
	@Test 
	public void teste() {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://advantageonlineshopping.com/");
		
		WebElement aguardar = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("see_offer_btn")));
		
		WebElement special =  driver.findElement(By.linkText("SPECIAL OFFER"));
		special.click();
		
		WebElement seeOffer = driver.findElement(By.id("see_offer_btn"));
		seeOffer.click();
		
		WebElement aguardar2 = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("save_to_cart")));
		
		String titulo = driver.findElement(By.xpath("//div[@id='Description']/h1")).getText();
		Assert.assertEquals("HP PAVILION 15Z TOUCH LAPTOP", titulo);
		
		String customization = driver.findElement(By.xpath("//article[2]/div/label[2]")).getText();
		Assert.assertEquals("Simplicity", customization);
		
		String display = driver.findElement(By.xpath("//div[2]/label[2]")).getText();
		Assert.assertEquals("15.6-inch diagonal Full HD WLED-backlit Display (1920x1080) Touchscreen", display);
		
		String resolution = driver.findElement(By.xpath("//div[3]/label[2]")).getText();
		Assert.assertEquals("1920x1080", resolution);
		
		String size = driver.findElement(By.xpath("//div[4]/label[2]")).getText();
		Assert.assertEquals("15.6", size);
		
		String memory = driver.findElement(By.xpath("//div[5]/label[2]")).getText();
		Assert.assertEquals("16GB DDR3 - 2 DIMM", memory);
		
		String system = driver.findElement(By.xpath("//div[6]/label[2]")).getText();
		Assert.assertEquals("Windows 10", system);
		
		String processor = driver.findElement(By.xpath("//div[7]/label[2]")).getText();
		Assert.assertEquals("AMD Quad-Core A10-8700P Processor + AMD Radeon(TM) R6 Graphics", processor);
		
		String touch = driver.findElement(By.xpath("//div[8]/label[2]")).getText();
		Assert.assertEquals("Yes", touch);
		
		String weight = driver.findElement(By.xpath("//div[9]/label[2]")).getText();
		Assert.assertEquals("5.51 lb", weight);
		
	
		driver.close();
	}
}
