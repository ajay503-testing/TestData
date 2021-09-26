package cm.qa.TestDataMaintains;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FecthDataIntoScripts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		Demo2 demo = new Demo2();

		List<String> str1 = demo.getValues(1,"Sheet2");

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(str1.get(0));
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(str1.get(1));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(str1.get(2));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(str1.get(3));
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys(str1.get(4));
		driver.findElement(By.xpath("//button[@name='submit']")).click();
	}

}
