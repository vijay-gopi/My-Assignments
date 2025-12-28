package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Gopinath");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		WebElement industry=driver.findElement(By.name("industryEnumId"));
        Select sel=new Select(industry);
        sel.selectByVisibleText("Computer Software");
        
        WebElement Ownership=driver.findElement(By.name("ownershipEnumId"));
        Select sel1=new Select(Ownership);
        sel1.selectByVisibleText("S-Corporation");
        
        WebElement Source=driver.findElement(By.id("dataSourceId"));
        Select sel2=new Select(Source);
        sel2.selectByValue("LEAD_EMPLOYEE");
        
        WebElement Marketing_Campaign=driver.findElement(By.id("marketingCampaignId"));
        Select sel3=new Select(Marketing_Campaign);
        sel3.selectByIndex(6);
        
        WebElement State_Province=driver.findElement(By.id("generalStateProvinceGeoId"));
        Select sel4=new Select(State_Province);
        sel4.selectByValue("TX");
        
		driver.findElement(By.id("numberEmployees")).sendKeys("33");
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
        driver.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();
		System.out.println(driver.getTitle());	
		driver.close();
	}

}
