package week2.day2;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DeleteLead {
	public static void main(String[] args) {
		
	
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--guest");
	ChromeDriver driver = new ChromeDriver(option);
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.xpath("//input[@id=\"createLeadForm_companyName\"]")).sendKeys("Test Leaf");
    driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys("Gopinath");
    driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys("V");
    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8899889988");
	driver.findElement(By.name("submitButton")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.linkText("Phone")).click();
	driver.findElement(By.name("phoneNumber")).sendKeys("8899889988");	
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
    List<WebElement> leadIds = driver.findElements(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));

    String capturedLeadId = leadIds.get(0).getText();
    System.out.println("Captured Lead ID: " + capturedLeadId);

    leadIds.get(0).click();
	driver.findElement(By.linkText("Delete")).click();	
    driver.findElement(By.linkText("Find Leads")).click();
    driver.findElement(By.name("id")).sendKeys(capturedLeadId);
    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

    String resultText = driver.findElement(By.className("x-paging-info")).getText();

    if (resultText.equals("No records to display")) {
        System.out.println("Lead successfully deleted");
    } else {
        System.out.println("Lead NOT deleted");
	    driver.close();
    	}
	}
}


