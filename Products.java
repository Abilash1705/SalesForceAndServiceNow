package SalesForce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Products {
	@Test
	public static void products() {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();

		WebElement menu = driver.findElement(By.xpath("(//button[@type='button'])[7]"));
		menu.click();

		WebElement viewall = driver.findElement(By.xpath("//button[text()='View All']"));
		viewall.click();

		WebElement opt = driver.findElement(By.xpath("//input[@class='slds-input']"));
		opt.sendKeys("products");
		
		WebElement product = driver.findElement(By.xpath("//mark[text()='Products']"));
		product.click();
		
		WebElement newButton = driver.findElement(By.xpath("//div[@title='New']"));
		newButton.click();
		
		WebElement productInfo = driver.findElement(By.xpath("(//input[@class=' input'])[1]"));
		productInfo.sendKeys("mob");
		
		WebElement save = driver.findElement(By.xpath("(//span[text()='Save'])[2]"));
		save.click();
		
		WebElement text = driver.findElement(By.xpath("(//span[@class='uiOutputText'])[1]"));
		text.getText();
		System.out.println(text);
	}
}