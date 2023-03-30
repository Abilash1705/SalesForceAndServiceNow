package own;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceCat {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://dev140572.service-now.com\r\n");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.switchTo().frame(0);
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();
		WebElement filter = driver.findElement(By.id("filter"));
		filter.sendKeys("Service Cate");
		driver.findElement(By.xpath("//div[text()='My Service Categories']")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement dept = driver.findElement(By.xpath("//input[@id='sys_display.IO:7406637b47701100ba13a5554ee49012']"));
		dept.clear();
		dept.sendKeys("cust"+Keys.ENTER);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("gsft_main");
		
		









	}

}
