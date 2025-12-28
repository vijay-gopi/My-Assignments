package week3.day2;

public class Safari extends Browser {
	 public void readerMode() {
		 System.out.println("Reader mode activated in Safari Browser");
	 }
	 public void fullScreenMode() {
		 System.out.println("Full screen expended for Safari Browser");
	 }
	 
	public static void main(String[] args) {
		Safari S= new Safari();
		S.browserName = "Apple Safari";
		S.browserVersion = 26;
		S.printBrowserDetails();
		S.openURL();
		S.fullScreenMode();
		S.readerMode();
		S.navigateBack();
		S.closeBrowser();
	}

}

