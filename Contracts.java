package SalesForce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contracts {
	@Test
	public void contracts() {
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
		opt.sendKeys("contracts");

		WebElement contract = driver.findElement(By.xpath("(//mark[text()='Contracts'])[1]"));
		contract.click();

		WebElement newContract = driver.findElement(By.xpath("//div[text()='New']"));
		newContract.click();

		WebElement account = driver.findElement(By.xpath("(//input[@role='combobox'])[1]"));
		account.click();

		WebElement name = driver.findElement(By.xpath("//div[@title='name']"));
		name.click();

		WebElement date = driver.findElement(By.xpath("(//input[@class=' input'])[1]"));
		date.sendKeys("05/05/2023");

		WebElement duration = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		duration.sendKeys("3");

		WebElement save = driver.findElement(By.xpath("(//span[text()='Save'])[2]"));
		save.click();

		WebElement num = driver.findElement(By.xpath("(//span[@class='uiOutputText'])[1]"));
		num.getText();
		System.out.println(num);
	}
}