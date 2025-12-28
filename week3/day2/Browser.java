package week3.day2;

public class Browser {
	
    String browserName;
    double browserVersion;
	
	 public void openURL() {
		 System.out.println("Oening the URL");
	 }
	 public void closeBrowser() {
		 System.out.println("Closing the browser");
	 }
	 public void navigateBack() {
		 System.out.println("Navigating back");
	 }
	    public void printBrowserDetails() {
	        System.out.println("Browser Name : " + browserName);
	        System.out.println("Browser Version : " + browserVersion);
	    }

}
