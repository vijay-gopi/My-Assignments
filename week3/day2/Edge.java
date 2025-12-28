package week3.day2;

public class Edge extends Browser {
	 public void takeSnap() {
		 System.out.println("Screenshot saved from Edge Browser");
	 }
	 public void clearCookies() {
		 System.out.println("Clearing Cookies of Edge Browser");
	 }
	 
	public static void main(String[] args) {
		Edge E= new Edge();
		E.browserName = "Microsoft Edge";
		E.browserVersion =  143.0;
		E.printBrowserDetails();
		E.openURL();
		E.clearCookies();
		E.takeSnap();
		E.navigateBack();
		E.closeBrowser();

	}

}

