package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-NZ&.intl=nz&.done=https%3A%2F%2Fnz.mail.yahoo.com%2Fd");
		boolean checkbox = driver.findElement(By.id("persistent")).isSelected();
		if(checkbox==true)
		{
			driver.findElement(By.id("persistent")).click();
		}
	}

}
