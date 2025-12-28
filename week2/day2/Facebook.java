package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook 
{

	public static void main(String[] args) 
	{
		ChromeOptions option = new ChromeOptions();
		
        option.addArguments("--guest");

        ChromeDriver driver = new ChromeDriver(option);
        
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Gopinath");
        driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("V");
        driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("9988998767");
        driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("@Gopi2025");
        
        WebElement day=driver.findElement(By.xpath("//select[@id=\"day\"]"));
        Select s1=new Select(day);
        s1.selectByVisibleText("3");
        
        WebElement month=driver.findElement(By.xpath("//select[@id=\"month\"]"));
        Select s2=new Select(month);
        s2.selectByVisibleText("Oct");
        
        WebElement year=driver.findElement(By.xpath("//select[@id=\"year\"]"));
        Select s3=new Select(year);
        s3.selectByVisibleText("1998");
        
        //driver.findElement(By.linkText("Male")).click();
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

}