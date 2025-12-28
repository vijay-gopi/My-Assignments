package week3.day2;

public class Chrome extends Browser{
	 public void openIncognito() {
		 System.out.println("Oening the Incognito tab from Chrome Browser");
	 }
	 public void clearCache() {
		 System.out.println("Clearing the Cache of Chrome Browser");
	 }
	 
	public static void main(String[] args) {
		Chrome C= new Chrome();
		C.browserName = "Google Chrome";
		C.browserVersion = 143.0;
		C.printBrowserDetails();
		C.openIncognito();
		C.clearCache();
		C.openURL();
		C.closeBrowser();
		C.navigateBack();

	}                                 
                                                       
}
