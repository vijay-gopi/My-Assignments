package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();

		option.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(option);
		
		//ChromeDriver driver=new ChromeDriver();
		//ChromeOptions option= new ChromeOptions();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gopinath");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium Tester.");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());	
		driver.close();
	}

}
