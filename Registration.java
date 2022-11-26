package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("firstName")).sendKeys("ABIN");
		driver.findElement(By.name("lastName")).sendKeys("SABU");
		driver.findElement(By.name("phone")).sendKeys("9567178711");
		driver.findElement(By.id("userName")).sendKeys("abin2518@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("6 drinkwater rd");
		driver.findElement(By.name("city")).sendKeys("Brampton");
		driver.findElement(By.name("state")).sendKeys("Ontario");
		driver.findElement(By.name("postalCode")).sendKeys("L6Y4T6");
		driver.findElement(By.id("email")).sendKeys("abin2518@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Qwerty123");
		driver.findElement(By.name("confirmPassword")).sendKeys("Qwerty123");
		driver.findElement(By.name("submit")).click();
	}

}
