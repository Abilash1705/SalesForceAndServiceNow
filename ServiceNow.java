package own;



import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev140474.service-now.com");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("P-qQ7@umSYz8");
		driver.findElement(By.id("sysverb_login")).click();
		driver.switchTo().defaultContent();

		WebElement filter = driver.findElement(By.id("filter"));
		filter.sendKeys("Knowledge");
		Thread.sleep(2000);
		filter.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Knowledge']")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//button[@class='btn btn-primary']/span)[1]")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("lookup.kb_knowledge.kb_knowledge_base")).click();
		
		Set<String> windowHandle0 = driver.getWindowHandles();
		List<String> windowHandle1=new ArrayList<String>(windowHandle0);
		driver.switchTo().window(windowHandle1.get(1));
		
		driver.findElement(By.linkText("IT")).click();
		
		Set<String> windowHandle2 = driver.getWindowHandles();
		List<String> windowHandle3=new ArrayList<String>(windowHandle2);
		driver.switchTo().window(windowHandle3.get(0));
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("kb_knowledge.short_description")).sendKeys("hlo bro");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}
	}
		
		
		










