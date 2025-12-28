package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_companyName\"]")).sendKeys("Test Leaf");
        driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys("Gopinath");
        driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys("V");
        driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstNameLocal\"]")).sendKeys("Gopi");
        driver.findElement(By.xpath("//input[@id=\"createLeadForm_departmentName\"]")).sendKeys("Selenium");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning week 2 of Selenium");
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8899889988");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gopi296@gmail.com");
        WebElement State_Province=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select s1=new Select(State_Province);
        s1.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.xpath("//textarea[@id=\"updateLeadForm_description\"]")).clear();
        driver.findElement(By.xpath("//textarea[@id=\"updateLeadForm_importantNote\"]")).sendKeys("Updated Text");
        driver.findElement(By.xpath("//input[@name=\"submitButton\"]")).click();
        System.out.println(driver.getTitle());
        driver.close();    
	}

}
