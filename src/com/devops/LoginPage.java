package com.devops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class LoginPage {
	
	WebDriver driver;
	
	public void test() throws InterruptedException{
		//System.setProperty("webdriver.gecko.driver",".\\browsers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver",".\\browsers\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		driver.get("http://localhost:9090/My/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='Email_id']")).sendKeys("vvrsekhar456@gmail.com");
		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("12324");
		driver.findElement(By.xpath("html/body/div[1]/form/a")).click();
		System.out.println("Register button clicked successfully");
		Thread.sleep(2000);
	}
	
	public void register()
	{
		driver.findElement(By.xpath(".//*[@id='t1']")).sendKeys("rajasekhar");
		driver.findElement(By.xpath(".//*[@id='t2']")).sendKeys("v.v");
		driver.findElement(By.xpath(".//*[@id='t9']")).sendKeys("organization");
		driver.findElement(By.xpath(".//*[@id='t3']")).sendKeys("vvrsekhar5@gmail.com");
		driver.findElement(By.xpath(".//*[@id='t4']")).sendKeys("rajasekhar");
		driver.findElement(By.xpath(".//*[@id='t5']")).sendKeys("9059970118");
		driver.findElement(By.xpath(".//*[@id='t6']")).sendKeys("ammerpet");
		driver.findElement(By.xpath(".//*[@id='t7']")).sendKeys("hyderabad");
		driver.findElement(By.xpath(".//*[@id='t8']")).sendKeys("500009");												
		System.out.println("Details entered successfully");		
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException
	
	{
		LoginPage log = new LoginPage();
		log.test();
		log.register();
		System.out.println("Testing completed");
		
	}
}
