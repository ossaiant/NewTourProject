package newUsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Registration {

	@Test
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mcanthony\\Desktop\\browserdrivere\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Tommy");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Stan");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("+447353748");
		driver.findElement(By.xpath("/html//input[@id='userName']")).sendKeys("angelo.8520a775@nicoric.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("11 Learning Road");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("Upper Town");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Selenium City");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("New York");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("235457");
		driver.findElement(By.xpath("//select[@name='country']")).sendKeys("UNITED KINGDOM");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tomqa1");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("A123456?");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("A123456?");
		driver.findElement(By.xpath("//input[@name='register']")).click();
		driver.quit();
		
		
	}
}
