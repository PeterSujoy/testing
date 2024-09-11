package com.CSEA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class App{
	WebDriver driver;
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ACER\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.coursera.org");
		driver.findElement(By.xpath("//*[@id=\"search-autocomplete-input\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"search-autocomplete-input\"]")).sendKeys("DevOps");
		driver.findElement(By.xpath("//*[@id=\"rendered-content\"]/div/header/div/div/div[2]/div/div/div/div[1]/div[3]/div/form/div/button[2]/div")).click();
		driver.close();
		}
	
}
