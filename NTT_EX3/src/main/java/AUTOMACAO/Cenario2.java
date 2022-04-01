package AUTOMACAO;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Cenario2 {
	@Test 
	public void teste2() {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://advantageonlineshopping.com/");
		
		WebElement aguardar = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("see_offer_btn")));
		
		WebElement special =  driver.findElement(By.linkText("SPECIAL OFFER"));
		special.click();
		
		WebElement seeOffer = driver.findElement(By.id("see_offer_btn"));
		seeOffer.click();
		
		WebElement aguardar2 = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("save_to_cart")));
		
		WebElement selecolor = driver.findElement(By.xpath("(//span[@id='bunny'])[3]"));
		selecolor.click();
		
		WebElement addCart = driver.findElement(By.name("save_to_cart"));
		addCart.click();
		
		WebElement openCart = driver.findElement(By.id("menuCart"));
		openCart.click();
		
		WebElement aguardar3 = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("checkOutButton")));
		
		WebElement openCheck = driver.findElement(By.id("checkOutButton"));
		openCheck.click();
		
		WebElement aguardar4 = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("registration_btnundefined")));
		
		String checkColor = driver.findElement(By.xpath("(//tr[@id='product']/td[2]/a/label[2]/span)[2]")).getText();
		Assert.assertEquals("GRAY", checkColor);
		
		
		driver.close();
	}
}
