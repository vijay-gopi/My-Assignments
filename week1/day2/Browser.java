package week1.day2;

public class Browser {
	public void launchBrowser(String browserName) {
		
		browserName= "Chrome";
		System.out.println(browserName);
	}
	public String loadUrl() {
		return "Url loaded successfully";
	}

	public static void main(String[] args) {
		Browser a = new Browser();
		
		a.launchBrowser("chrome");
		System.out.println(a.loadUrl());
		
	}

}
