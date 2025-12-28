package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver driver1=new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());	

	}

}
