package com.test.cnn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CnnTurnerTest {

		public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/pxr8411/Documents/ChromeDriver/chromedriver.exe");				
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.cnn.com/");
		driver.manage().window().maximize();
		
		//To verify whether the Header is displayed or not
		try{

			WebElement header = driver.findElement(By.xpath(".//*[@id='cnn_hdr-main']")); 
			Assert.assertTrue(header.isDisplayed(), "The Header section is displayed");
			System.out.println("The Header section is displayed - PASS");

			}catch(Exception e){

			Assert.fail("The Header section is not displayed");
		}		
		
		//To verify whether the Footer is displayed or not
		try{

			WebElement footer = driver.findElement(By.xpath(".//*[@id='cnn_ftrcntntinner']")); 
			Assert.assertTrue(footer.isDisplayed(), "The Footer section is displayed");
			System.out.println("The Footer section is displayed - PASS");

			}catch(Exception e){

			Assert.fail("The Header Footer is not displayed");
		}
				
		//To verify whether the Weather module is displayed or not
		try{

			WebElement weather = driver.findElement(By.xpath(".//*[@id='pmWeather']")); 
			Assert.assertTrue(weather.isDisplayed(), "The Weather module is displayed");
			System.out.println("The Weather module is displayed - PASS");

			}catch(Exception e){

			Assert.fail("The Weather module is not displayed");
		}
		
		//To verify whether the Market module is displayed or not
		try{

			WebElement market = driver.findElement(By.xpath(".//*[@id='pmMarkets']")); 
			Assert.assertTrue(market.isDisplayed(), "The Market module is displayed");
			System.out.println("The Market module is displayed - PASS");

			}catch(Exception e){

			Assert.fail("The Market module is not displayed");
		}
		
		driver.quit();
						
	}

}
