package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LearnDD {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();

		option.addArguments("--guest");

		ChromeDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gopinath");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Selenium Tester.");
		WebElement sourceDD =driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel=new Select(sourceDD);
		sel.selectByIndex(3);
		
		WebElement mcDD=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
    	Select sel1=new Select(mcDD);
    	sel1.selectByVisibleText("eCommerce Site Internal Campaign");
    	
    	WebElement ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
    	Select sel2=new Select(ownership);
    	sel2.selectByValue("OWN_PUBLIC_CORP");
		
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());	
		driver.close();
	}

}
