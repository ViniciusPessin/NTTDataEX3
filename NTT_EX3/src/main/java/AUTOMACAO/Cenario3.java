package AUTOMACAO;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Cenario3 {
	@Test
	public void teste3() {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://advantageonlineshopping.com/");
		
		WebElement aguardar = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("see_offer_btn")));
		
		WebElement btnsearch =  driver.findElement(By.id("menuSearch"));
		btnsearch.click();
		
		WebElement txtsearch =  driver.findElement(By.id("autoComplete"));
		txtsearch.sendKeys("HP PAVILION 15Z TOUCH LAPTOP");
		
		WebElement aguardar2 = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='output']/div/div[2]/a[2]/img")));
		
		WebElement search =  driver.findElement(By.linkText("View All"));
		search.click();
		
		WebElement aguardar3 = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".AddToCard > #menuCart")));
		
		WebElement close =  driver.findElement(By.xpath("//div[@id='search']/div/div/img"));
		close.click();
		
		WebElement selecproduct =  driver.findElement(By.cssSelector(".AddToCard > #menuCart"));
		selecproduct.click();
		
		WebElement aguardar4 = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[@id='bunny'])[2]")));
		
		WebElement selecolor = driver.findElement(By.xpath("(//span[@id='bunny'])[2]"));
		selecolor.click();
		
		WebElement addMore = driver.findElement(By.cssSelector(".plus"));
		addMore.click();
		
		WebElement addCart = driver.findElement(By.name("save_to_cart"));
		addCart.click();
		
		WebElement openCart = driver.findElement(By.id("menuCart"));
		openCart.click();
		
		WebElement aguardar5 = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("checkOutButton")));
		
		WebElement openCheck = driver.findElement(By.id("checkOutButton"));
		openCheck.click();
		
		WebElement aguardar6 = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("registration_btnundefined")));
		
		String checkPrice = driver.findElement(By.xpath("//div[@id='userCart']/div[2]/label[2]/span")).getText();
		Assert.assertEquals("$899.98", checkPrice);
		
		driver.close();
	}
}
